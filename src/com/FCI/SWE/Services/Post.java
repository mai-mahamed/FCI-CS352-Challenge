package com.FCI.SWE.Services;

public class Post 
{
	private PostPrivacy p ;
/**
 * 
 * @param p : post
 */
	public Post(PostPrivacy p) {
		
		this.p = p ;
	}
/**
 * add post 
 * @return done or not
 */
	public boolean add()
	{
		// TODO Auto-generated method stub
		System.out.println("inside add fun.") ;
		boolean found=p.save() ;
		return found ;
		
	}
	

}
