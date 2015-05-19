package BackendTesting;

import java.util.Vector;

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
	
	@Test
	  public void getAllList() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<PublicTimelinePost> list=PublicTimelinePostEntity.getAllList("happy");

		  Assert.assertEquals(list.size(),2);
	  }

@Test
	  public void getAllListCount() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<String> list=(Vector<String>) PublicTimelinePostEntity.getAllListCount();

		  Assert.assertEquals(list.size(),3);
	  }
@Test
	  public void check() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<PublicTimelinePostEntity> list =PublicTimelinePostEntity.check("n");

		  Assert.assertEquals(list.size(),5);
	  }
}
