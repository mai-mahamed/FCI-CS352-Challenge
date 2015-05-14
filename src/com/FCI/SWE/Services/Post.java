package com.FCI.SWE.Services;

public class Post {
	private PostPrivacy p;
<<<<<<< HEAD
/**
 * 
 * @param p : post
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public Post(PostPrivacy p) {
		
		this.p = p;
	}
<<<<<<< HEAD
/**
 * add post 
 * @return done or not
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public boolean add() {
		// TODO Auto-generated method stub
		System.out.println("inside add fun.");
		boolean found=p.save();
		return found;
		
	}
	

}
