package com.FCI.SWE.Services;
public class PagePost {
	private static PagePostPrivacy p;
<<<<<<< HEAD
/**
 * 
 * @param p : post want to save
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public PagePost(PagePostPrivacy p) {
		
		this.p = p;
	}
<<<<<<< HEAD
/**
 * function add page post to table
 * @return if added or not
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public static boolean add() {
		// TODO Auto-generated method stub
		System.out.println("inside add fun.");
		boolean found=p.save();
		return found;
		
	}
	

}
