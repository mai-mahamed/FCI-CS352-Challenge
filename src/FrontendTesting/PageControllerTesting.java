package FrontendTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

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

import com.FCI.SWE.Controller.Connection;
import com.FCI.SWE.Controller.PageController;
import com.FCI.SWE.Models.User;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

public class PageControllerTesting {
	LocalServiceTestHelper service = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());
	
	
	@BeforeClass
	public void setUp(){
		service.setUp();
		
	}
	
	@AfterClass
	  public void tearDown() {
	    service.tearDown();
	  }
	
	PageController p=new PageController();
	@DataProvider(name="CreatePage")
	public static Object [][]CreatePageTest(){
		
		String s2 ="AI";
		String s3 ="science";
		String s4 ="Education";
		
		String s6 ="DW";
		String s7 ="";
		String s8 ="Education";
		
		return new Object[][]{{"OK",s2,s3,s4},{"Failed",s6,s7,s8}} ;
	}

	/**
	 * 
	 * @param result : showing the result of testing the function
	 * @param pname : name of page
	 * @param type : type of page
	 * @param category : category of page
	 */
	@Test(dataProvider="CreatePage")
	public void CreatePage(String result,String pname,String type,String category) {
       
		String serviceUrl = "http://localhost:8888/rest/CreatePageService";
		String uname="mai";
		String s1=uname ;
		String s2=pname ;
		String s3=type ;
		String s4=category ;
		String urlParameters = "uname=" + s1 + "&pname=" + s2 + "&type=" + s3 + "&category=" + s4;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			AssertJUnit.assertEquals(result,object.get("Status"));
				

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
//////////////////////////////////////CreatePagePost///////////////////////////////////////
	
		@DataProvider(name="CreatePagePost")
		public static Object [][]CreatePagePostTest(){
		
		String s2 ="welcome";
		String s3 ="public";
		String s4 ="Sw";
		String s6 ="DW";
		String s7 ="custom(n,m)";
		String s8 ="SWII project";
		
		return new Object[][]{{"Failed",s2,s3,s4},{"Ok",s6,s7,s8}} ;
	}
		/**
		 * 
		 * @param result : showing the result of testing the function
		 * @param Content : Content of post in page
		 * @param Privacy : privacy of posts (public,private,custom)
		 * @param PageName : name of page
		 */
		@Test(dataProvider = "CreatePagePost")
		public void CreateMyTimelinePost(String result , String Content,  String Privacy, String PageName) {
	       
			String serviceUrl = "http://localhost:8888/rest/CreatePagePostService";
			String name="n";
			String n1=name;
			String n2=Content;
			String n3=Privacy;
			String n4=PageName;
			String urlParameters= "name=" + n1+ "&Content=" + n2 +  "&Privacy=" + n3+"&PageName="+n4;
			String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
					"application/x-www-form-urlencoded;charset=UTF-8");
			JSONParser parser = new JSONParser();
			Object obj;
			try {
				obj = parser.parse(retJson);
				JSONObject object = (JSONObject) obj;
				AssertJUnit.assertEquals(result,n1,object.get("Status"));
					

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
	
	
////////////////////////////////////////ShowPageTime/////////////////////////////////////////////
	@DataProvider(name="ShowPageTime")
	public static Object [][]ShowPageTimeTest(){
	
	String s4 ="Sw";
	
	String s8 ="SWProject";
	
	return new Object[][]{{"Failed",s4},{"Ok",s8}} ;
}

	/**
	 * 
	 * @param result : showing the result of testing the function
	 * @param Content : Content of post
	 * @param Privacy : privacy of posts (public,private,custom) 
	 * @param PageName : name of the page
	 */
@Test(dataProvider="ShowPageTime")
public void ShowPageTime(String result, String Content,String Privacy,
		 String PageName) {

	Assert.assertEquals(result, p.CreateMyTimelinePost(Content, Privacy, PageName));
}
	
	
	
	@POST
	@Path("/ShowPageTime")
	@Produces("text/html")
	public Response ShowPageTime(@FormParam("PageName") String PageName) {
       
		String serviceUrl = "http://localhost:8888/rest/ShowPageTimeService";
		String name=User.getCurrentActiveUser().getName();
		String x1=name;
		String x2=PageName;
		String urlParameters= "name=" + x1 +"&PageName="+ x2;
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

}
