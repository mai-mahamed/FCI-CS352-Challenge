package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.CustomPagePostEntity;
import com.FCI.SWE.ServicesModels.PrivatePagePostEntity;
import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;
/**
 * class to define Custom Page Post
 * @author Nabila
 *
 */
public class CustomPagePost extends PagePostPrivacy {
private String Who_see;
/**
 * 
 * @param userName : user name
 * @param content : content of any post
 * @param privacy : showing the privacy of post(custom)
 * @param Who_see : users who can see post
 * @param PageName : page name
 */
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
	/**
	 * function to call save record in entity
	 */
	public boolean save() {
		// TODO Auto-generated method stub
		boolean found=CustomPagePostEntity.save(this);
		return found;
		
	}
}
