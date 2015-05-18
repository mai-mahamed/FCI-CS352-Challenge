package com.FCI.SWE.Services;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.FCI.SWE.ServicesModels.FriendEntity;
import com.FCI.SWE.ServicesModels.UserEntity;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
/**
 * class shows friend requests notification
 * @author Nabila
 *
 */
public class FriendRequestCommand implements  Command{

	@Override
	/**
	 * function get all friends' requests
	 * @return list with all friends' requests that are sent to the login user
	 */
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
	}

}
