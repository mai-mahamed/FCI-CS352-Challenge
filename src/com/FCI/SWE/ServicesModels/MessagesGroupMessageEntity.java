package com.FCI.SWE.ServicesModels;

import java.util.List;
import java.util.Vector;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class MessagesGroupMessageEntity {
	private String uname; 
	private String msg; 
	private String conversation;

	
	public MessagesGroupMessageEntity(String uname,String msg,String conversation)
	{
		this.uname = uname;
		this.msg = msg;
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
	
	public void setmsg(String fn) {
		this.msg = fn;
	}
	public String getmsg() {
		return msg;
	}
	
	


<<<<<<< HEAD
	/**
	 * 
	 * Saving all group message in data store 
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public Boolean saveMessageGroupMessage() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("GroupMessage");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity employee = new Entity("GroupMessage", list.size() + 1);

		employee.setProperty("UserName", this.uname);
		employee.setProperty("Message", this.msg);
		employee.setProperty("Conversation", this.conversation);
			
		datastore.put(employee);
		

		return true;

	}


<<<<<<< HEAD
	/**
	 * 
	 * @param conversation_Name : name of conversation 
	 * checking all group message
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public static Vector<MessagesGroupMessageEntity> check(String conversation_Name) {
		Vector<MessagesGroupMessageEntity> list = new Vector<MessagesGroupMessageEntity>();
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("GroupMessage");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		for (Entity entity : pq.asIterable()) {
			
			if(entity.getProperty("Conversation").toString().equals(conversation_Name))
			{
				
						
				MessagesGroupMessageEntity a=new MessagesGroupMessageEntity(entity.getProperty("UserName").toString(),entity.getProperty("Message").toString()
						,entity.getProperty("Conversation").toString());	
			
				list.add(a);
				
				
			   }
			}
		

	return list;
}
	
	
}
