package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.MessagesGroupMessageEntity;

public class MessagesGroupMessegeEntityTesting {
	@Test
	  public void check() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<MessagesGroupMessageEntity> list=MessagesGroupMessageEntity.check("FCI");

		  Assert.assertEquals(list.size(),2);
	  }

@Test
	  public void saveMessageGroupMessage() {
	    //throw new RuntimeException("Test not implemented");
		
	MessagesGroupMessageEntity obj = new MessagesGroupMessageEntity("n","Done","FCI");
boolean b = true ;
		  Assert.assertEquals(obj.saveMessageGroupMessage().booleanValue(),b);
	  }

}
