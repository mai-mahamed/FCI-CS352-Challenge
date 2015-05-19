package com.FCI.SWE.Services;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.FCI.SWE.ServicesModels.FriendEntity;
import com.FCI.SWE.ServicesModels.UserEntity;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
/**
 * class shows friend requests notification
 * @author Nabila
 *
 */
<<<<<<< HEAD
public class FriendRequestCommand implements  Command
{
=======
public class FriendRequestCommand implements  Command{
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805

	@Override
	/**
	 * function get all friends' requests
	 * @return list with all friends' requests that are sent to the login user
	 */
<<<<<<< HEAD
	public String exec(long id) 
	{
		JSONArray array=new JSONArray() ;
		Vector<Long> user= new Vector<Long>() ;
		 user= FriendEntity.getAllFriendsIDList(id) ;
		
			for(int i=0; i<user.size(); i++)
			{
			String name=UserEntity.getUserName(user.get(i)) ;
			JSONObject object = new JSONObject() ;
			object.put("name", name) ;
			array.add(object) ;
			//System.out.println("retJson:  "+array.toString());
			}
		return array.toString() ;
=======
<<<<<<< HEAD
=======
=======

public class FriendRequestCommand implements  Command{

	@Override
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public String exec(long id) {
		JSONArray array=new JSONArray();
		Vector<Long> user= new Vector<Long>();
		 user= FriendEntity.getAllFriendsIDList(id);
		
			for(int i=0;i<user.size();i++){
			String name=UserEntity.getUserName(user.get(i));
			JSONObject object = new JSONObject();
			object.put("name", name);
			array.add(object);
			//System.out.println("retJson:  "+array.toString());
			}
		return array.toString();
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}

}
