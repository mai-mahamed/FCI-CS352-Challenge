package BackendTesting;

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
}
