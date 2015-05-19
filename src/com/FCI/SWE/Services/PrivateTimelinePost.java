package com.FCI.SWE.Services;

import java.util.Vector;

import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;



<<<<<<< HEAD
public class PrivateTimelinePost extends PostPrivacy 
{

	public PrivateTimelinePost(String userName , String content , String feeling ,
			String privacy, String owner, String hashTag) 
	{
		super(userName, content, feeling, privacy, owner,hashTag) ;
		// TODO Auto-generated constructor stub
	}
	/**
	 * function save post in entity
	 */
	@Override
	public boolean save() 
	{
		// TODO Auto-generated method stub
		boolean found=PrivateTimelinePostEntity.save(this) ;
=======
public class PrivateTimelinePost extends PostPrivacy {

	public PrivateTimelinePost(String userName, String content, String feeling,
			String privacy, String owner, String hashTag) {
		super(userName, content, feeling, privacy, owner,hashTag);
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		boolean found=PrivateTimelinePostEntity.save(this);
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		return found;
		
	}


}
