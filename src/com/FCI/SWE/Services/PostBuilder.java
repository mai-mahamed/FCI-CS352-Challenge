package com.FCI.SWE.Services;
<<<<<<< HEAD
/**
 * class builder for post builder design pattern
 * @author Nabila
 *
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
public class PostBuilder {
	
	public static boolean perparePost(PostPrivacy p)
	{System.out.println("inside perpare fun.");
		Post post =new Post(p);
		boolean found=post.add();
		return found;
	}

}
