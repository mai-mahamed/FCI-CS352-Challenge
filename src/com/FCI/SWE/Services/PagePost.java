package com.FCI.SWE.Services;
public class PagePost {
<<<<<<< HEAD
	private static PagePostPrivacy p ;
=======
	private static PagePostPrivacy p;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
/**
 * 
 * @param p : post want to save
 */
<<<<<<< HEAD
	public PagePost(PagePostPrivacy p) 
	{
		
		this.p = p ;
	}
/** 
 * function add page post to table
 * @return if added or not
 */
	public static boolean add() 
	{
		// TODO Auto-generated method stub
		System.out.println("inside add fun.") ;
		boolean found = p.save() ;
		return found ;
=======
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
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		
	}
	

}
