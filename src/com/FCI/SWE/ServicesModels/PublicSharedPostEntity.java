package com.FCI.SWE.ServicesModels;

import java.util.List;

import com.FCI.SWE.Services.PublicTimelinePost;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PublicSharedPostEntity {

	private String UserName;
	private String Content;
	private String Likes;
	private String Name;
	private String Privacy;
	
	public PublicSharedPostEntity(String UserName, String Content,String Privacy, String Likes,
			 String Name) {
		// TODO Auto-generated constructor stub
		this.UserName=UserName;
		this.Content=Content;
		this.Likes=Likes;
		this.Name=Name;
		this.Privacy=Privacy;
	}
<<<<<<< HEAD
	
	/**
	 * 
	 * Saving all shared posts with public privacy
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
public  boolean save() {
		
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("PublicSharedPostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("PublicSharedPostEntity", list.size() + 1);


	    
		group.setProperty("UserName", this.UserName);
		group.setProperty("Content", this.Content);
		group.setProperty("Likes",this.Likes);
		group.setProperty("Name", this.Name);
		group.setProperty("Privacy", this.Privacy);
		if(datastore.put(group).isComplete())
			{
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
			return true;
			}
		else 
			return false;
<<<<<<< HEAD
=======
=======
			return true;}
		else return false;
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}

	
	
}
