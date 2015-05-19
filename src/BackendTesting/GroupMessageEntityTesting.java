package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.GroupMessageEntity;

public class GroupMessageEntityTesting {

<<<<<<< HEAD
	/**
	 * this function used to save group messages between current active use and friends users
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	@Test
	  public void saveMessageGroupMessage() {
	    //throw new RuntimeException("Test not implemented");
		  GroupMessageEntity GM = new GroupMessageEntity("n","mai","malak","mohamed","m","HHHHHHHHHHHHHHHH");
		  Assert.assertEquals(GM.saveGroupMessage(),GM);
	}
	
<<<<<<< HEAD
	/**
	 * this function used to check if you are in the conversation or not
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	@Test
	  public void check() {
	    //throw new RuntimeException("Test not implemented");
		  Assert.assertEquals(GroupMessageEntity.check("mai","FCI"),true);
	  }
	
<<<<<<< HEAD
	/**
	 * this function used to retrieve a list contains all the friends in the group message conversation
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	@Test
	  public void getAllFriendsConvList() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<String> list=GroupMessageEntity.getAllFriendsConvList("mai");
		  Assert.assertEquals(list.size(),1);
	  }
}
