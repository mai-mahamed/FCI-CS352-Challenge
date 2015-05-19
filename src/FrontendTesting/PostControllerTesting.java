package FrontendTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import javax.ws.rs.FormParam;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FCI.SWE.Controller.Connection;
import com.FCI.SWE.Controller.PageController;
import com.FCI.SWE.Controller.PostController;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

@Test
public class PostControllerTesting {
	
		LocalServiceTestHelper service = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());
		
		
		@BeforeMethod
		@BeforeClass
		public void setUp(){
			service.setUp();
			
		}
		
		@AfterMethod
		@AfterClass
		  public void tearDown() {
		    service.tearDown();
		  }
		
		PostController c=new PostController();
		@DataProvider(name="CreateMyTimelinePost")
		public static Object [][]CreateMyTimelinePost(){
			
			String s2 ="Welcome";
			String s3 ="happy";
			String s4 ="public";
			
			String s6 ="hi";
			String s7 ="";
			String s8 ="private";
			
			return new Object[][]{{"OK",s2,s3,s4},{"Failed",s6,s7,s8}} ;
		}
		
		/**
		 * 
		 * @param result : showing the result of testing the function
		 * @param Content : Content of post in page
		 * @param Feeling : feeling of user and written in post
		 * @param Privacy : privacy of posts (public,private,custom)
		 */
		public void CreateMyTimelinePost(String result,String Content,String Feeling,String Privacy) {
	       
			String serviceUrl = "http://localhost:8888/rest/CreateMyTimelinePost";
			String uname="mai";
			String s1=uname ;
			String s2=Content ;
			String s3=Feeling ;
			String s4=Privacy ;
			String urlParameters = "uname=" + s1 + "&Content=" + s2 + "&Feeling=" + s3 + "&Privacy=" + s4;
			String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
					"application/x-www-form-urlencoded;charset=UTF-8");
			JSONParser parser = new JSONParser();
			Object obj;
			try {
				obj = parser.parse(retJson);
				JSONObject object = (JSONObject) obj;
				AssertJUnit.assertEquals(result,s1,object.get("Status"));
					

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}

//////////////////////////////////////CreateFriendTimelinePost////////////////////////////////////////////////////////
		@DataProvider(name="CreateFriendTimelinePost")
		public static Object [][]CreateFriendTimelinePost(){
		
		String s2 ="welcome";
		String s3 ="sad";
		String s4 ="";
		String s5 ="moataz";
		
		String s6 ="bye";
		String s7 ="sad";
		String s8 ="custom(n,m)";
		String s9 ="malak";
		return new Object[][]{{"Failed",s2,s3,s4,s5},{"Ok",s6,s7,s8,s9}} ;
	}
		
		/**
		 * 
		 * @param result : showing the result of testing the function
		 * @param Content : Content of post in page
		 * @param Feeling : feeling of user and written in post
		 * @param Privacy : privacy of posts (public,private,custom)
		 * @param owner : friend's timeline
		 */
		public void CreateFriendTimelinePost(String result , String Content,  String Feeling, String Privacy, String owner) {
	       
			String serviceUrl = "http://localhost:8888/rest/CreateFriendTimelinePost";
			String name="n";
			String n1=name;
			String n2=Content;
			String n3=Feeling;
			String n4=Privacy;
			String n5=owner;
			String urlParameters= "name=" + n1+ "&Content=" + n2 +  "&Feeling=" + n3+"&Privacy="+n4 + "&owner" + n5;
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
	

///////////////////////////////////////ShowHashtagTimeline///////////////////////////////////////////////
		@DataProvider(name="ShowHashtagTimeline")
		public static Object [][]ShowHashtagTimeline(){
			
			String s2 ="Happiness";
			
			String s6 ="";
			
			return new Object[][]{{"OK",s2},{"Failed",s6}} ;
		}

		/**
		 * 
		 * @param result : showing the result of testing the function
		 * @param Hashtag : hashtag for any post
		 */
		@Test(dataProvider="ShowHashtagTimeline")
		public void ShowHashtagTimeline(String result,@FormParam("Hashtag") String Hashtag) {
	       
			String serviceUrl = "http://localhost:8888/rest/ShowHashtagTimeline";
			String uname="mai";
			String s1=uname ;
			String s2= Hashtag ;
			String urlParameters = "uname=" + s1 + "Hashtag" + s2 ;
			String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
					"application/x-www-form-urlencoded;charset=UTF-8");
			JSONParser parser = new JSONParser();
			Object obj;
			try {
				obj = parser.parse(retJson);
				JSONObject object = (JSONObject) obj;
				AssertJUnit.assertEquals(result,s1,object.get("Status"));
					

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
////////////////////////////////////HashtagTrends//////////////////////////////
		
		@DataProvider(name="HashtagTrends")
		public static Object [][]HashtagTrends(){
			
			long s2 =5;
			
			
			return new Object[][]{{"OK",s2}} ;
		}

		/**
		 * 
		 * @param result : showing the result of testing the function
		 * @param id : ID for owner of this hashtag in its owm post
		 */
		@Test(dataProvider="HashtagTrends")
		public void HashtagTrends(String result,@FormParam("ID") long id) {
	       
			String serviceUrl = "http://localhost:8888/rest/HashtagTrends";
			String uname="mai";
			String s1=uname ;
			long s2=id ;
			String urlParameters = "uname=" + s1 + "ID" + s2 ;
			String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
					"application/x-www-form-urlencoded;charset=UTF-8");
			JSONParser parser = new JSONParser();
			Object obj;
			try {
				obj = parser.parse(retJson);
				JSONObject object = (JSONObject) obj;
				AssertJUnit.assertEquals(result,s1,object.get("Status"));
					

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
}