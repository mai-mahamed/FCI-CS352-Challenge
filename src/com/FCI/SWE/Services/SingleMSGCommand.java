package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.UserEntity;

<<<<<<< HEAD
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
=======
public class SingleMSGCommand implements  Command{

	@Override
<<<<<<< HEAD
	/**
	 * function get all single message notification that are sent to this user
	 */
=======
<<<<<<< HEAD
	/**
	 * function get all single message notification that are sent to this user
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public String exec(long id) {
		String name=UserEntity.getUserName(id);
		String user= MessageEntity.getAllMessagesList(name);
		return user;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}

}
