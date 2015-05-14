package com.FCI.SWE.Services;

public class Observers {
	private GMsgSubject s;
	private String name;
	
	
	public Observers(String name2, GMsgSubject gMsgSubject) {
		name=name2;
		s=gMsgSubject;
	}


	public void update()
	{
		System.out.println("Now you are added to new Conversation");
	}
	

}
