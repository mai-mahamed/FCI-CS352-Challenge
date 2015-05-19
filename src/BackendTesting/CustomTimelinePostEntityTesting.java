package BackendTesting;

import java.util.List;
import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.CustomTimelinePost;
import com.FCI.SWE.ServicesModels.CustomTimelinePostEntity;

public class CustomTimelinePostEntityTesting {

<<<<<<< HEAD
	/**
	 * Saving Posts in timeline with custom privacy
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	@Test
	public void save(){
		//CustomTimelinePostEntity CE = new CustomTimelinePostEntity("mai", "Hello", "happy", "custom", "m", 4, "love", "n");
		CustomTimelinePost customTimelinePost = null;
		Assert.assertEquals(CustomTimelinePostEntity.save(customTimelinePost), true);
	}
	
<<<<<<< HEAD
	/**
	 * return all lists
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public void getAllList() {
	    //throw new RuntimeException("Test not implemented");
		

		  Vector<CustomTimelinePost> list = CustomTimelinePostEntity.getAllList("sad");
		  Assert.assertEquals(list.size(),1);
	  }
	
<<<<<<< HEAD
	/**
	 * return all lists with its counts
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	@Test
	  public void getAllListCount() {
	    //throw new RuntimeException("Test not implemented");
		

		List<String>list= CustomTimelinePostEntity.getAllListCount();
		  Assert.assertEquals(list.size(),8);
	  }
	
<<<<<<< HEAD
	/**
	 * check access in data store
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	@Test
	  public void checkaccess() {
	    //throw new RuntimeException("Test not implemented");
		

		Vector<CustomTimelinePostEntity> list = CustomTimelinePostEntity.checkaccess("n");
		  Assert.assertEquals(list.size(),8);
	  }
}
