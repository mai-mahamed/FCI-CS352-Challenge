package com.FCI.SWE.ServicesModels;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class LikesEntity {

	private  String UName; 
	private  String Name_Page;
	
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getName_Page() {
		return Name_Page;
	}
	public void setName_Page(String name_Page) {
		Name_Page = name_Page;
	}
	
	
	public LikesEntity(String uName, String name_Page) {
		super();
		UName = uName;
		Name_Page = name_Page;
	}
<<<<<<< HEAD
	
	/**
	 * 
	 * @return Saving likes in data sore
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public   Boolean save() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("LikesPage");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity employee = new Entity("LikesPage", list.size() + 1);

		employee.setProperty("UName", this.UName);
		employee.setProperty("PageName", this.Name_Page);
		
		
		
		
		datastore.put(employee);

		return true;

	}
<<<<<<< HEAD
	
	/**
	 * 
	 * @param pname : page name
	 * @param uname2 : user name
	 * @return checking access in data store
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public static boolean checkaccess(String pname, String uname2) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("LikesPage");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		for (Entity entity : pq.asIterable()) {
			
			if(entity.getProperty("PageName").toString().equals(pname)&&entity.getProperty("UName").toString().equals(uname2))
			{
			
			return true;
				
				
			   }
			}
		return false;
	}
}
