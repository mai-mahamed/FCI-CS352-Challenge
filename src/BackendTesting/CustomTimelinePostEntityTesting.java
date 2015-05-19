package BackendTesting;

import java.util.List;
import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.CustomTimelinePost;
import com.FCI.SWE.ServicesModels.CustomTimelinePostEntity;

public class CustomTimelinePostEntityTesting {

	/**
	 * Saving Posts in timeline with custom privacy
	 */
	@Test
	public void save(){
		//CustomTimelinePostEntity CE = new CustomTimelinePostEntity("mai", "Hello", "happy", "custom", "m", 4, "love", "n");
		CustomTimelinePost customTimelinePost = null;
		Assert.assertEquals(CustomTimelinePostEntity.save(customTimelinePost), true);
	}
	
	/**
	 * return all lists
	 */
	public void getAllList() {
	    //throw new RuntimeException("Test not implemented");
		

		  Vector<CustomTimelinePost> list = CustomTimelinePostEntity.getAllList("sad");
		  Assert.assertEquals(list.size(),1);
	  }
	
	/**
	 * return all lists with its counts
	 */
	@Test
	  public void getAllListCount() {
	    //throw new RuntimeException("Test not implemented");
		

		List<String>list= CustomTimelinePostEntity.getAllListCount();
		  Assert.assertEquals(list.size(),8);
	  }
	
	/**
	 * check access in data store
	 */
	@Test
	  public void checkaccess() {
	    //throw new RuntimeException("Test not implemented");
		

		Vector<CustomTimelinePostEntity> list = CustomTimelinePostEntity.checkaccess("n");
		  Assert.assertEquals(list.size(),8);
	  }
}
