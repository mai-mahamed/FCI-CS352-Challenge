<<<<<<< HEAD
package com.FCI.SWE.Controller ;

import java.util.HashMap ; 
import java.util.Map ;
import java.util.Vector ;

import javax.ws.rs.FormParam ;
import javax.ws.rs.GET ;
import javax.ws.rs.POST ;
import javax.ws.rs.Path ;
import javax.ws.rs.Produces ;
import javax.ws.rs.core.MediaType ;
import javax.ws.rs.core.Response ;

import org.glassfish.jersey.server.mvc.Viewable ;
import org.json.simple.JSONArray ;
import org.json.simple.JSONObject ;
import org.json.simple.JSONValue ;
import org.json.simple.parser.JSONParser ;
import org.json.simple.parser.ParseException ;

import com.FCI.SWE.Models.User ;
=======
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
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805

@Path("/")
@Produces("text/html")

public class PageController {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
/**
 * 
 * @return   jsp that calling the form for creating page
 */
<<<<<<< HEAD
	@GET
	@Path("/Page")
	public Response index() {
		return Response.ok(new Viewable("/jsp/PageForm")).build() ;
	}
	
=======
<<<<<<< HEAD
=======
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	@GET
	@Path("/Page")
	public Response index() {
		return Response.ok(new Viewable("/jsp/PageForm")).build();
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	/**
	 * 
	 * @return jsp that creating page
	 */
<<<<<<< HEAD
	@GET
	@Path("/CreatePageForm")
	public Response CreatePageForm() 
	{
		return Response.ok(new Viewable("/jsp/CreatePageForm")).build() ;
	}
=======
<<<<<<< HEAD
=======
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	@GET
	@Path("/CreatePageForm")
	public Response CreatePageForm() {
		return Response.ok(new Viewable("/jsp/CreatePageForm")).build();
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	/**
	 * 
	 * @param pname : page name
	 * @param type : type of page
	 * @param category : category of page like (Education,Science,...etc)
	 * @return send to user creating page was successfully
	 */
<<<<<<< HEAD
	@POST
	@Path("/CreatePage")
	@Produces(MediaType.TEXT_PLAIN)
	public String CreatePage(@FormParam("pname") String pname ,
			@FormParam("type") String type, @FormParam("category") String category)  
	{
       
		String serviceUrl = "http://localhost:8888/rest/CreatePageService" ;
		String uname=User.getCurrentActiveUser().getName() ;
		String urlParameters = "uname=" + uname+ "&pname=" + pname + "&type=" + type + "&category=" + category ;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST" ,
				"application/x-www-form-urlencoded;charset=UTF-8") ;
		JSONParser parser = new JSONParser() ;
		Object obj ;
		try 
		{
			obj = parser.parse(retJson) ;
			JSONObject object = (JSONObject) obj ;
			if (object. get("Status"). equals("OK"))
				return "Page created Successfully" ;

		}
		catch (ParseException e)  
		{
=======
<<<<<<< HEAD
=======
=======
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
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
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

<<<<<<< HEAD
		return null ;
	}

=======
		return null;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	/**
	 * 
	 * @return calling the jsp that creating page post in page
	 */
<<<<<<< HEAD
	@GET
	@Path("/CreatePagePostForm")
	public Response FriendTimeline() 
	{
		return Response.ok(new Viewable("/jsp/pagePost")).build() ;
	}
=======
<<<<<<< HEAD
=======
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	@GET
	@Path("/CreatePagePostForm")
	public Response FriendTimeline() {
		return Response.ok(new Viewable("/jsp/pagePost")).build();
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	
	/**
	 * 
	 * @param Content : content of the post in page
	 * @param Privacy : showing the privacy of post(public,custom)
	 * @param PageName : name of page
	 * @return send to user posting in page was successfully
	 */
<<<<<<< HEAD
	@POST
	@Path("/CreatePagePost")
	@Produces(MediaType.TEXT_PLAIN)
	public String CreateMyTimelinePost(@FormParam("Content") String Content , @FormParam("Privacy") String Privacy ,
			@FormParam("pname") String PageName) 
	{
       
		String serviceUrl = "http://localhost:8888/rest/CreatePagePostService" ;
		String name=User.getCurrentActiveUser().getName() ;
		String urlParameters= "name=" + name+ "&Content=" + Content +  "&Privacy=" + Privacy+"&PageName="+PageName ;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST" ,
				"application/x-www-form-urlencoded;charset=UTF-8") ;
		JSONParser parser = new JSONParser() ;
		Object obj ;
		try 
		{
			obj = parser.parse(retJson) ;
			JSONObject object = (JSONObject) obj ;
			if (object.get("Status").equals("OK"))
				return "Post created Successfully" ;  

		}
		catch (ParseException e) 
		{
=======
<<<<<<< HEAD
=======
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
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
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

<<<<<<< HEAD
		return null ;
	}
	
/////////////PageName//////////////////////////
=======
		return null;
	}
	
/////////////PageName//////////////////////////
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	/**
	 * 
	 * @return calling jsp that showing page's time line
	 */
<<<<<<< HEAD
	@GET
	@Path("/ShowPageTimeForm")
	public Response PageTimeline() 
	{
		return Response.ok(new Viewable("/jsp/PageTime")).build() ;
	}
=======
<<<<<<< HEAD
=======
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	@GET
	@Path("/ShowPageTimeForm")
	public Response PageTimeline() {
		return Response.ok(new Viewable("/jsp/PageTime")).build();
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	
	/**
	 * 
	 * @param PageName : name of the page
	 * @return showing the time line of page containing its posts
	 */
	@POST
	@Path("/ShowPageTime")
	@Produces("text/html")
<<<<<<< HEAD
	public Response ShowPageTime(@FormParam("PageName") String PageName) 
	{
       
		String serviceUrl = "http://localhost:8888/rest/ShowPageTimeService" ;
		String name=User.getCurrentActiveUser().getName() ;
		String urlParameters= "name=" + name + "&PageName="+ PageName ;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST" ,
				"application/x-www-form-urlencoded;charset=UTF-8") ;
	
		System.out.println(retJson) ;
		Object obj1=JSONValue.parse(retJson) ;

		 
		
		  JSONArray array=(JSONArray)obj1 ;
			
	     Map<String, Vector<String>> map = new HashMap<String, Vector<String>>() ;
	     Vector<String>requests= new Vector<String>() ;
		for (int i=0;i<array.size();i++) 
		{
			 JSONObject jsonObject=(JSONObject)array.get(i) ;
		
			
		   requests.add(jsonObject.toJSONString()) ;
			
				 
		}		
			map.put("HashList",requests) ;
			return Response.ok(new Viewable("/jsp/PageTimeLine",map)).build() ;
	}
	
///////////////////////////////////End//////////////////////	
=======
	public Response ShowPageTime(@FormParam("PageName") String PageName) {
<<<<<<< HEAD
=======
=======
	@POST
	@Path("/ShowPageTime")
	@Produces("text/html")
<<<<<<< HEAD
	public Response ShowPageTime(@FormParam("PageName") String PageName) {
=======
	public Response CreatePageTime(@FormParam("PageName") String PageName) {
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
       
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	/**
	 * 
	 * @return calling jsp that caling form for liking page
	 */
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	@GET
	@Path("/LikePageForm")
	public Response LikePageForm() {
		return Response.ok(new Viewable("/jsp/LikePageForm")).build();
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	/**
	 * 
	 * @param pname : name of the page
	 * @return showing that the page is liked for the user
	 */
<<<<<<< HEAD
	@POST
	@Path("/LikePage")
	@Produces(MediaType.TEXT_PLAIN)
	public String LikePage(@FormParam("pname") String pname)
	{
       
		String serviceUrl = "http://localhost:8888/rest/LikePageService" ;
		String uname=User.getCurrentActiveUser().getName() ;
		String urlParameters = "uname=" + uname+ "&pname=" + pname ;
		String retJson = Connection.connect(serviceUrl , urlParameters, "POST" ,
				"application/x-www-form-urlencoded;charset=UTF-8") ;
		JSONParser parser = new JSONParser() ;
		Object obj ;
		try {
			obj = parser.parse(retJson) ;
			JSONObject object = (JSONObject) obj ;
			if (object.get("Status").equals("OK"))
				return "Page created Successfully" ;

		}
		catch (ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace() ;
		}

		return null ; 
=======
<<<<<<< HEAD
=======
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
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
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}
}
