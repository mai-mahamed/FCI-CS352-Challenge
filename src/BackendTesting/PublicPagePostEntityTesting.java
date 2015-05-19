package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.PublicPagePost;
import com.FCI.SWE.ServicesModels.PublicPagePostEntity;



public class PublicPagePostEntityTesting {

	@Test
	public void save(){
		//PublicPagePostEntity pu = new PublicPagePostEntity("n", "HHHHHHHHHHHHHHHHH", "public", 1, "SWIIProject", 1) ;
		PublicPagePost publicPagePost = null;
		Assert.assertEquals(PublicPagePostEntity.save(publicPagePost), true);
	}
	
	public void check() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<PublicPagePostEntity> list=PublicPagePostEntity.check("SWII project","n");
		  Assert.assertEquals(list.size(),15);
	  }
	  @Test (dependsOnMethods={"check"})
	    public void increaseSeen() {
	    //throw new RuntimeException("Test not implemented");
		
		  Assert.assertEquals(PublicPagePostEntity.increaseSeen(1),true);
	  }
}
