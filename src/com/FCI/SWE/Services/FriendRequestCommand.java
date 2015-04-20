package com.FCI.SWE.Services;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.FCI.SWE.ServicesModels.FriendEntity;
import com.FCI.SWE.ServicesModels.UserEntity;

public class FriendRequestCommand implements  Command{

	@Override
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
