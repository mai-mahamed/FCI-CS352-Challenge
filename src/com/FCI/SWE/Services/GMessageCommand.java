package com.FCI.SWE.Services;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.FCI.SWE.ServicesModels.FriendEntity;
import com.FCI.SWE.ServicesModels.GroupMessageEntity;
import com.FCI.SWE.ServicesModels.MessagesGroupMessageEntity;
import com.FCI.SWE.ServicesModels.UserEntity;

public class GMessageCommand implements Command{

	@Override
<<<<<<< HEAD
	/**
	 * function get all conversations' messages that login user was joined 
	 * @return list with  all conversations' messages that login user was joined 
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public String exec(long id) {
		JSONArray array=new JSONArray();
		String name=UserEntity.getUserName(id);
		Vector<String> user= new Vector<String>();
		

<<<<<<< HEAD
		 user= GroupMessageEntity.getAllFriendsConvList(name);// get all conversations name
=======
		 user= GroupMessageEntity.getAllFriendsConvList(name);
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
		
			for(int i=0;i<user.size();i++){
				Vector<MessagesGroupMessageEntity> l= new Vector<MessagesGroupMessageEntity>();
				
<<<<<<< HEAD
				l=MessagesGroupMessageEntity.check(user.get(i)); // return all messages for this conversation
=======
				l=MessagesGroupMessageEntity.check(user.get(i));
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
				
				JSONObject object = new JSONObject();
				for(int j=0;j<l.size();j++)
				{
					
					object.put("Conversation", l.get(j).getconversation());
					object.put("UserName", l.get(j).getuname());
					object.put("Message", l.get(j).getmsg());
					
					array.add(object);
				}
				
				
			}
					return array.toString();
		
	}

}
