package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.PrivateOwnerSharedPostEntity;

public class PrivateOwnerSharedPostEntityTesting {
	
	/**
	 * saving posts that user shared it from his timeline with private privacy
	 */
	@Test
	  public void save() {
	    PrivateOwnerSharedPostEntity POS = new PrivateOwnerSharedPostEntity("n","Hello","private","5","mai");
		  Assert.assertEquals(POS.save(),true);

    }

}
