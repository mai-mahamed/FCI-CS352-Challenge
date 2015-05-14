package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.UserEntity;

public class SingleMSGCommand implements  Command{

	@Override
<<<<<<< HEAD
	/**
	 * function get all single message notification that are sent to this user
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public String exec(long id) {
		String name=UserEntity.getUserName(id);
		String user= MessageEntity.getAllMessagesList(name);
		return user;
	}

}
