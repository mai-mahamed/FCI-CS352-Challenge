package com.FCI.SWE.ServicesModels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import com.FCI.SWE.Services.CustomTimelinePost;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class CustomTimelinePostEntity {


	private String UserName;
	private String Content;
	private String Feeling;
	private String Privacy;
	private String Owner;
	private int Likes;
	private String Hashtags;
	private String WhoCanSee;
	
	

	public String getWhoCanSee() {
		return WhoCanSee;
	}

	public void setWhoCanSee(String whoCanSee) {
		WhoCanSee = whoCanSee;
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



	public CustomTimelinePostEntity(String userName, String content,
			String feeling, String privacy, String owner, int likes,
			String hashtags, String whoCanSee) {
		super();
		UserName = userName;
		Content = content;
		Feeling = feeling;
		Privacy = privacy;
		Owner = owner;
		Likes = likes;
		Hashtags = hashtags;
		WhoCanSee = whoCanSee;
	}

	/**
	 * 
	 * @param customTimelinePost object from CustomTimelinePost class
	 * Saving CustomTimelinePost in data store
	 */
	public static boolean save(CustomTimelinePost customTimelinePost) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("CustomTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("CustomTimelinePostEntity", list.size() + 1);

		group.setProperty("UserName", customTimelinePost.getUserName());
		group.setProperty("Content", customTimelinePost.getContent());
		group.setProperty("Feeling", customTimelinePost.getFeeling());
		group.setProperty("Likes",customTimelinePost.getLikes());
		group.setProperty("Timeline'sOwner", customTimelinePost.getOwner());
		group.setProperty("Privacy", customTimelinePost.getPrivacy());
		group.setProperty("WhoCanSee", customTimelinePost.getWhoSee());
		group.setProperty("Hashtags", customTimelinePost.getHashtags());
		
		if(datastore.put(group).isComplete())
			return true;
		else return false;
	}

	/**
	 * 
	 * @param hash hashtags
	 * @return get all hashtags ID
	 */
	public static Vector<CustomTimelinePost> getAllList(String hash) {
		// TODO Auto-generated method stub
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("CustomTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		Vector<CustomTimelinePost> list=new Vector<CustomTimelinePost>();
		
		
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("Hashtags").toString().equals(hash)) {
				
				CustomTimelinePost returnedFriend=new CustomTimelinePost(entity.getProperty("UserName").toString(),
						entity.getProperty("Content").toString(),entity.getProperty("Feeling").toString(),
						entity.getProperty("Privacy").toString(),entity.getProperty("WhoCanSee").toString(),entity.getProperty("Timeline'sOwner").toString(),
						entity.getProperty("Hashtags").toString());
				
				list.add(returnedFriend);
				
			}
		}
		return list;
	}



	/**
	 * 
	 * @return getting all lists counts for hashtags
	 */
	public static List<String> getAllListCount() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("CustomTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		Map<String,Integer> l=new HashMap<String,Integer>();
		List<String>list=new ArrayList<String>();
		for (Entity entity : pq.asIterable()) {
				
				list.add(entity.getProperty("Hashtags").toString());	
		}
		
		
		return list;
	}

	/**
	 * 
	 * @param uname : user name
	 * @return checking access in data store
	 */
	public static Vector<CustomTimelinePostEntity> checkaccess(String uname) {
		Vector<CustomTimelinePostEntity> list = new Vector<CustomTimelinePostEntity>();
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("CustomTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		for (Entity entity : pq.asIterable()) {
			
			if(entity.getProperty("WhoCanSee").toString().contains(uname)||entity.getProperty("Timeline'sOwner").toString()==uname||entity.getProperty("UserName").toString()==uname)
			{
			
						System.out.println("llllcustomllll"+entity.getProperty("WhoCanSee").toString()+"   "+uname);
				CustomTimelinePostEntity p=new CustomTimelinePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
						,entity.getProperty("Feeling").toString(),entity.getProperty("Privacy").toString(),entity.getProperty("Timeline'sOwner").toString()
						,Integer.parseInt(entity.getProperty("Likes").toString()),entity.getProperty("Hashtags").toString(),entity.getProperty("WhoCanSee").toString());	
			   
			
				
				list.add(p);
				
				
			   }
			}
		
	return list;
	}

}
