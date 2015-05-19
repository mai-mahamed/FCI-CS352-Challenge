package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.FriendEntity;

public class FriendEntityTesting {

	/**
	 * Saving friends 
	 */
	@Test
	public void saveFriendUser(){
		FriendEntity FU = new FriendEntity(1, 5, "o");
		Assert.assertEquals(FU.saveFriendUser().booleanValue(), true);
	}
	
	/**
	 * this function used to get all the friends' IDs
	 */
	@Test
	  public void getAllFriendsID() {
	    //throw new RuntimeException("Test not implemented");
		
		  Assert.assertEquals(FriendEntity.getAllFriendsID(1),3);
	  }
	/**
	 * this function used to get all the friends' IDs in a list(vector)
	 */
	
	@Test
	  public void getAllFriendsIDList() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<Long> list=FriendEntity.getAllFriendsIDList(1);

		  Assert.assertEquals(list.size(),2);
	  }
	/**
	 * this function used to change the status of friends after sending friend request from "send" to "active"
	 */
	
	@Test
	  public void changeStatus() {
	    //throw new RuntimeException("Test not implemented");
		

		  Assert.assertEquals(FriendEntity.changeStatus(1,2),true);
	  }
	/**
	 * this function used to check whether 2 user entities are friends or not(current active user, friend user)
	 */
	@Test
	  public void Check() {
	    //throw new RuntimeException("Test not implemented");
		

		  Assert.assertEquals(FriendEntity.Check(1,4),true);
	  }
}

 