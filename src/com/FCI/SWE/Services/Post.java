package com.FCI.SWE.Services;

public class Post {
	private PostPrivacy p;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
/**
 * 
 * @param p : post
 */
<<<<<<< HEAD
=======
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public Post(PostPrivacy p) {
		
		this.p = p;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
/**
 * add post 
 * @return done or not
 */
<<<<<<< HEAD
=======
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public boolean add() {
		// TODO Auto-generated method stub
		System.out.println("inside add fun.");
		boolean found=p.save();
		return found;
		
	}
	

}
