package com.FCI.SWE.Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.mvc.Viewable;
<<<<<<< HEAD
import org.json.simple.JSONArray;
=======
<<<<<<< HEAD
import org.json.simple.JSONArray;
=======
<<<<<<< HEAD
import org.json.simple.JSONArray;
=======
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.FCI.SWE.Models.User;
import com.FCI.SWE.ServicesModels.FriendEntity;
<<<<<<< HEAD
import com.FCI.SWE.ServicesModels.GroupMessageEntity;
import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.UserEntity;
=======
<<<<<<< HEAD
import com.FCI.SWE.ServicesModels.GroupMessageEntity;
import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.UserEntity;
=======
<<<<<<< HEAD
import com.FCI.SWE.ServicesModels.GroupMessageEntity;
import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.UserEntity;
=======
import com.FCI.SWE.ServicesModels.UserEntity;

>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
/**
 * This class contains REST services, also contains action function for web
 * application
 * 
 * @author Mohamed Samir
 * @version 1.0
 * @since 2014-02-12
 *
 */
@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class UserServices {
	
	
	/*@GET
	@Path("/index")
	public Response index() {
		return Response.ok(new Viewable("/jsp/entryPoint")).build();
	}*/


		/**
	 * Registration Rest service, this service will be called to make
	 * registration. This function will store user data in data store
	 * 
	 * @param uname
	 *            provided user name
	 * @param email
	 *            provided user email
	 * @param pass
	 *            provided password
	 * @return Status json
	 */
	@POST
	@Path("/RegistrationService")
	public String registrationService(@FormParam("uname") String uname,
			@FormParam("email") String email, @FormParam("password") String pass) {
		UserEntity user = new UserEntity(uname, email, pass);
		user.saveUser();
		JSONObject object = new JSONObject();
		object.put("Status", "OK");
		return object.toString();
	}
	
	@POST
	@Path("/activeFriendRequests")
	public String activeFriendRequests(@FormParam("uname") String uname, @FormParam("ID")long currID) {
		
		long id=UserEntity.getUserID(uname);
		
		FriendEntity.changeStatus(id, currID);
		JSONObject object = new JSONObject();
		object.put("Status", "OK");
		return object.toString();
	}
	/**
	 * Login Rest Service, this service will be called to make login process
	 * also will check user data and returns new user from datastore
	 * @param uname provided user name
	 * @param pass provided user password
	 * @return user in json format
	 */
	@POST
	@Path("/LoginService")
	public String loginService(@FormParam("uname") String uname,
			@FormParam("password") String pass) {
		JSONObject object = new JSONObject();
		UserEntity user = UserEntity.getUser(uname, pass);
		if (user == null) {
			object.put("Status", "Failed");

		} else {
			object.put("Status", "OK");
			object.put("name", user.getName());
			object.put("email", user.getEmail());
			object.put("password", user.getPass());
			object.put("id", user.getId());
		}
		return object.toString();

	}

<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
	///////////////////////////////////////////////////////////////
	@POST
	@Path("/SendFriendRequestService")
	public String Send_Friend_Request(@FormParam("Frienduname") String Funame,@FormParam("UID")long id)
	{
		JSONObject object2 = new JSONObject();
		long FID  = UserEntity.getUserID(Funame);
		
		if(FID == -1)
		{ object2.put("Status","Failed");
			
		}
		else
		{
			FriendEntity fuser=new FriendEntity(id,FID,"Send");
			fuser.saveFriendUser();
		    object2.put("Status","OK");
	}
		return object2.toString();
		
	}
	
	
	@POST
	@Path("/ShowFriendRequests")
	public String ShowFriendRequests(@FormParam("ID") long id) {
		JSONObject object = new JSONObject();
		
		long user = FriendEntity.getAllFriendsID(id);
		
		if (user == -1) {
			object.put("Status", "Failed");

		} else {
			
			String name=UserEntity.getUserName(user);
			
			object.put("Status", "OK");
			object.put("name", name);
	
		}
		return object.toString();

	}
	
	

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
	
	@POST
	@Path("/SendFriendMessageService")
	public String SendFriendMessageService(@FormParam("FriendName") String uname,@FormParam("Message")String msg, @FormParam("UserName") String Currentuser)
	{
		JSONObject object2 = new JSONObject();
		MessageEntity fuser=new MessageEntity(Currentuser,uname,msg);
		fuser.saveFriendUser();
		    object2.put("Status","OK");

		return object2.toString();
		
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
	

	
	
<<<<<<< HEAD
=======
=======
	@POST
	@Path("/SendGroupChatService")
	public String SendGroupChatService(@FormParam("Name") String name ,@FormParam("Name1") String name1 , @FormParam("Name2") String name2 , @FormParam("Name3") String name3 ,@FormParam("Name4") String name4 , @FormParam("Conversation") String conversation , @FormParam("Message") String message)
	{
		JSONObject object2 = new JSONObject();
		
		GroupMessageEntity fuser=new GroupMessageEntity(name, name1,name2,name3,name4,conversation,message);
		fuser.saveGroupMessage();
		    object2.put("Status","OK");

		return object2.toString();
		
	}

	
	@POST
	@Path("/ShowNotificationService")
	public String ShowNotificationService(@FormParam("ID") long id) {
		
		
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
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
	
	@POST
	@Path("/ShowMessageService")
	public String ShowMessageService(@FormParam("ID") long id) {
<<<<<<< HEAD
		Command c=new SingleMSGCommand();
		String user=c.exec(id);
=======
<<<<<<< HEAD
		Command c=new SingleMSGCommand();
		String user=c.exec(id);
=======
		String name=UserEntity.getUserName(id);
		String user= MessageEntity.getAllMessagesList(name);
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
		
		return user;

	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
	
	
	@POST
	@Path("/CreateGroupChatService")
	public String CreateGroupChatService(@FormParam("Name") String name ,@FormParam("Name1") String name1 , @FormParam("Name2") String name2 , @FormParam("Name3") String name3 ,@FormParam("Name4") String name4 , @FormParam("Conversation") String conversation)
	{
		JSONObject object2 = new JSONObject();
		
		GMsgSubject s=new GMsgSubject();
		s.addNewConversation(name ,name1 ,name2 ,name3 ,name4 ,conversation);
		
		    object2.put("Status","OK");
<<<<<<< HEAD

		return object2.toString();
		
	}

=======
=======
=======
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
>>>>>>> e549c54537cb4d303bcbc0bcd68d25eb677ac60e

		return object2.toString();
		
	}

>>>>>>> e55f3b0c9652a5e4c98922e3768db182dac76a58
	
	@POST
	@Path("/SendToGroupChatService")
	public String SendToGroupChatService(@FormParam("Name")String name,@FormParam("Conversation_Name") String Conversation_Name , @FormParam("message") String msg)
	{
		
		JSONObject object2 = new JSONObject();
		boolean found=GroupMessageEntity.check(name,Conversation_Name);
		if(found){
		
		GMsgSubject s=new GMsgSubject();
		s.addNewMsg(Conversation_Name,msg,name);
		
		    object2.put("Status","OK");}
		else{
			
			object2.put("Status","Failed");}

		return object2.toString();
		
	}
	
	@POST
	@Path("/ShowNotificationService")
	public String ShowNotificationService(@FormParam("ID") long id) {
		
		Command c=new FriendRequestCommand();
		String array=c.exec(id);
			
		return array;

	}
	@POST
	@Path("/ShowGroupMessageService")
	public String ShowGroupMessageService(@FormParam("ID") long id) {
		
		Command c=new GMessageCommand();
		String array=c.exec(id);
		

		return array;

	}
}