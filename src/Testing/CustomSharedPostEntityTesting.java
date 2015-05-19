package Testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.CustomTimelinePost;

public class CustomSharedPostEntityTesting {
	
	CustomSharedPostEntityTesting post=new CustomSharedPostEntityTesting();
	

	@DataProvider(name="saveTest")
	
	public static Object[][] savePost(){
		CustomTimelinePost c1=new CustomSharedPostEntityTesting("mai", "welcome user",
										"custom",5,"m", "(m,n)");
		CustomTimelinePost c2=new CustomSharedPostEntityTesting("m", "welcome user",
			                            "custom",50,"n", "(mai)");
		CustomTimelinePost c3=new CustomSharedPostEntityTesting("n", "welcome user",
			                            "custom",5,"m", "(m,mai)");
		CustomTimelinePost c4=new CustomSharedPostEntityTesting("m", "welcome user",
			                            "custom",50,"", "(mai)");
		return new Object[][]{ {true,c1}, {true,c2}, {true,c3},{true,c4} };
	}

	@Test(dataProvider="saveTest")
	
	public void save(boolean result , CustomSharedPostEntityTesting c){
		Assert.assertEquals(result ,c.savePost());
	}

}
