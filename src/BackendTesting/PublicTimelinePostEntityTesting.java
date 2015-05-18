package BackendTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.Services.PublicTimelinePost;
import com.FCI.SWE.ServicesModels.PublicTimelinePostEntity;



public class PublicTimelinePostEntityTesting {

	@Test
	public void save(){
		//PublicTimelinePostEntity pe = new PublicTimelinePostEntity("n", "HHHHHHHHHHHH", "boring", "public", "m", 3, "boring") ;
		PublicTimelinePost publicTimelinePost = null;
		Assert.assertEquals(PublicTimelinePostEntity.save(publicTimelinePost), true);
	}
}
