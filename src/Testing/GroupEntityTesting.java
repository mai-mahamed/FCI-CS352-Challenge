package Testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupEntityTesting {
	
	GroupEntityTesting post=new GroupEntityTesting();
	
	private void setOwnerId(int i) {
		// TODO Auto-generated method stub
		
	}

	private void setPrivacy(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setDescription(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	
	@DataProvider(name="saveTest")
	
	public static Object[][] savePost(){
		GroupEntityTesting c1=new GroupEntityTesting();
		c1.setName("happy");
		c1.setDescription("social");
		c1.setPrivacy("public");
		c1.setOwnerId(1);
		
		GroupEntityTesting c2=new GroupEntityTesting();
		c2.setName("ss");
		c2.setDescription("marketing");
		c2.setPrivacy("");
		c2.setOwnerId(5);
		
		GroupEntityTesting c3=new GroupEntityTesting();
		c3.setName("happy");
		c3.setDescription("social");
		c3.setPrivacy("public");
		c3.setOwnerId(2);
		return new Object[][]{ {true,c1}, {true,c2}, {true,c3} };
	}

	
	@Test(dataProvider="saveTest")
	
	public void save(boolean result , GroupEntityTesting cc){
		Assert.assertEquals(result , cc.saveGroup());
	}

	private Object saveGroup() {
		// TODO Auto-generated method stub
		return null;
	}

}
