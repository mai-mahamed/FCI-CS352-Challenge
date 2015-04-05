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



public class GroupMessageEntity {
	private String uname; 
	private String name1;
	private String name2; 
	private String name3;
	private String name4; 
	private String conversation;
	private String message;
	
	/**
	 * Constructor accepts user data
	 * 
	 * @param Funame
	 *            friend user name
	 * @param FuID
	 *           friend user id
	 */
	public GroupMessageEntity(String uname, String name1,String name2,String name3,String name4,String conversation,String message)
	{
		this.uname = uname;
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
		this.conversation = conversation;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String M) {
		this.message = M;
	}
	public void setconversation(String uName) {
		this.conversation = uName;
	}
	public String getconversation() {
		return conversation;
	}

	public void setuname(String uName) {
		this.uname = uName;
	}
	public String getuname() {
		return uname;
	}
	public void setname1(String fn) {
		this.name1 = fn;
	}

	public String getname1() {
		return name1;
	}
	public void setname2(String fn) {
		this.name2 = fn;
	}
	public String getname2() {
		return name2;
	}
	public void setname3(String fn) {
		this.name3 = fn;
	}
	public String getname3() {
		return name3;
	}
	public void setname4(String fn) {
		this.name4 = fn;
	}
	public String getname4() {
		return name4;
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


	public Boolean saveGroupMessage() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("SendGroupMessage");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity employee = new Entity("SendGroupMessage", list.size() + 1);

		employee.setProperty("UserName", this.uname);
		employee.setProperty("Name1", this.name1);
		employee.setProperty("Name2", this.name2);
		employee.setProperty("Name3", this.name3);
		employee.setProperty("Name4", this.name4);
		employee.setProperty("Conversation", this.conversation);
		employee.setProperty("Message",this.message);
		
		datastore.put(employee);
		

		return true;

	}
	
}

