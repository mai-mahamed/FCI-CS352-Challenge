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



public class FriendEntity
{
	private long UID; 
	private long FuID;
	private String status;
	
	/**
	 * Constructor accepts user data
	 * 
	 * @param Funame
	 *            friend user name
	 * @param FuID
	 *           friend user id
	 */
	public FriendEntity(long UID, long FU_ID,String status)
	{
		this.UID = UID;
		this.FuID = FU_ID;
		this.status=status;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setUID(long uID) {
		UID = uID;
	}

	public void setFuID(long fuID) {
		FuID = fuID;
	}

	public long getUID() {
		return UID;
	}
	public long getFuID() {
		return FuID;
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


	public Boolean saveFriendUser() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("FriendsStatus");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity employee = new Entity("FriendsStatus", list.size() + 1);

		employee.setProperty("FriendID", this.FuID);
		employee.setProperty("UserID", this.UID);
		employee.setProperty("Status","Send");
		
		datastore.put(employee);

		return true;

	}
	
	public static long getAllFriendsID(long id){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("FriendsStatus");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		
		String newID=String.valueOf(id);
		
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("FriendID").toString().equals(newID)&&
					entity.getProperty("Status").toString().equals("Send")) {
				
				FriendEntity returnedFriend=new FriendEntity((long)entity.getProperty("UserID"),
						(long)entity.getProperty("FriendID"),entity.getProperty("Status").toString());
				
				
				return returnedFriend.getUID() ;
			}
		}
		return -1;
	}
	
	public static Vector<Long> getAllFriendsIDList(long id){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("FriendsStatus");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		Vector<Long> list=new Vector<Long>();
		String newID=String.valueOf(id);
		
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("FriendID").toString().equals(newID)) {
				
				FriendEntity returnedFriend=new FriendEntity((long)entity.getProperty("UserID"),
						(long)entity.getProperty("FriendID"),entity.getProperty("Status").toString());
				
				list.add(returnedFriend.getUID());
				
			}
		}
		return list;
	}
	
	public static boolean changeStatus(long fID,long curID){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("FriendsStatus");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		
		String newID=String.valueOf(curID);
		String newID2=String.valueOf(fID);
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("FriendID").toString().equals(newID)&&entity.getProperty("UserID").toString().equals(newID2)) {
				long key=entity.getKey().getId();
				Entity employee = new Entity("FriendsStatus", key);
				FriendEntity returnedFriend=new FriendEntity((long)entity.getProperty("UserID"),
						(long)entity.getProperty("FriendID"),entity.getProperty("Status").toString());
				
				employee.setProperty("FriendID",curID );
				employee.setProperty("UserID", fID);
				employee.setProperty("Status", "Active");
				
				datastore.put(employee);
				return true;
				
			}
		
			
			
			
	}
		return false;
	
	}
	
	
	public static boolean Check(long fID,long curID){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("FriendsStatus");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		
		String newID=String.valueOf(curID);
		String newID2=String.valueOf(fID);
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("FriendID").toString().equals(newID)&&entity.getProperty("UserID").toString().equals(newID2)&&entity.getProperty("Status").toString().equals("Active")) {
				
				return true;
			}
     }
	return false;	

}
	
}

