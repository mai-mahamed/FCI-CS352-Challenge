package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.GroupEntity;

public class GroupEntityTesting {
	
	/**
	 * saving groups 
	 */
	@Test
	  public void saveGroup() {
	    //throw new RuntimeException("Test not implemented");
		  Boolean b=true;
		  GroupEntity UE = new GroupEntity();
		  UE.setDescription("fra7");
		  UE.setName("ahlnBl3ed");
		  UE.setOwnerId(1);
		  UE.setPrivacy("Public");
		  Assert.assertEquals(UE.saveGroup(),b);

    }
	

}
