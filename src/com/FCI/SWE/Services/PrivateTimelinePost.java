package com.FCI.SWE.Services;

import java.util.Vector;

import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;



public class PrivateTimelinePost extends PostPrivacy {

	public PrivateTimelinePost(String userName, String content, String feeling,
			String privacy, String owner, String hashTag) {
		super(userName, content, feeling, privacy, owner,hashTag);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		boolean found=PrivateTimelinePostEntity.save(this);
		return found;
		
	}


}
