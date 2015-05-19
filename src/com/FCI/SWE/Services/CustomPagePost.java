package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.CustomPagePostEntity;
import com.FCI.SWE.ServicesModels.PrivatePagePostEntity;
import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
/**
 * class to define Custom Page Post
 * @author Nabila
 *
 */
<<<<<<< HEAD
public class CustomPagePost extends PagePostPrivacy 
{
private String Who_see ;
=======
public class CustomPagePost extends PagePostPrivacy {
private String Who_see;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
/**
 * 
 * @param userName : user name
 * @param content : content of any post
 * @param privacy : showing the privacy of post(custom)
 * @param Who_see : users who can see post
 * @param PageName : page name
 */
<<<<<<< HEAD
	public CustomPagePost(String userName , String content ,
			String privacy , String Who_see , String PageName) 
	{
		super(userName, content, privacy,PageName) ;
		this.Who_see=Who_see ;
		// TODO Auto-generated constructor stub
	}

	public String getWho_see()
	{
		return Who_see ;
	}

	public void setWho_see(String who_see) 
	{
		Who_see = who_see ;
	}

	@Override
	/**
	 * function to call save record in entity
	 */
	public boolean save() 
	{
		// TODO Auto-generated method stub
		boolean found=CustomPagePostEntity.save(this) ;
		return found ;
=======
<<<<<<< HEAD
=======
=======

public class CustomPagePost extends PagePostPrivacy {
private String Who_see;
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public CustomPagePost(String userName, String content,
			String privacy,String Who_see,String PageName) {
		super(userName, content, privacy,PageName);
		this.Who_see=Who_see;
		// TODO Auto-generated constructor stub
	}

	public String getWho_see() {
		return Who_see;
	}

	public void setWho_see(String who_see) {
		Who_see = who_see;
	}

	@Override
<<<<<<< HEAD
	/**
	 * function to call save record in entity
	 */
=======
<<<<<<< HEAD
	/**
	 * function to call save record in entity
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public boolean save() {
		// TODO Auto-generated method stub
		boolean found=CustomPagePostEntity.save(this);
		return found;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		
	}
}
