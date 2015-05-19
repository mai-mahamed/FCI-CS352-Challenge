package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.PrivatePagePostEntity;
import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;

public class PrivatePagePost extends PagePostPrivacy {

<<<<<<< HEAD
	public PrivatePagePost (String userName , String content,
			String privacy,String PageName) 
	{
		super (userName, content, privacy ,PageName) ;
=======
	public PrivatePagePost(String userName, String content,
			String privacy,String PageName) {
		super(userName, content, privacy,PageName);
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		// TODO Auto-generated constructor stub
	}

	@Override
<<<<<<< HEAD
	/**
	 * function save post in entity
	 */
	public boolean save()
	{
		// TODO Auto-generated method stub
		boolean found=PrivatePagePostEntity.save(this) ;
		return found ; 
=======
<<<<<<< HEAD
	/**
	 * function save post in entity
	 */
=======
<<<<<<< HEAD
	/**
	 * function save post in entity
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public boolean save() {
		// TODO Auto-generated method stub
		boolean found=PrivatePagePostEntity.save(this);
		return found;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		
	}
}
