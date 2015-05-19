package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.CustomTimelinePost;

public class CustomOwnerSharePostEntityTesting {
	CustomOwnerSharePostEntityTesting post=new CustomOwnerSharePostEntityTesting();
	
	/**
	 * 
	 * @return saving posts with custom privacy 
	 */
	@DataProvider(name="saveTest")
	
	public static Object[][] savePost(){
		CustomOwnerSharePostEntityTesting c1=new CustomOwnerSharePostEntityTesting();
		
		CustomOwnerSharePostEntityTesting c2=new CustomOwnerSharePostEntityTesting();
		CustomOwnerSharePostEntityTesting c3=new CustomOwnerSharePostEntityTesting();
		CustomOwnerSharePostEntityTesting c4=new CustomOwnerSharePostEntityTesting();
		return new Object[][]{ {true,c1}, {true,c2}, {true,c3},{true,c4} };
	}
	
	/**
	 * 
	 * @param result to view the result of function
	 * @param c object of CustomTimelinePost
	 */
	@Test(dataProvider="saveTest")
	
	public void save(boolean result , CustomTimelinePost c){
		Assert.assertEquals(result ,c.save());
	}
}