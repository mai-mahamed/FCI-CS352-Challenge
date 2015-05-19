package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.PublicSharedPostEntity;


public class PublicSharedPostEntityTesting {
	
	/**
	 * saving posts that user shared it from his timeline with public privacy
	 */
	@Test
	  public void save () {
	    //throw new RuntimeException("Test not implemented");
		 
		  PublicSharedPostEntity PS = new PublicSharedPostEntity("n","Hello","Public","5","mai");
		  Assert.assertEquals(PS.save(),true);
	}

}
