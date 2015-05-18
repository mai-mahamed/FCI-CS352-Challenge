package com.FCI.SWE.Services;

import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;
import com.FCI.SWE.ServicesModels.PublicTimelinePostEntity;

public class PublicTimelinePost extends PostPrivacy {

	public PublicTimelinePost(String userName, String content, String feeling,
			String privacy, String owner,String HashTag) {
		super(userName, content, feeling, privacy, owner,HashTag);
		// TODO Auto-generated constructor stub
		System.out.println("inside public class");
	}

	

	@Override
	/**
	 * function save post in entity
	 */
	public boolean save() {
		// TODO Auto-generated method stub
		System.out.println("inside save fun.");
		boolean found=PublicTimelinePostEntity.save(this);
		return found;
		

	}

}
