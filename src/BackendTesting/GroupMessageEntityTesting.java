package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.GroupMessageEntity;

public class GroupMessageEntityTesting {

	@Test
	  public void saveMessageGroupMessage() {
	    //throw new RuntimeException("Test not implemented");
		  GroupMessageEntity GM = new GroupMessageEntity("n","mai","malak","mohamed","m","HHHHHHHHHHHHHHHH");
		  Assert.assertEquals(GM.saveGroupMessage(),GM);
	}
	
	@Test
	  public void check() {
	    //throw new RuntimeException("Test not implemented");
		  Assert.assertEquals(GroupMessageEntity.check("mai","FCI"),true);
	  }
	
	@Test
	  public void getAllFriendsConvList() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<String> list=GroupMessageEntity.getAllFriendsConvList("mai");
		  Assert.assertEquals(list.size(),1);
	  }
}
