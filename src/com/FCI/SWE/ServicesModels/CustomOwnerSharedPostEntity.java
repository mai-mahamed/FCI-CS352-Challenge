package com.FCI.SWE.ServicesModels;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class CustomOwnerSharedPostEntity {
	
	private String UserName;
	private String Content;
	private String Likes;
	private String Name;
	private String Privacy;
	private String whoSee;
	public CustomOwnerSharedPostEntity(String UserName, String Content,String Privacy, String Likes,
			 String Name,String whoSee) {
		// TODO Auto-generated constructor stub
		this.UserName=UserName;
		this.Content=Content;
		this.Likes=Likes;
		this.Name=Name;
		this.Privacy=Privacy;
		this.whoSee=whoSee;
	}
<<<<<<< HEAD
	/**
	 * 
	 * Saving shared posts in data store
	 */
	public  boolean save() {
=======
public  boolean save() {
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("CustomOwnerSharedPostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("CustomOwnerSharedPostEntity", list.size() + 1);


	    
		group.setProperty("UserName", this.UserName);
		group.setProperty("Content", this.Content);
		group.setProperty("Likes",this.Likes);
		group.setProperty("Name", this.Name);
		group.setProperty("Privacy", this.Privacy);
		group.setProperty("whoSee", this.whoSee);
		if(datastore.put(group).isComplete())
			{
			return true;}
		else return false;
	}


}
