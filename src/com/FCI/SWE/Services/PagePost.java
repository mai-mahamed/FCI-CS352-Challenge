package com.FCI.SWE.Services;
public class PagePost {
	private static PagePostPrivacy p;
/**
 * 
 * @param p : post want to save
 */
	public PagePost(PagePostPrivacy p) {
		
		this.p = p;
	}
/**
 * function add page post to table
 * @return if added or not
 */
	public static boolean add() {
		// TODO Auto-generated method stub
		System.out.println("inside add fun.");
		boolean found=p.save();
		return found;
		
	}
	

}
