package com.FCI.SWE.ServicesModels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.FCI.SWE.Services.CustomTimelinePost;
import com.FCI.SWE.Services.PrivateTimelinePost;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PrivateTimelinePostEntity {


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

	public PrivateTimelinePostEntity(String userName, String content,
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

	
	public static boolean save(PrivateTimelinePost privateTimelinePost) {
		// TODO Auto-generated method stub
		
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("PrivateTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("PrivateTimelinePostEntity", list.size() + 1);

		group.setProperty("UserName", privateTimelinePost.getUserName());
		group.setProperty("Content", privateTimelinePost.getContent());
		group.setProperty("Feeling", privateTimelinePost.getFeeling());
		group.setProperty("Likes",privateTimelinePost.getLikes());
		group.setProperty("Timeline'sOwner", privateTimelinePost.getOwner());
		group.setProperty("Privacy", privateTimelinePost.getPrivacy());
		group.setProperty("Hashtags", privateTimelinePost.getHashtags());
		
		if(datastore.put(group).isComplete())
			return true;
		else return false;

	}

	

	public static Vector<PrivateTimelinePost> getAllList(String hash) {
		// TODO Auto-generated method stub
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("PrivateTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		Vector<PrivateTimelinePost> list=new Vector<PrivateTimelinePost>();
		
		
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("Hashtags").toString().equals(hash)) {
				
				PrivateTimelinePost returnedFriend=new PrivateTimelinePost(entity.getProperty("UserName").toString(),
						entity.getProperty("Content").toString(),entity.getProperty("Feeling").toString(),
						entity.getProperty("Privacy").toString(),entity.getProperty("Timeline'sOwner").toString(),
						entity.getProperty("Hashtags").toString());
				
				list.add(returnedFriend);
				
			}
		}
		return list;
	}



	public static List<String> getAllListCount() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("PrivateTimelinePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		Map<String,Integer> l=new HashMap<String,Integer>();
		List<String>list=new ArrayList<String>();
		for (Entity entity : pq.asIterable()) {
			        	
				
				list.add(entity.getProperty("Hashtags").toString());	
		}
		
		
		return list;
	}



	public static Vector<PrivateTimelinePostEntity> check(String uname) {
	
			// TODO Auto-generated method stub
			
				Vector<PrivateTimelinePostEntity> list = new Vector<PrivateTimelinePostEntity>();
				DatastoreService datastore = DatastoreServiceFactory
						.getDatastoreService();
				
				Query gaeQuery = new Query("PrivateTimelinePostEntity");
				PreparedQuery pq = datastore.prepare(gaeQuery);
				for (Entity entity : pq.asIterable()) {
					long fID=UserEntity.getUserID(entity.getProperty("UserName").toString());
					
					long curID=UserEntity.getUserID(uname);
					if(FriendEntity.Check(fID, curID)||FriendEntity.Check(curID,fID)||entity.getProperty("Timeline'sOwner").toString()==uname||entity.getProperty("UserName").toString()==uname)
					{
					
								
						PrivateTimelinePostEntity returnedFriend=new PrivateTimelinePostEntity(entity.getProperty("UserName").toString(),
								entity.getProperty("Content").toString(),entity.getProperty("Feeling").toString(),
								entity.getProperty("Privacy").toString(),entity.getProperty("Timeline'sOwner").toString(),Integer.parseInt(entity.getProperty("Likes").toString()),
								entity.getProperty("Hashtags").toString());
						
						list.add(returnedFriend);
						
						
						
					   }
					}
			
			return list;
	}

}
