package com.FCI.SWE.ServicesModels;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PrivateOwnerSharedPostEntity {
	
	private String UserName;
	private String Content;
	private String Likes;
	private String Name;
	private String Privacy;
	
	public PrivateOwnerSharedPostEntity(String UserName, String Content,String Privacy, String Likes,
			 String Name) {
		// TODO Auto-generated constructor stub
		this.UserName=UserName;
		this.Content=Content;
		this.Likes=Likes;
		this.Name=Name;
		this.Privacy=Privacy;
	}
public  boolean save() {
		
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("PrivateOwnerSharedPostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("PrivateOwnerSharedPostEntity", list.size() + 1);
		System.out.println("save");

	    
		group.setProperty("UserName", this.UserName);
		group.setProperty("Content", this.Content);
		group.setProperty("Likes",this.Likes);
		group.setProperty("Name", this.Name);
		group.setProperty("Privacy", this.Privacy);
		
		datastore.put(group);
		if(datastore.put(group).isComplete())
			{
			return true;}
		else return false;
	}


}
