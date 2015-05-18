package Testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MessageEntityTesting {

	MessageEntityTesting post=new MessageEntityTesting();
	

	@DataProvider(name="saveTest")
	
	public static Object[][] savePost(){
		Object c1 = null;
		Object c4 = null;
		Object c2 = null;
		Object c3 = null;
		return new Object[][]{ {true,c1}, {true,c2}, {true,c3},{true,c4} };
	}

	@Test(dataProvider="saveTest")
	
	public void save(boolean result , CustomSharedPostEntityTesting c){
		Assert.assertEquals(result ,c.savePost());
	}
}
