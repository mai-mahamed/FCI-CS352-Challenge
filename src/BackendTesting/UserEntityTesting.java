package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.*;

public class UserEntityTesting
{
	/**
	 * saving users
	 */
	@Test
	  public void saveUser() {
	    //throw new RuntimeException("Test not implemented");
		  Boolean b=true;
		  UserEntity UE = new UserEntity("n","n@n","123");
		  Assert.assertEquals(UE.saveUser(),b);

      }
	
	/**
	 * return all users
	 */
	@Test
	  public void getUser() {
	    //throw new RuntimeException("Test not implemented");
		  
		  UserEntity UE = new UserEntity("n","n@n","123");
		  Assert.assertEquals(UserEntity.getUser("n", "123"),UE);

    }
	
	/**
	 * return all users IDs
	 */
	@Test
	  public void getUserID() {
	    //throw new RuntimeException("Test not implemented");
		  
		 
		  long ID=1;
		  Assert.assertEquals(UserEntity.getUserID("n"),ID);

  }
	
	/**
	 * return all users names
	 */
	@Test
	  public void getUserName() {
	    //throw new RuntimeException("Test not implemented");
		  
		   long ID=1;
		  Assert.assertEquals(UserEntity.getUserName(ID),"n");

  }
	
}
