package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.PrivatePagePost;
import com.FCI.SWE.ServicesModels.PrivatePagePostEntity;



public class PrivatePagePostEntityTesting {

	@Test
	public void save(){
		//PrivatePagePostEntity PU = new PrivatePagePostEntity("n", "Welcome", "public", 2, "AI", 2) ;
		PrivatePagePost privatePagePost = null;
		Assert.assertEquals(PrivatePagePostEntity.save(privatePagePost), true);
	}
	
	@Test
	  public void check() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<PrivatePagePostEntity> list=PrivatePagePostEntity.check("SWII project","n");
		  Assert.assertEquals(list.size(),15);
	  }
	  @Test (dependsOnMethods={"check"})
	    public void increaseSeen() {
	    //throw new RuntimeException("Test not implemented");
		
		  Assert.assertEquals(PrivatePagePostEntity.increaseSeen(1),true);
	  }
}

