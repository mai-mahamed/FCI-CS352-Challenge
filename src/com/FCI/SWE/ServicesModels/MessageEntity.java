package com.FCI.SWE.ServicesModels;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;



public class MessageEntity {
	private String uname; 
	private String fname;
	private String message;
	
	/**
	 * Constructor accepts user data
	 * 
	 * @param Funame
	 *            friend user name
	 * @param FuID
	 *           friend user id
	 */
	public MessageEntity(String uname, String fname,String message)
	{
		this.message = message;
		this.uname = uname;
		this.fname=fname;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String M) {
		this.message = M;
	}

	public void setuname(String uName) {
		this.uname = uName;
	}

	public void setfname(String fn) {
		this.fname = fn;
	}

	
	public String getUname() {
		return uname;
	}

	public String getFname() {
		return fname;
	}

	
	
	/**
	 * 
	 * This static method will form FriendEntity class using json format contains
	 * user data
	 * 
	 * @param json
	 *            String in json format contains friend user data
	 * @return Constructed friend entity
	 */


<<<<<<< HEAD
	/**
	 * 
	 * Saving friend in data store
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public Boolean saveFriendUser() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("FriendsMessages");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity employee = new Entity("FriendsMessages", list.size() + 1);
		
		employee.setProperty("FriendName", this.fname);
		employee.setProperty("UserName", this.uname);
		employee.setProperty("Message",this.message);
	
		datastore.put(employee);

		return true;

	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @param name : user name
	 * @return : Getting all message from data store
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public static String getAllMessagesList(String name){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("FriendsMessages");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		boolean found=false;
		
		JSONArray array=new JSONArray();
		
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("FriendName").toString().equals(name)) {
				JSONObject obj = new JSONObject();
				obj.put("name", (String)entity.getProperty("UserName"));
				obj.put("message", entity.getProperty("Message").toString());
				array.add(obj);
				
				found=true;
			}
			
		}
	
		
		if (!found)
			return null;
		
		return array.toString();
		
	}
	
}

