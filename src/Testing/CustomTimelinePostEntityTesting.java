package Testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.CustomTimelinePost;

public class CustomTimelinePostEntityTesting {
	
	CustomTimelinePostEntityTesting post=new CustomTimelinePostEntityTesting();
	
	@DataProvider(name="saveTest")
	
	public static Object[][] savePost(){
		CustomTimelinePost c1=new CustomTimelinePostEntityTesting("mai", "welcome user",
										"happy","custom","mai",5,"happy", "(m,n)");
		
		CustomTimelinePost c2=new CustomTimelinePostEntityTesting("m", "welcome user",
			                            "","custom",50,"n", "(mai)");
		
		CustomTimelinePost c3=new CustomTimelinePostEntityTesting("n", "welcome user",
			                            "custom",5,"m", "(m,mai)");
		
		CustomTimelinePost c4=new CustomTimelinePostEntityTesting("m", "welcome user",
			                            "custom",50,"m", "(mai)");
		
		return new Object[][]{ {true,c1}, {true,c2}, {true,c3},{true,c4} };
	}

	@Test(dataProvider="saveTest")
	
	public void save(boolean result , CustomSharedPostEntityTesting c){
		Assert.assertEquals(result ,c.savePost());
	}

}
