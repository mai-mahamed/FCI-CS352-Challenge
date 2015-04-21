package com.FCI.SWE.Controller;

import java.util.HashMap;
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

@Path("/")
@Produces("text/html")

public class PageController {

	@GET
	@Path("/Page")
	public Response index() {
		return Response.ok(new Viewable("/jsp/PageForm")).build();
	}
	
	@GET
	@Path("/CreatePageForm")
	public Response CreatePageForm() {
		return Response.ok(new Viewable("/jsp/CreatePageForm")).build();
	}
	
	@POST
	@Path("/CreatePage")
	@Produces(MediaType.TEXT_PLAIN)
	public String CreatePage(@FormParam("pname") String pname,
			@FormParam("type") String type, @FormParam("category") String category) {
       
		String serviceUrl = "http://localhost:8888/rest/CreatePageService";
		String uname=User.getCurrentActiveUser().getName();
		String urlParameters = "uname=" + uname+ "&pname=" + pname + "&type=" + type + "&category=" + category;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("OK"))
				return "Page created Successfully";

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@GET
	@Path("/CreatePagePostForm")
	public Response FriendTimeline() {
		return Response.ok(new Viewable("/jsp/pagePost")).build();
	}
	@POST
	@Path("/CreatePagePost")
	@Produces(MediaType.TEXT_PLAIN)
	public String CreateMyTimelinePost(@FormParam("Content") String Content, @FormParam("Privacy") String Privacy,
			@FormParam("pname") String PageName) {
       
		String serviceUrl = "http://localhost:8888/rest/CreatePagePostService";
		String name=User.getCurrentActiveUser().getName();
		String urlParameters= "name=" + name+ "&Content=" + Content +  "&Privacy=" + Privacy+"&PageName="+PageName;
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
	
/////////////PageName//////////////////////////

	@GET
	@Path("/ShowPageTimeForm")
	public Response PageTimeline() {
		return Response.ok(new Viewable("/jsp/PageTime")).build();
	}
	@POST
	@Path("/ShowPageTime")
	@Produces("text/html")
	public Response ShowPageTime(@FormParam("PageName") String PageName) {
       
		String serviceUrl = "http://localhost:8888/rest/ShowPageTimeService";
		String name=User.getCurrentActiveUser().getName();
		String urlParameters= "name=" + name +"&PageName="+PageName;
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
			return Response.ok(new Viewable("/jsp/PageTimeLine",map)).build();
	}
	
///////////////////////////////////End//////////////////////	
	@GET
	@Path("/LikePageForm")
	public Response LikePageForm() {
		return Response.ok(new Viewable("/jsp/LikePageForm")).build();
	}
	
	@POST
	@Path("/LikePage")
	@Produces(MediaType.TEXT_PLAIN)
	public String LikePage(@FormParam("pname") String pname) {
       
		String serviceUrl = "http://localhost:8888/rest/LikePageService";
		String uname=User.getCurrentActiveUser().getName();
		String urlParameters = "uname=" + uname+ "&pname=" + pname ;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("OK"))
				return "Page created Successfully";

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
