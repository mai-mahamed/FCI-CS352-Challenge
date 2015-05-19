package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.CustomSharedPostEntity;

public class CustomSharedPostEntityTesting {
	
	/**
	 * saving posts
	 */
	@Test
	  public void save() {
	    CustomSharedPostEntity UE = new CustomSharedPostEntity("n","Hello","Custom","5","mai","(m,n)");
		  Assert.assertEquals(UE.save(),true);

    }

}
