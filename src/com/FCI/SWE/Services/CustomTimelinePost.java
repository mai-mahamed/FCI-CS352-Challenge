package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.CustomTimelinePostEntity;

public class CustomTimelinePost extends PostPrivacy {

	private String WhoSee;
	public CustomTimelinePost(String userName, String content, String feeling,
			String privacy, String WhoSee,String owner, String hashTag) {
		super(userName, content, feeling, privacy, owner,hashTag);
		// TODO Auto-generated constructor stub
		this.WhoSee=WhoSee;
	}
	
	public String getWhoSee() {
		return WhoSee;
	}

	public void setWhoSee(String whoSee) {
		WhoSee = whoSee;
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
		boolean found=CustomTimelinePostEntity.save(this);
		return found;
		
	}

}
