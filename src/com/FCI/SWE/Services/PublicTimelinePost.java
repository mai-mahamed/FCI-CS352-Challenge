package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;
import com.FCI.SWE.ServicesModels.PublicTimelinePostEntity;

<<<<<<< HEAD
public class PublicTimelinePost extends PostPrivacy
{

	public PublicTimelinePost(String userName, String content , String feeling ,
			String privacy, String owner,String HashTag)  
	{
		super (userName , content , feeling , privacy , owner , HashTag) ;
		// TODO Auto-generated constructor stub
		System.out.println("inside public class") ;
=======
public class PublicTimelinePost extends PostPrivacy {

	public PublicTimelinePost(String userName, String content, String feeling,
			String privacy, String owner,String HashTag) {
		super(userName, content, feeling, privacy, owner,HashTag);
		// TODO Auto-generated constructor stub
		System.out.println("inside public class");
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}

	

	@Override
<<<<<<< HEAD
	/**
	 * function save post in entity
	 */
	public boolean save() 
	{
		// TODO Auto-generated method stub
		System.out.println("inside save fun.") ;
		boolean found=PublicTimelinePostEntity.save(this) ;
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
		System.out.println("inside save fun.");
		boolean found=PublicTimelinePostEntity.save(this);
		return found;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		

	}

}
