package com.FCI.SWE.ServicesModels;

import java.util.List;
import java.util.Vector;

import com.FCI.SWE.Services.PrivatePagePost;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PrivatePagePostEntity {

	private String UserName;
	private String Content;
	private String Privacy;
	private int Likes;
	private String PageName;
	private int Seen;



	
	
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

	public PrivatePagePostEntity(String userName, String content,
			String privacy, int likes, String pageName, int seen) {
		super();
		UserName = userName;
		Content = content;
		Privacy = privacy;
		Likes = likes;
		PageName = pageName;
		Seen = seen;
	}
	
	public static boolean save(PrivatePagePost privatePagePost) {
		// TODO Auto-generated method stub
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("PrivatePagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("PrivatePagePostEntity", list.size() + 1);

		group.setProperty("UserName", privatePagePost.getUserName());
		group.setProperty("Content", privatePagePost.getContent());
		group.setProperty("Likes",privatePagePost.getLikes());
		group.setProperty("Privacy", privatePagePost.getPrivacy());
		group.setProperty("PageName", privatePagePost.getPageName());
		group.setProperty("PostSeen", privatePagePost.getSeen());
		
		if(datastore.put(group).isComplete())
			return true;
		else return false;

	}

	public static Vector<PrivatePagePostEntity> check(String pname) {
		// TODO Auto-generated method stub
		
			Vector<PrivatePagePostEntity> list = new Vector<PrivatePagePostEntity>();
			DatastoreService datastore = DatastoreServiceFactory
					.getDatastoreService();
			
			Query gaeQuery = new Query("PrivatePagePostEntity");
			PreparedQuery pq = datastore.prepare(gaeQuery);
			for (Entity entity : pq.asIterable()) {
				
				if(entity.getProperty("PageName").toString().equals(pname))
				{
				
					long key=entity.getKey().getId();		
					PrivatePagePostEntity p=new PrivatePagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
							,entity.getProperty("Privacy").toString()
							,Integer.parseInt(entity.getProperty("Likes").toString())
							,entity.getProperty("PageName").toString(),1);	
					increaseSeen(key);
					list.add(p);
					
					
				   }
				}
		
		return list;
	}
	public static void increaseSeen(long ID){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("PrivatePagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());
		for (Entity entity : pq.asIterable()) {
			long key=entity.getKey().getId();
			if (key==ID) {
				
				Entity group = new Entity("PrivatePagePostEntity", key);
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
				
				datastore.put(group);
				
			}
	
		}


	}
}
