package com.FCI.SWE.Controller;

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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
<<<<<<< HEAD
import org.json.simple.JSONValue;
=======
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.FCI.SWE.Models.User;
import com.FCI.SWE.ServicesModels.UserEntity;

<<<<<<< HEAD

=======
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
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
@Produces("text/html")
public class UserController {
	/**
	 * Action function to render Signup page, this function will be executed
	 * using url like this /rest/signup
	 * 
	 * @return sign up page
	 */
	@GET
	@Path("/signup")
	public Response signUp() {
		return Response.ok(new Viewable("/jsp/register")).build();
	}
	
	@GET
	@Path("/signOut")
	public Response signOut() {
		System.out.println(User.getCurrentActiveUser().getId());
		User.signOut();
		return Response.ok(new Viewable("/jsp/entryPoint")).build();
	}

	/**
	 * Action function to render home page of application, home page contains
	 * only signup and login buttons
	 * 
	 * @return enty point page (Home page of this application)
	 */
	@GET
	@Path("/")
	public Response index() {
		return Response.ok(new Viewable("/jsp/entryPoint")).build();
	}
	@GET
	@Path("/showActive")
	public Response showActive() {
		return Response.ok(new Viewable("/jsp/SureAccept")).build();
	}
	/**
	 * Action function to render login page this function will be executed using
	 * url like this /rest/login
	 * 
	 * @return login page
	 */
	
	@GET
	@Path("/SendRequest")
	public Response SendRequest() {
		return Response.ok(new Viewable("/jsp/SendFriendRequest")).build();
	}

<<<<<<< HEAD

=======
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
	
	@POST
	@Path("/SendFriendRequestService")
	@Produces("text/html")
	public Response SendFriendRequest(@FormParam("fname") String fname) {
		long id=User.getCurrentActiveUser().getId();
		String urlParameters = "Frienduname=" + fname+"&UID="+id ;

		String retJson = Connection.connect(
<<<<<<< HEAD
				"http://localhost:8888/rest/SendFriendRequestService", urlParameters,
=======
				"http://challengefci2015.appspot.com/rest/SendFriendRequestService", urlParameters,
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
				"POST", "application/x-www-form-urlencoded;charset=UTF-8");

		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("Failed"))
				return null;
			
			return Response.ok(new Viewable("/jsp/Send")).build();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * UserEntity user = new UserEntity(uname, email, pass);
		 * user.saveUser(); return uname;
		 */
		return null;

	}

	@GET
	@Path("/login")
	public Response login() {
		return Response.ok(new Viewable("/jsp/login")).build();
	}

	/**
	 * Action function to response to signup request, This function will act as
	 * a controller part and it will calls RegistrationService to make
	 * registration
	 * 
	 * @param uname
	 *            provided user name
	 * @param email
	 *            provided user email
	 * @param pass
	 *            provided user password
	 * @return Status string
	 */
	@POST
	@Path("/response")
	@Produces(MediaType.TEXT_PLAIN)
	public String response(@FormParam("uname") String uname,
			@FormParam("email") String email, @FormParam("password") String pass) {

<<<<<<< HEAD
		String serviceUrl = "http://localhost:8888/rest/RegistrationService";
=======
		String serviceUrl = "http://challengefci2015.appspot.com/rest/RegistrationService";
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
		String urlParameters = "uname=" + uname + "&email=" + email
				+ "&password=" + pass;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			// System.out.println(retJson);
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("OK"))
				return "Registered Successfully";

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * UserEntity user = new UserEntity(uname, email, pass);
		 * user.saveUser(); return uname;
		 */
		return "Failed";
	}

	/**
	 * Action function to response to login request. This function will act as a
	 * controller part, it will calls login service to check user data and get
	 * user from datastore
	 * 
	 * @param uname
	 *            provided user name
	 * @param pass
	 *            provided user password
	 * @return Home page view
	 */
	@POST
	@Path("/home")
	@Produces("text/html")
	public Response home(@FormParam("uname") String uname,
			@FormParam("password") String pass) {
		String urlParameters = "uname=" + uname + "&password=" + pass;

		String retJson = Connection.connect(
<<<<<<< HEAD
				"http://localhost:8888/rest/LoginService", urlParameters,
=======
				"http://challengefci2015.appspot.com/rest/LoginService", urlParameters,
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
				"POST", "application/x-www-form-urlencoded;charset=UTF-8");

		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("Failed"))
				return null;
			Map<String, String> map = new HashMap<String, String>();
			User user = User.getUser(object.toJSONString());
			map.put("name", user.getName());
			map.put("email", user.getEmail());
			return Response.ok(new Viewable("/jsp/home", map)).build();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * UserEntity user = new UserEntity(uname, email, pass);
		 * user.saveUser(); return uname;
		 */
		return null;

	}
	
	
	
	@POST
	@Path("/activeFriend")
	public Response activeFriend(@FormParam("uname") String uname) {
		
        long id=User.getCurrentActiveUser().getId();
        
		String urlParameters = "uname="+uname+"&ID="+id;
		String retJson = Connection.connect(
<<<<<<< HEAD
				"http://localhost:8888/rest/activeFriendRequests", urlParameters,
=======
				"http://challengefci2015.appspot.com/rest/activeFriendRequests", urlParameters,
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
				"POST", "application/x-www-form-urlencoded;charset=UTF-8");
		
		return Response.ok(new Viewable("/jsp/active")).build();
	}

	@GET
	@Path("/ShowRequests")
	@Produces("text/html")
	public Response ShowRequests() {
		long id=User.getCurrentActiveUser().getId();
		
		String urlParameters = "&ID="+id;
		
		String retJson = Connection.connect(
<<<<<<< HEAD
				"http://localhost:8888/rest/ShowFriendRequests", urlParameters,
=======
				"http://challengefci2015.appspot.com/rest/ShowFriendRequests", urlParameters,
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
				"POST", "application/x-www-form-urlencoded;charset=UTF-8");
		
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("Failed"))
				return null;
			Map<String, String> map = new HashMap<String, String>();
			
			map.put("name", object.get("name").toString());
			
			return Response.ok(new Viewable("/jsp/show",map)).build();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * UserEntity user = new UserEntity(uname, email, pass);
		 * user.saveUser(); return uname;
		 */
		return null;

		
		
	}

<<<<<<< HEAD
	@GET
	@Path("/SendMessageToFriend")
	public Response SendMessageTOFriend() {
		return Response.ok(new Viewable("/jsp/SendMessage")).build();
	}
	
	@POST
	@Path("/SendMessage")
	@Produces("text/html")
	public Response SendMessage(@FormParam("FriendName") String fname , @FormParam("Message") String msg) {
		String name=User.getCurrentActiveUser().getName();
		String urlParameters = "FriendName=" + fname+"&UserName="+name+"&Message="+msg ;

		String retJson = Connection.connect(
				"http://localhost:8888/rest/SendFriendMessageService", urlParameters,
				"POST", "application/x-www-form-urlencoded;charset=UTF-8");

		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("Failed"))
				return null;
			
			return Response.ok(new Viewable("/jsp/SendMSG")).build();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * UserEntity user = new UserEntity(uname, email, pass);
		 * user.saveUser(); return uname;
		 */
		return null;
}
	@GET
	@Path("/GroupChat")
	public Response GroupChat() {
		return Response.ok(new Viewable("/jsp/GroupMessage")).build();
	}
	@POST
	@Path("/SendGroupChat")
	@Produces("text/html")
	public Response SendGroupChat(@FormParam("Name1") String name1 , @FormParam("Name2") String name2 , @FormParam("Name3") String name3 ,@FormParam("Name4") String name4 , @FormParam("Conversation") String conversation , @FormParam("Message") String message) {
		String name=User.getCurrentActiveUser().getName();
		String urlParameters = "Name=" + name+"&Name1=" + name1+"&Name2="+name2+"&Name3="+name3+"&Name4="+name4+"&Conversation="+conversation+"&Message="+message;

		String retJson = Connection.connect(
				"http://localhost:8888/rest/SendGroupChatService", urlParameters,
				"POST", "application/x-www-form-urlencoded;charset=UTF-8");
		System.out.println("msg: "+message);
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("Failed"))
				return null;
			
			return Response.ok(new Viewable("/jsp/SendMSG")).build();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * UserEntity user = new UserEntity(uname, email, pass);
		 * user.saveUser(); return uname;
		 */
		return null;
}
	
	@GET
	@Path("/ShowNotification")
	@Produces("text/html")
	public Response ShowNotification() {
		long id=User.getCurrentActiveUser().getId();
		
		String urlParameters = "&ID="+id;
		String retJson = Connection.connect(
				"http://localhost:8888/rest/ShowNotificationService", urlParameters,
				"POST", "application/x-www-form-urlencoded;charset=UTF-8");
		
		  Object obj1=JSONValue.parse(retJson);
		  JSONArray array=(JSONArray)obj1;
         Map<String, Vector<String>> map = new HashMap<String, Vector<String>>();
         Vector<String>requests= new Vector<String>();
		for (int i=0;i<array.size();i++) {
			 JSONObject jsonObject=(JSONObject)array.get(i);
		    
			//System.out.println("retJson:  "+jsonObject.get("name").toString());
		   requests.add(jsonObject.toJSONString());
			
				 
		}		
			map.put("FriendList",requests);
			return Response.ok(new Viewable("/jsp/showNotify",map)).build();
         //return Response.ok(new Viewable("/jsp/showNotify")).build();
	
		
	}

////////////Show Messages From Different Friends////////////////// 
@GET
@Path("/ShowMessages")
@Produces("text/html")
public Response ShowMessage() {
	long id=User.getCurrentActiveUser().getId();
	
	String urlParameters = "&ID="+id;
	String retJson = Connection.connect(
			"http://localhost:8888/rest/ShowMessageService", urlParameters,
			"POST", "application/x-www-form-urlencoded;charset=UTF-8");
	
	  Object obj1=JSONValue.parse(retJson);
	 
	  JSONArray array=(JSONArray)obj1;
     Map<String, Vector<String>> map = new HashMap<String, Vector<String>>();
     Vector<String>requests= new Vector<String>();
     JSONObject jsonObject;
	for (int i=0;i<array.size();i++) {
		  jsonObject=(JSONObject)array.get(i);
	    
		
	 
		 requests.add(jsonObject.toJSONString()); 
		
			 
	}		
		map.put("MessageList",requests);
		return Response.ok(new Viewable("/jsp/ReceiveMessages",map)).build();
}

}

=======
	
}
>>>>>>> f361c47c5a73c19bc593b2844bfb444cb0c6be40
