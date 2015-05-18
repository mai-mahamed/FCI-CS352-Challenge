package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.LikesEntity;


public class LikesEntityTesting
{
	/**
	 * saving likes
	 */
	@Test
	  public void save() {
	    //throw new RuntimeException("Test not implemented");
		  Boolean b=true;
		  LikesEntity lE = new LikesEntity("n","SWIIProject");
		  Assert.assertEquals(lE.save(),b);

    }
	
	/**
	 * checking page name that user enter it correct or not and user name is correct or not
	 */
	@Test
	  public void checkaccess() {
	    //throw new RuntimeException("Test not implemented");
		  Assert.assertEquals(LikesEntity.checkaccess("SWIIProject","n"),true);

  }
	

}
