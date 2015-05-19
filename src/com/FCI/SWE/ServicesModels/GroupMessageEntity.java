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

	
	/**
	 * Constructor accepts user data
	 * 
	 * @param Funame
	 *            friend user name
	 * @param FuID
	 *           friend user id
	 */
	public GroupMessageEntity(String uname, String name1,String name2,String name3,String name4,String conversation)
	{
		this.uname = uname;
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
		this.conversation = conversation;
		
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


	/**
	 * 
	 * Saving group message in data store
	 */
	public Boolean saveGroupMessage() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("CreateGroupMessage");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity employee = new Entity("CreateGroupMessage", list.size() + 1);

		employee.setProperty("UserName", this.uname);
		employee.setProperty("Name1", this.name1);
		employee.setProperty("Name2", this.name2);
		employee.setProperty("Name3", this.name3);
		employee.setProperty("Name4", this.name4);
		employee.setProperty("Conversation", this.conversation);
		
		
		datastore.put(employee);
		

		return true;

	}

	/**
	 * 
	 * @param name user name
	 * @param conversation_Name : name of message group
	 * @return checking for name of conversation
	 */
	public static boolean check(String name, String conversation_Name) {
		
			DatastoreService datastore = DatastoreServiceFactory
					.getDatastoreService();
			
			Query gaeQuery = new Query("CreateGroupMessage");
			PreparedQuery pq = datastore.prepare(gaeQuery);
			for (Entity entity : pq.asIterable()) {
				if(entity.getProperty("Conversation").toString().equals(conversation_Name))
				{
					if (entity.getProperty("UserName").toString().equals(name)||entity.getProperty("Name1").toString().equals(name)		
					||entity.getProperty("Name2").toString().equals(name)||entity.getProperty("Name3").toString().equals(name)
					||entity.getProperty("Name4").toString().equals(name)) {
					return true;
				   }
				}
			}

		return false;
	}
	
	/**
	 * 
	 * @param Cname : conversation name
	 * @return
	 */
	public static GroupMessageEntity getgroup(String Cname) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("CreateGroupMessage");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		for (Entity entity : pq.asIterable()) {
			if (entity.getProperty("name").toString().equals(Cname)) {
				GroupMessageEntity returnedUser = new GroupMessageEntity(entity.getProperty(
						"uname").toString(), entity.getProperty("Name1")
						.toString(), entity.getProperty("Name2").toString(), entity.getProperty("Name3")
						.toString(), entity.getProperty("Name4").toString(),entity.getProperty("Conversation").toString());
				return returnedUser;
			}
		}

		return null;
	}
	
	
	
	
	/**
	 * 
	 * @param name : user name
	 * @return all friends in conversation 
	 */
	public static Vector<String> getAllFriendsConvList(String name){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("CreateGroupMessage");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		Vector<String> list=new Vector<String>();
		
		
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("UserName").toString().equals(name)||entity.getProperty("Name1").toString().equals(name)		
					||entity.getProperty("Name2").toString().equals(name)||entity.getProperty("Name3").toString().equals(name)
					||entity.getProperty("Name4").toString().equals(name)) 
					 {
						 list.add(entity.getProperty("Conversation").toString());
						 System.out.println("retJson:  "+entity.getProperty("Conversation").toString());
				
			           }
	      	}
		
	      
		return list;
	
      }
	
}

