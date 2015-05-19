package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.privateSharedPostEntity;

public class PrivateSharedPostEntityTesting {

	/**
	 * saving posts that user shared it from timeline with private privacy
	 */
	@Test
	  public void save() {
	    //throw new RuntimeException("Test not implemented");
		  
		  privateSharedPostEntity UE = new privateSharedPostEntity("n","Hello","Private","5","mai");
		  Assert.assertEquals(UE.save(),true);

    }
}
