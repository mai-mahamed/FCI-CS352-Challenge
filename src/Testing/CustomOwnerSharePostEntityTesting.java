package Testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.CustomTimelinePost;

public class CustomOwnerSharePostEntityTesting {
	/*public CustomOwnerSharedPostEntity(String UserName, String Content,String Privacy, String Likes,
			 String Name,String whoSee)*/
	CustomOwnerSharePostEntityTesting post=new CustomOwnerSharePostEntityTesting();
	
	@DataProvider(name="saveTest")
	
	public static Object[][] savePost(){
		CustomTimelinePost c1=new CustomTimelinePost("mai", "welcome user",
										"sad","custom", "(m,n)","m","#jjj");
		
		/*CustomTimelinePost c2=new CustomOwnerSharePostEntityTesting("m", "welcome user",
			                            "custom",50,"n", "(mai)");
		CustomTimelinePost c3=new CustomOwnerSharePostEntityTesting("n", "welcome user",
			                            "custom",5,"m", "(m,mai)");
		CustomTimelinePost c4=new CustomOwnerSharePostEntityTesting("m", "welcome user",
			                            "custom",50,"", "(mai)");*/
		return new Object[][]{ {true,c1}/*, {true,c2}, {true,c3},{true,c4}*/ };
	}

	
	@Test(dataProvider="saveTest")
	
	public void save(boolean result , CustomSharedPostEntityTesting c){
		Assert.assertEquals(result ,c.savePost());
	}

}
