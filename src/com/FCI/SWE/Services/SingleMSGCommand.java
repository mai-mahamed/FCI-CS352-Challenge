package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.UserEntity;

public class SingleMSGCommand implements  Command 
{

	@Override
	/**
	 * function get all single message notification that are sent to this user
	 */
	public String exec(long id) 
	{
		String name = UserEntity.getUserName(id) ;
		String user= MessageEntity.getAllMessagesList(name) ;
		return user ;
	}

}
