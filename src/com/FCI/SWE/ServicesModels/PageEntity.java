package com.FCI.SWE.ServicesModels;

import java.util.List;

import javax.ws.rs.FormParam;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PageEntity {

	private String pname;
	private String type;
	private String category;
	private String uname;
	private long likes;
	private long activeUsers;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getLikes() {
		return likes;
	}
	public void setLikes(long likes) {
		this.likes = likes;
	}
	public long getActiveUsers() {
		return activeUsers;
	}
	public void setActiveUsers(long activeUsers) {
		this.activeUsers = activeUsers;
	}
	public PageEntity(String pname, String type, String category, String uname) {
		super();
		this.pname = pname;
		this.type = type;
		this.category = category;
		this.uname = uname;
		this.likes=0;
		this.activeUsers=0;
	}
	public boolean savePage() {
		// TODO Auto-generated method stub
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("pages");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("pages", list.size() + 1);

		group.setProperty("Pagename", this.pname);
		group.setProperty("Type", this.type);
		group.setProperty("Category", this.category);
		group.setProperty("Username",this.uname);
		group.setProperty("Likes", this.likes);
		group.setProperty("ActiveUsers", this.activeUsers);
		
		
		if(datastore.put(group).isComplete())
			return true;
		else return false;
	}
	public static String get(String pname2) {
		// TODO Auto-generated method stub
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("pages");
		PreparedQuery pq = datastore.prepare(gaeQuery);
	
		
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("Pagename").toString().equals(pname2)) {
				
				String returnedFriend=entity.getProperty("Username").toString();
				
				
				return returnedFriend;
			}
		}
		return null;
	}
	

	public static boolean increaseLikes(String pname){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("pages");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("Pagename").toString().equals(pname)) {
				long key=entity.getKey().getId();
				Entity employee = new Entity("pages", key);
				PageEntity returnedFriend=new PageEntity(entity.getProperty("Pagename").toString(),
						entity.getProperty("Type").toString(),entity.getProperty("Category").toString(),
						entity.getProperty("Username").toString());
				returnedFriend.setLikes((long)entity.getProperty("Likes"));
				returnedFriend.setActiveUsers((long)entity.getProperty("ActiveUsers"));
				employee.setProperty("Pagename", returnedFriend.pname);
				employee.setProperty("Type", returnedFriend.type);
				employee.setProperty("Category", returnedFriend.category);
				employee.setProperty("Username",returnedFriend.uname);
				employee.setProperty("Likes", (returnedFriend.likes+1));
				employee.setProperty("ActiveUsers", returnedFriend.activeUsers);
				
				datastore.put(employee);
				return true;
				
			}
	
		}
		
		return false;
	}
	
	}
