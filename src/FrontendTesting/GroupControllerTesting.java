package FrontendTesting;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FCI.SWE.Controller.Connection;
import com.FCI.SWE.Controller.GroupController;
<<<<<<< HEAD
=======
import com.FCI.SWE.Controller.PageController;
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
import com.FCI.SWE.Models.User;

public class GroupControllerTesting {

	GroupController p=new GroupController();
	@DataProvider(name="createGroup")
	public static Object [][]CreateGroupTest(){
		
		String s2 ="AI";
		String s3 ="science";
		String s4 ="Education";
		
		String s6 ="DW";
		String s7 ="";
		String s8 ="Education";
		
		return new Object[][]{{"OK",s2,s3,s4},{"Failed",s6,s7,s8}} ;
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @param name : name of group
	 * @param desc : description of this group
	 * @param privacy : privacy of this group
	 * @return
	 */
=======
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public String createGroup(@FormParam("name") String name,
			@FormParam("desc") String desc, @FormParam("privacy") String privacy) {

		String serviceUrl = "http://challengefci2015.appspot.com/rest/CreateGroupService";
		String s1=name;
		String s2=desc;
		String s3=privacy;
		String urlParameters = "user_id=" + User.getCurrentActiveUser().getId()
				+ "&name=" + s1 + "&desc=" + s2 + "&privacy=" + s3;
		String retJson = Connection.connect(serviceUrl, urlParameters, "POST",
				"application/x-www-form-urlencoded;charset=UTF-8");
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(retJson);
			JSONObject object = (JSONObject) obj;
			if (object.get("Status").equals("OK"))
				return "Group created Successfully";

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @param result : showing for the result of testing this function
	 * @param type : type of group
	 * @param cat : category of group
	 * @param PageName : name of page
	 */
=======
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	@Test(dataProvider="CreateGroup")
	public void CreateGroup(String result, String type,String cat,
			String PageName) {

		Assert.assertEquals(result, p.createGroup( type, cat,PageName));
	}
}
