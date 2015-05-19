package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.PrivateTimelinePost;
import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;



public class PrivateTimelinePostEntityTesting {

	@Test
	public void save(){
		PrivateTimelinePostEntity PP = new PrivateTimelinePostEntity("n", "Welcome", "sad", "public", "m", 1, "sad") ;
		PrivateTimelinePost privateTimelinePost = null;
		Assert.assertEquals(PrivateTimelinePostEntity.save(privateTimelinePost),true);
		
	}
	
	@Test
	  public void getAllList() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<PrivateTimelinePost> list=PrivateTimelinePostEntity.getAllList("SWII");

		  Assert.assertEquals(list.size(),1);
	  }

@Test
	  public void getAllListCount() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<String> list=(Vector<String>) PrivateTimelinePostEntity.getAllListCount();

		  Assert.assertEquals(list.size(),8);
	  }
@Test
	  public void check() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<PrivateTimelinePostEntity> list =PrivateTimelinePostEntity.check("n");

		  Assert.assertEquals(list.size(),2);
	  }
}
