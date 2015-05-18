package BackendTesting;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.MessagesGroupMessageEntity;

public class MessageEntityTesting {
	
	/**
	 * saving friends
	 */
	@Test
	  public void saveFriendUser() {
	    //throw new RuntimeException("Test not implemented");
		  Boolean b=true;
		  MessageEntity UE = new MessageEntity("n","mai","hai");
		  Assert.assertEquals(UE.saveFriendUser(),b);

    }
	
	/**
	 * return all messages
	 */
	@Test
	  public void getAllMessagesList() {
	    //throw new RuntimeException("Test not implemented");
		  Assert.assertEquals(MessageEntity.getAllMessagesList("n"),true);

    }
	
	@Test
	  public void check() {
	    //throw new RuntimeException("Test not implemented");
		
	Vector<MessagesGroupMessageEntity> list=MessagesGroupMessageEntity.check("FCI");
		  Assert.assertEquals(list.size(),5);
	  }

}
