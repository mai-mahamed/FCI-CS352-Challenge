package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.PageEntity;

public class PageEntityTesting {
	
	/**
	 * saving pages
	 */
	@Test
	  public void savePage() {
	    PageEntity PE = new PageEntity("DSRProject","Programming","Btree","n");
		  Assert.assertEquals(PE.savePage(),true);

    }
	
	/**
	 * get all number of likes in this page 
	 */
	@Test
	  public void increaseLikes() {
	    //throw new RuntimeException("Test not implemented");
		  Assert.assertEquals(PageEntity.increaseLikes("DSRProject"),true);

  }

}
