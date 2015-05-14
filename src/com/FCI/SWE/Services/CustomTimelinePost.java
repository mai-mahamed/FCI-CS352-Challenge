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
	/**
	 * function to call save record in entity
	 */
	public boolean save() {
		// TODO Auto-generated method stub
		boolean found=CustomTimelinePostEntity.save(this);
		return found;
		
	}

}
