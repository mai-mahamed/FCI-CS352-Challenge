package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.FriendEntity;

public class FriendEntityTesting {

	@Test
	public void saveFriendUser(){
		FriendEntity FU = new FriendEntity(1, 5, "o");
		Assert.assertEquals(FU.saveFriendUser().booleanValue(), true);
	}
	
	@Test
	  public void getAllFriendsID() {
	    //throw new RuntimeException("Test not implemented");
		
		  Assert.assertEquals(FriendEntity.getAllFriendsID(1),3);
	  }
	
	@Test
	  public void getAllFriendsIDList() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<Long> list=FriendEntity.getAllFriendsIDList(1);

		  Assert.assertEquals(list.size(),2);
	  }
	
	@Test
	  public void changeStatus() {
	    //throw new RuntimeException("Test not implemented");
		

		  Assert.assertEquals(FriendEntity.changeStatus(1,2),true);
	  }
	
	@Test
	  public void Check() {
	    //throw new RuntimeException("Test not implemented");
		

		  Assert.assertEquals(FriendEntity.Check(1,4),true);
	  }
}

 