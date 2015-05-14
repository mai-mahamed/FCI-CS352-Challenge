package com.FCI.SWE.Services;

import java.util.Vector;

import org.json.simple.JSONObject;

import com.FCI.SWE.ServicesModels.GroupMessageEntity;
import com.FCI.SWE.ServicesModels.MessagesGroupMessageEntity;

public class GMsgSubject {
	private Vector<Observers>members;
<<<<<<< HEAD
	/**
	 * 
	 * @param name : member in conversation
	 * @param name1 : member in conversation
	 * @param name2 : member in conversation
	 * @param name3 : member in conversation
	 * @param name4 : member in conversation
	 * @param conversation : name of  conversation
	 */
=======
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public void addNewConversation(String name, String name1, String name2,
			String name3, String name4, String conversation) {
	
		/*Observers s=new Observers(name,this);
	   members.add(s);	
	   Observers s1=new Observers(name1,this);
	   members.add(s1);	
	   Observers s2=new Observers(name2,this);
	   members.add(s2);	
	   Observers s3=new Observers(name3,this);
	   members.add(s3);	
	   Observers s4=new Observers(name4,this);
	   members.add(s4);	
	   notifyObservers();*/
	   GroupMessageEntity group= new GroupMessageEntity(name,name1,name2,name3,name4,conversation);
	   group.saveGroupMessage();
	   
	 
	  
	}
<<<<<<< HEAD
/**
 * notify all members
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public void notifyObservers() {
	   for(int i=0;i<members.size();i++)
	   {
		   members.get(i).update();
	   }
		
	}
<<<<<<< HEAD
/**
 * add new message to conversation
 * @param conversation_Name : name of conversation
 * @param msg : the message 
 * @param name : user name
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public void addNewMsg(String conversation_Name, String msg, String name) {
		// TODO Auto-generated method stub
		MessagesGroupMessageEntity group= new MessagesGroupMessageEntity(name,msg,conversation_Name);
	    group.saveMessageGroupMessage();
	    
	    //getMembers(conversation_Name);
	    //notifyObservers();
	    
		
	}
<<<<<<< HEAD
/**
 * function get all members in conversation
 * @param Cname : conversation name
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public void getMembers(String Cname) {
		// TODO Auto-generated method stub
		GroupMessageEntity group=GroupMessageEntity.getgroup(Cname);
		String n1=group.getname1();
		Observers s1=new Observers(n1,this);
		members.add(s1);
		String n2=group.getname2();
		 Observers s2=new Observers(n2,this);
		 members.add(s2);
		String n3=group.getname3();
		 Observers s3=new Observers(n3,this);
		   members.add(s3);
		String n4=group.getname4();
		 Observers s4=new Observers(n4,this);
		   members.add(s4);
		   notifyObservers();   
		
	}

}
