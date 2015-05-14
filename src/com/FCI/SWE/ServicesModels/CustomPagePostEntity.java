package com.FCI.SWE.ServicesModels;

import java.util.List;
import java.util.Vector;

import com.FCI.SWE.Services.CustomPagePost;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class CustomPagePostEntity {
	
	private String UserName;
	private String Content;
	private String Privacy;
	private int Likes;
	private String PageName;
	private int Seen;
	
	

	public CustomPagePostEntity(String userName, String content,
			String privacy, int likes, String pageName, int seen) {
		super();
		UserName = userName;
		Content = content;
		Privacy = privacy;
		Likes = likes;
		PageName = pageName;
		Seen = seen;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getPrivacy() {
		return Privacy;
	}

	public void setPrivacy(String privacy) {
		Privacy = privacy;
	}

	public int getLikes() {
		return Likes;
	}

	public void setLikes(int likes) {
		Likes = likes;
	}

	public String getPageName() {
		return PageName;
	}

	public void setPageName(String pageName) {
		PageName = pageName;
	}

	public int getSeen() {
		return Seen;
	}

	public void setSeen(int seen) {
		Seen = seen;
	}

	public static boolean save(CustomPagePost customPagePost) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("CustomPagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("CustomPagePostEntity", list.size() + 1);
		System.out.println(customPagePost.getWho_see());
		group.setProperty("UserName", customPagePost.getUserName());
		group.setProperty("Content", customPagePost.getContent());
		group.setProperty("Likes",customPagePost.getLikes());
		group.setProperty("Privacy", customPagePost.getPrivacy());
		group.setProperty("WhoCanSee", customPagePost.getWho_see());
		group.setProperty("PageName", customPagePost.getPageName());
		group.setProperty("PostSeen", customPagePost.getSeen());
		
		if(datastore.put(group).isComplete())
			return true;
		else return false;
	}

	public static Vector<CustomPagePostEntity> checkaccess(String pname, String uname) {
		Vector<CustomPagePostEntity> list = new Vector<CustomPagePostEntity>();
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("name: "+uname);
		Query gaeQuery = new Query("CustomPagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		for (Entity entity : pq.asIterable()) {
			System.out.println(entity.getProperty("WhoCanSee").toString());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
			String a=PageEntity.get(pname);
			if(entity.getProperty("WhoCanSee").toString().contains(uname)||a.equals(uname))
			{
				
				if(a.equals(uname)){
					long key=entity.getKey().getId();
					CustomPagePostEntity p=new CustomPagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
							,entity.getProperty("Privacy").toString()
							,Integer.parseInt(entity.getProperty("Likes").toString())
							,entity.getProperty("PageName").toString(),Integer.parseInt(entity.getProperty("PostSeen").toString()));	
					increaseSeen(key);
					list.add(p);
				
				}	
				else{
					long key=entity.getKey().getId();
					CustomPagePostEntity p=new CustomPagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
							,entity.getProperty("Privacy").toString()
							,Integer.parseInt(entity.getProperty("Likes").toString())
							,entity.getProperty("PageName").toString(),1);	
					increaseSeen(key);
					list.add(p);
				}
				
						
				
<<<<<<< HEAD
=======
=======
			if(entity.getProperty("WhoCanSee").toString().contains(uname))
			{
				long key=entity.getKey().getId();
						
				CustomPagePostEntity p=new CustomPagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
						,entity.getProperty("Privacy").toString()
						,Integer.parseInt(entity.getProperty("Likes").toString())
						,entity.getProperty("PageName").toString(),1);	
				increaseSeen(key);
				list.add(p);
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
				
				
			   }
			}
	
	return list;
		
	}
	
	
	
	public static void increaseSeen(long ID){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("CustomPagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());
		for (Entity entity : pq.asIterable()) {
			long key=entity.getKey().getId();
			if (key==ID) {
				
				Entity group = new Entity("CustomPagePostEntity", key);
				PrivatePagePostEntity p=new PrivatePagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
						,entity.getProperty("Privacy").toString()
						,Integer.parseInt(entity.getProperty("Likes").toString())
						,entity.getProperty("PageName").toString(),Integer.parseInt(entity.getProperty("PostSeen").toString()));
				
				group.setProperty("UserName", p.getUserName());
				group.setProperty("Content", p.getContent());
				group.setProperty("Likes",p.getLikes());
				group.setProperty("Privacy", p.getPrivacy());
				group.setProperty("PageName", p.getPageName());
				group.setProperty("PostSeen", (p.getSeen()+1));
<<<<<<< HEAD
				group.setProperty("WhoCanSee", (p.getSeen()+1));
=======
<<<<<<< HEAD
				group.setProperty("WhoCanSee", (p.getSeen()+1));
=======
				
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
				datastore.put(group);
				
			}
	
		}


	}


}
