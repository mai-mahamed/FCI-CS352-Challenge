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
			
<<<<<<< HEAD
			if (entity.getProperty("FriendID").toString().equals(newID)&&
					entity.getProperty("Status").toString().equals("Send")) {
=======
<<<<<<< HEAD
			if (entity.getProperty("FriendID").toString().equals(newID)&&
					entity.getProperty("Status").toString().equals("Send")) {
=======
<<<<<<< HEAD
			if (entity.getProperty("FriendID").toString().equals(newID)&&
					entity.getProperty("Status").toString().equals("Send")) {
=======
<<<<<<< HEAD
			if (entity.getProperty("FriendID").toString().equals(newID)&&
					entity.getProperty("Status").toString().equals("Send")) {
=======
<<<<<<< HEAD
			if (entity.getProperty("FriendID").toString().equals(newID)&&
					entity.getProperty("Status").toString().equals("Send")) {
=======
<<<<<<< HEAD
			if (entity.getProperty("FriendID").toString().equals(newID)&&
					entity.getProperty("Status").toString().equals("Send")) {
=======
			if (entity.getProperty("FriendID").toString().equals(newID)) {
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
				
				FriendEntity returnedFriend=new FriendEntity((long)entity.getProperty("UserID"),
						(long)entity.getProperty("FriendID"),entity.getProperty("Status").toString());
				
				
				return returnedFriend.getUID() ;
			}
		}
		return -1;
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
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
	
<<<<<<< HEAD
	public static boolean changeStatus(long fID,long curID){
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public static void changeStatus(long fID,long curID){
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
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

