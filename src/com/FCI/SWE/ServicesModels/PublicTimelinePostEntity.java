package com.FCI.SWE.ServicesModels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.FCI.SWE.Services.PrivateTimelinePost;
import com.FCI.SWE.Services.PublicTimelinePost;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PublicTimelinePostEntity {



	private String UserName;
	private String Content;
	private String Feeling;
	private String Privacy;
	private String Owner;
	private int Likes;
	private String Hashtags;
	
	
	

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

	public String getFeeling() {
		return Feeling;
	}

	public void setFeeling(String feeling) {
		Feeling = feeling;
	}

	public String getPrivacy() {
		return Privacy;
	}

	public void setPrivacy(String privacy) {
		Privacy = privacy;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public int getLikes() {
		return Likes;
	}

	public void setLikes(int likes) {
		Likes = likes;
	}

	public String getHashtags() {
		return Hashtags;
	}

	public void setHashtags(String hashtags) {
		Hashtags = hashtags;
	}

	public static boolean save(PublicTimelinePost publicTimelinePost) {
		
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("PublicTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("PublicTimelinePostEntity", list.size() + 1);

		group.setProperty("UserName", publicTimelinePost.getUserName());
		group.setProperty("Content", publicTimelinePost.getContent());
		group.setProperty("Feeling", publicTimelinePost.getFeeling());
		group.setProperty("Likes",publicTimelinePost.getLikes());
		group.setProperty("Timeline'sOwner", publicTimelinePost.getOwner());
		group.setProperty("Privacy", publicTimelinePost.getPrivacy());
		group.setProperty("Hashtags", publicTimelinePost.getHashtags());
		
		if(datastore.put(group).isComplete())
			{
			return true;}
		else return false;
	}

	public static Vector<PublicTimelinePost> getAllList(String hash) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("PublicTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		Vector<PublicTimelinePost> list=new Vector<PublicTimelinePost>();
		
		
		for (Entity entity : pq.asIterable()) {
			System.out.println("public:   "+entity.getProperty("Hashtags").toString()+"  "+hash);
			if (entity.getProperty("Hashtags").toString().equals(hash)) {
				
				PublicTimelinePost returnedFriend=new PublicTimelinePost(entity.getProperty("UserName").toString(),
						entity.getProperty("Content").toString(),entity.getProperty("Feeling").toString(),
						entity.getProperty("Privacy").toString(),entity.getProperty("Timeline'sOwner").toString(),
						entity.getProperty("Hashtags").toString());
				 System.out.println("public:   "+returnedFriend.toString());
				list.add(returnedFriend);
				
			}
		}
		return list;
	}

	public static List<String> getAllListCount() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("PublicTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		Map<String,Integer> l=new HashMap<String,Integer>();
		List<String>list=new ArrayList<String>();
		for (Entity entity : pq.asIterable()) {
			        	
				
				list.add(entity.getProperty("Hashtags").toString());	
		}
		
		
		return list;
	}
	
	public PublicTimelinePostEntity(String userName, String content,
			String feeling, String privacy, String owner, int likes,
			String hashtags) {
		super();
		UserName = userName;
		Content = content;
		Feeling = feeling;
		Privacy = privacy;
		Owner = owner;
		Likes = likes;
		Hashtags = hashtags;
	}


	public static Vector<PublicTimelinePostEntity> check(String uname) {
			Vector<PublicTimelinePostEntity> list = new Vector<PublicTimelinePostEntity>();
			DatastoreService datastore = DatastoreServiceFactory
					.getDatastoreService();
			
			Query gaeQuery = new Query("PublicTimelinePostEntity");
			PreparedQuery pq = datastore.prepare(gaeQuery);
			for (Entity entity : pq.asIterable()) {
							
				PublicTimelinePostEntity returnedFriend=new PublicTimelinePostEntity(entity.getProperty("UserName").toString(),
						entity.getProperty("Content").toString(),entity.getProperty("Feeling").toString(),
						entity.getProperty("Privacy").toString(),entity.getProperty("Timeline'sOwner").toString(),
						Integer.parseInt(entity.getProperty("Likes").toString()),
						entity.getProperty("Hashtags").toString());
				   
					list.add(returnedFriend);
					
					
				   }
				
		
		return list;
	
	}

}
