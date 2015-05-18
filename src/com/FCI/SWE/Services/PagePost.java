package com.FCI.SWE.Services;
public class PagePost {
	private static PagePostPrivacy p;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
/**
 * 
 * @param p : post want to save
 */
<<<<<<< HEAD
=======
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public PagePost(PagePostPrivacy p) {
		
		this.p = p;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
/**
 * function add page post to table
 * @return if added or not
 */
<<<<<<< HEAD
=======
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public static boolean add() {
		// TODO Auto-generated method stub
		System.out.println("inside add fun.");
		boolean found=p.save();
		return found;
		
	}
	

}
