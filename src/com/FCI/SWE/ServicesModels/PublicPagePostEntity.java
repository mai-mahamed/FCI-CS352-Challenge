package com.FCI.SWE.ServicesModels;

import java.util.List;
import java.util.Vector;

import com.FCI.SWE.Services.PublicPagePost;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PublicPagePostEntity {


	private String UserName;
	private String Content;
	private String Privacy;
	private int Likes;
	private String PageName;
	private int PostSeen;



	
	
	public PublicPagePostEntity(String userName, String content,
			String privacy, int likes, String pageName, int seen) {
		super();
		UserName = userName;
		Content = content;
		Privacy = privacy;
		Likes = likes;
		PageName = pageName;
		PostSeen = seen;
	}

<<<<<<< HEAD
	/**
	 * 
	 * @param publicPagePost : page's posts with public privacy
	 * @return saving page's posts with public privacy
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public static boolean save(PublicPagePost publicPagePost) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("PublicPagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("PublicPagePostEntity", list.size() + 1);

		group.setProperty("UserName", publicPagePost.getUserName());
		group.setProperty("Content", publicPagePost.getContent());
		group.setProperty("Likes",publicPagePost.getLikes());
		group.setProperty("Privacy", publicPagePost.getPrivacy());
		group.setProperty("PageName", publicPagePost.getPageName());
		group.setProperty("PostSeen", publicPagePost.getSeen());
		
		if(datastore.put(group).isComplete())
			{
			return true;}
		else return false;
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
		return PostSeen;
	}

	public void setSeen(int seen) {
		PostSeen = seen;
	}

<<<<<<< HEAD
	/**
	 * 
	 * @param conversation_Name : conversation name
	 * @param name : user name
	 * @return checking all user name & conversation name
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public static Vector<PublicPagePostEntity> check(String conversation_Name,String name) {
		Vector<PublicPagePostEntity> list = new Vector<PublicPagePostEntity>();
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("PublicPagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		for (Entity entity : pq.asIterable()) {
			
			if(entity.getProperty("PageName").toString().equals(conversation_Name))
			{
				long key=entity.getKey().getId();
<<<<<<< HEAD
				String a=PageEntity.get(conversation_Name);
				if(a.equals(name)){
=======
<<<<<<< HEAD
				String a=PageEntity.get(conversation_Name);
				if(a.equals(name)){
=======
<<<<<<< HEAD
				String a=PageEntity.get(conversation_Name);
				if(a.equals(name)){
=======
<<<<<<< HEAD
				String a=PageEntity.get(conversation_Name);
				if(a.equals(name)){
=======
				PageEntity a=PageEntity.get(conversation_Name);
				if(a.getUname()==name){
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
					PublicPagePostEntity p=new PublicPagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
							,entity.getProperty("Privacy").toString()
							,Integer.parseInt(entity.getProperty("Likes").toString())
							,entity.getProperty("PageName").toString(),Integer.parseInt(entity.getProperty("PostSeen").toString()));
					increaseSeen(key);
					list.add(p);
				
				}	
				else{
				PublicPagePostEntity p=new PublicPagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
						,entity.getProperty("Privacy").toString()
						,Integer.parseInt(entity.getProperty("Likes").toString())
						,entity.getProperty("PageName").toString(),1);	
				increaseSeen(key);
				list.add(p);
				}
				
				
				
			   }
			}
	
	return list;
}
<<<<<<< HEAD
	
	/**
	 * 
	 * @param ID : user ID
	 * @return increasing seen
	 */
	public static boolean increaseSeen(long ID){
=======
<<<<<<< HEAD
	public static boolean increaseSeen(long ID){
=======
	public static void increaseSeen(long ID){
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("PublicPagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());
		for (Entity entity : pq.asIterable()) {
			long key=entity.getKey().getId();
			if (key==ID) {
				
				Entity group = new Entity("PublicPagePostEntity", key);
				PublicPagePostEntity p=new PublicPagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
						,entity.getProperty("Privacy").toString()
						,Integer.parseInt(entity.getProperty("Likes").toString())
						,entity.getProperty("PageName").toString(),Integer.parseInt(entity.getProperty("PostSeen").toString()));
				
				group.setProperty("UserName", p.getUserName());
				group.setProperty("Content", p.getContent());
				group.setProperty("Likes",p.getLikes());
				group.setProperty("Privacy", p.getPrivacy());
				group.setProperty("PageName", p.getPageName());
				group.setProperty("PostSeen", (p.getSeen()+1));
				
				datastore.put(group);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
				return true ;
			}
	
		}
		return false;
<<<<<<< HEAD
=======
=======
				
			}
	
		}
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		
	}
}
