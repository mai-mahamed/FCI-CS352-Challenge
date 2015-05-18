package com.FCI.SWE.Services;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
/**
 * class builder for post builder design pattern
 * @author Nabila
 *
 */
<<<<<<< HEAD
=======
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
public class PostBuilder {
	
	public static boolean perparePost(PostPrivacy p)
	{System.out.println("inside perpare fun.");
		Post post =new Post(p);
		boolean found=post.add();
		return found;
	}

}
