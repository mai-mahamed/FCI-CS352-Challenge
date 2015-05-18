package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.PrivatePagePostEntity;
import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;
import com.FCI.SWE.ServicesModels.PublicPagePostEntity;

public class PublicPagePost extends PagePostPrivacy {

	public PublicPagePost(String userName, String content,
			String privacy,String PageName) {
		super(userName, content, privacy,PageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * function save post in entity
	 */
	public boolean save() {
		// TODO Auto-generated method stub
		boolean found=PublicPagePostEntity.save(this);
		return found;
		
	}
}
