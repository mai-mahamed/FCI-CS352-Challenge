package com.FCI.SWE.Services;

public class PostBuilder {
	
	public static boolean perparePost(PostPrivacy p)
	{System.out.println("inside perpare fun.");
		Post post =new Post(p);
		boolean found=post.add();
		return found;
	}

}
