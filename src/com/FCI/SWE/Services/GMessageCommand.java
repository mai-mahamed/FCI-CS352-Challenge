package com.FCI.SWE.Services;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.FCI.SWE.ServicesModels.FriendEntity;
import com.FCI.SWE.ServicesModels.GroupMessageEntity;
import com.FCI.SWE.ServicesModels.MessagesGroupMessageEntity;
import com.FCI.SWE.ServicesModels.UserEntity;

<<<<<<< HEAD
public class GMessageCommand implements Command
{

	@Override
=======
public class GMessageCommand implements Command{

	@Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	/**
	 * function get all conversations' messages that login user was joined 
	 * @return list with  all conversations' messages that login user was joined 
	 */
<<<<<<< HEAD
	public String exec(long id) 
	{
		JSONArray array = new JSONArray() ;
		String name = UserEntity.getUserName(id) ;
		Vector<String> user = new Vector<String>() ; 
		 

		 user = GroupMessageEntity.getAllFriendsConvList(name) ;// get all conversations name
		
			for(int i=0; i<user.size(); i++)
			{
				Vector<MessagesGroupMessageEntity> l = new Vector<MessagesGroupMessageEntity>() ;
				
				l = MessagesGroupMessageEntity.check(user.get(i)) ; // return all messages for this conversation
				
				JSONObject object = new JSONObject() ;
				for(int j=0; j<l.size(); j++)
				{
					
					object.put("Conversation", l.get(j).getconversation()) ;
					object.put("UserName", l.get(j).getuname()) ;
					object.put("Message", l.get(j).getmsg()) ;
					
					array.add(object) ;
=======
<<<<<<< HEAD
=======
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public String exec(long id) {
		JSONArray array=new JSONArray();
		String name=UserEntity.getUserName(id);
		Vector<String> user= new Vector<String>();
		

<<<<<<< HEAD
		 user= GroupMessageEntity.getAllFriendsConvList(name);// get all conversations name
=======
<<<<<<< HEAD
		 user= GroupMessageEntity.getAllFriendsConvList(name);// get all conversations name
=======
		 user= GroupMessageEntity.getAllFriendsConvList(name);
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
		
			for(int i=0;i<user.size();i++){
				Vector<MessagesGroupMessageEntity> l= new Vector<MessagesGroupMessageEntity>();
				
<<<<<<< HEAD
				l=MessagesGroupMessageEntity.check(user.get(i)); // return all messages for this conversation
=======
<<<<<<< HEAD
				l=MessagesGroupMessageEntity.check(user.get(i)); // return all messages for this conversation
=======
				l=MessagesGroupMessageEntity.check(user.get(i));
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
				
				JSONObject object = new JSONObject();
				for(int j=0;j<l.size();j++)
				{
					
					object.put("Conversation", l.get(j).getconversation());
					object.put("UserName", l.get(j).getuname());
					object.put("Message", l.get(j).getmsg());
					
					array.add(object);
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
				}
				
				
			}
<<<<<<< HEAD
					return array.toString() ;
=======
					return array.toString();
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		
	}

}
