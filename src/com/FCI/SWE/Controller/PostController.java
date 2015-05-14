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
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.FCI.SWE.Models.User;
import com.FCI.SWE.ServicesModels.UserEntity;


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


public class PostController {
<<<<<<< HEAD
	/**
	 * 
	 * @return calling jsp that creating post in my time lime , friend time line or showing hash tag trends
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@GET
	@Path("/Post")
	public Response index() {
		return Response.ok(new Viewable("/jsp/createPostForm1")).build();
	}
<<<<<<< HEAD
	
	/**
	 * 
	 * @return calling jsp that creating post in my time line
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@GET
	@Path("/MyTimeline")
	public Response MyTimeline() {
		return Response.ok(new Viewable("/jsp/MyTimeline")).build();
	}
<<<<<<< HEAD
	
	/**
	 * 
	 * @return calling jsp that creating post in my friend time line
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@GET
	@Path("/FriendTimeline")
	public Response FriendTimeline() {
		return Response.ok(new Viewable("/jsp/FriendTimeline")).build();
	}
<<<<<<< HEAD
	
	/**
	 * 
	 * @param Content : content in any post
	 * @param Feeling : feeling in any post
	 * @param Privacy : showing the privacy of post(public,custom)
	 * @return creating post in my time line
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/CreateMyTimelinePost")
	@Produces(MediaType.TEXT_PLAIN)
	public String CreateMyTimelinePost(@FormParam("Content") String Content,
			@FormParam("Feeling") String Feeling, @FormParam("Privacy") String Privacy) {
       
		String serviceUrl = "http://localhost:8888/rest/CreateMyTimelinePostService";
		String name=User.getCurrentActiveUser().getName();
		String urlParameters;
		String hashtag=null;
		if(Content.contains("#"))
		{ 
			String []val=Content.split(" ");
			for(String s:val)
			{
				if(s.contains("#"))
					{
					hashtag=s;
					break;
					}
			}
		}
		urlParameters = "name=" + name+ "&Content=" + Content + "&Feeling=" + Feeling + "&Privacy=" + Privacy+"&HashTag="+hashtag;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("OK"))
				return "Post created Successfully";

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
<<<<<<< HEAD
	
	/**
	 * 
	 * @param Content : content in any post
	 * @param Feeling : feeling in any post
	 * @param Privacy : showing the privacy of post(public,custom)
	 * @param owner : owner of time line
	 * @return  creating post in my friend time line
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/CreateFriendTimelinePost")
	@Produces(MediaType.TEXT_PLAIN)
	public String CreateFriendTimelinePost(@FormParam("Content") String Content,
			@FormParam("Feeling") String Feeling, @FormParam("Privacy") String Privacy,@FormParam("owner") String owner) {
         
		String serviceUrl = "http://localhost:8888/rest/CreateFriendTimelinePostService";
		String name=User.getCurrentActiveUser().getName();
		String hashtag=null;
		if(Content.contains("#"))
		{ 
			String []val=Content.split(" ");
			for(String s:val)
			{
				if(s.contains("#"))
					{
					hashtag=s;
					break;
					}
			}
		}
		String urlParameters = "name=" + name+ "&Content=" + Content + "&Feeling=" + Feeling + "&Privacy=" 
		+ Privacy+ "&owner=" + owner+"&HashTag="+hashtag;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		 
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("OK"))
				{
				return "Post created Successfully";}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @return calling jsp that showing hash tag in any time line
	 */
=======
	
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@GET
	@Path("/HashtagTimeline")
	public Response HashtagTimeline() {
		return Response.ok(new Viewable("/jsp/HashtagTimeline")).build();
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @param Hashtag : user can write hash tag form
	 * @return all posts that has hash tags
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/ShowHashtagTimeline")
	@Produces("text/html")
	public Response ShowHashtagTimeline(@FormParam("Hashtag") String Hashtag) {
       
		String serviceUrl = "http://localhost:8888/rest/ShowHashtagTimelineService";
		String urlParameters ="&Hashtag="+Hashtag;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		System.out.println("retJson:   "+retJson);
		Object obj1=JSONValue.parse(retJson);
		JSONArray array=(JSONArray)obj1;
	     Map<String, Vector<String>> map = new HashMap<String, Vector<String>>();
	     Vector<String>requests= new Vector<String>();
		for (int i=0;i<array.size();i++) {
			 JSONObject jsonObject=(JSONObject)array.get(i);
		
			
		   requests.add(jsonObject.toJSONString());
			
				 
		}
		String newID=String.valueOf(array.size());
		Vector<String>size=new Vector<String>();
		size.add(newID);
			map.put("HashList",requests);
			map.put("HashListCounter",size);
			return Response.ok(new Viewable("/jsp/showHashtag",map)).build();
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @return all counts of one hash tag 
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@GET
	@Path("/HashtagTrends")
	@Produces("text/html")
	public Response HashtagTrends() {
		long id=User.getCurrentActiveUser().getId();
		String serviceUrl = "http://localhost:8888/rest/HashtagTrendsService";
		String urlParameters ="&ID="+id;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		
		
		System.out.println("retJson:   "+retJson);
		Object obj1=JSONValue.parse(retJson);

		 
		
		  JSONArray array=(JSONArray)obj1;
	     Map<String, Vector<String>> map = new HashMap<String, Vector<String>>();
	     Vector<String>requests= new Vector<String>();
		for (int i=0;i<array.size();i++) {
			 JSONObject jsonObject=(JSONObject)array.get(i);
		
			
		   requests.add(jsonObject.toJSONString());
			
				 
		}		
			map.put("HashList",requests);
			return Response.ok(new Viewable("/jsp/hashtagTrend",map)).build();
		
		
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @return showing all posts that user post it in his/her time line 
	 */
=======
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@GET
	@Path("/ShowUserTime")
	@Produces("text/html")
	public Response ShowUserTime() {
       
		String serviceUrl = "http://localhost:8888/rest/ShowUserTimeService";
		String name=User.getCurrentActiveUser().getName();
		String urlParameters= "name=" + name;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
	
		System.out.println(retJson);
		Object obj1=JSONValue.parse(retJson);

		 
		
		  JSONArray array=(JSONArray)obj1;
			
	     Map<String, Vector<String>> map = new HashMap<String, Vector<String>>();
	     Vector<String>requests= new Vector<String>();
		for (int i=0;i<array.size();i++) {
			 JSONObject jsonObject=(JSONObject)array.get(i);
		
			
		   requests.add(jsonObject.toJSONString());
			
				 
		}		
			map.put("HashList",requests);
			
			return Response.ok(new Viewable("/jsp/ShowUserTime",map)).build();
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @param uname : user name
	 * @param pr : showing the privacy of post(public,custom,private)
	 * @return sharing the posts
	 */
=======
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/sharePost")
	@Produces("text/html")
	public String sharePost(@FormParam("uname") String uname,@FormParam("privacy") String pr)  {
		
		String serviceUrl = "http://localhost:8888/rest/sharePostService";
		String name=User.getCurrentActiveUser().getName();
		String urlParameters= "name=" + name+"&Cont="+uname+"&privacy="+pr;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		
		  Object obj1=JSONValue.parse(retJson);
		  JSONArray array=(JSONArray)obj1;
			
			JSONObject object = (JSONObject) obj1;
			
				return "Page created Successfully";

		}
	
}
	

