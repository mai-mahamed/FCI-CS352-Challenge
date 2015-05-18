package BackendTesting;

import java.util.List;
import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.CustomTimelinePost;
import com.FCI.SWE.ServicesModels.CustomTimelinePostEntity;

public class CustomTimelinePostEntityTesting {

	@Test
	public void save(){
		//CustomTimelinePostEntity CE = new CustomTimelinePostEntity("mai", "Hello", "happy", "custom", "m", 4, "love", "n");
		CustomTimelinePost customTimelinePost = null;
		Assert.assertEquals(CustomTimelinePostEntity.save(customTimelinePost), true);
	}
	
	public void getAllList() {
	    //throw new RuntimeException("Test not implemented");
		

		  Vector<CustomTimelinePost> list = CustomTimelinePostEntity.getAllList("sad");
		  Assert.assertEquals(list.size(),1);
	  }
	
	@Test
	  public void getAllListCount() {
	    //throw new RuntimeException("Test not implemented");
		

		List<String>list= CustomTimelinePostEntity.getAllListCount();
		  Assert.assertEquals(list.size(),8);
	  }
	
	@Test
	  public void checkaccess() {
	    //throw new RuntimeException("Test not implemented");
		

		Vector<CustomTimelinePostEntity> list = CustomTimelinePostEntity.checkaccess("n");
		  Assert.assertEquals(list.size(),8);
	  }
}
