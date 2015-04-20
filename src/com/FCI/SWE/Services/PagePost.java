package com.FCI.SWE.Services;
public class PagePost {
	private static PagePostPrivacy p;

	public PagePost(PagePostPrivacy p) {
		
		this.p = p;
	}

	public static boolean add() {
		// TODO Auto-generated method stub
		System.out.println("inside add fun.");
		boolean found=p.save();
		return found;
		
	}
	

}
