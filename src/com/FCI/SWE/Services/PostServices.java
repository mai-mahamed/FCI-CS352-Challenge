package com.FCI.SWE.Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Iterator;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.mvc.Viewable;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.FCI.SWE.Models.User;
import com.FCI.SWE.ServicesModels.CustomOwnerSharedPostEntity;
import com.FCI.SWE.ServicesModels.CustomPagePostEntity;
import com.FCI.SWE.ServicesModels.CustomSharedPostEntity;
import com.FCI.SWE.ServicesModels.CustomTimelinePostEntity;
import com.FCI.SWE.ServicesModels.FriendEntity;
import com.FCI.SWE.ServicesModels.GroupEntity;
import com.FCI.SWE.ServicesModels.GroupMessageEntity;
import com.FCI.SWE.ServicesModels.LikesEntity;
import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.MessagesGroupMessageEntity;
import com.FCI.SWE.ServicesModels.PrivateOwnerSharedPostEntity;
import com.FCI.SWE.ServicesModels.PrivatePagePostEntity;
import com.FCI.SWE.ServicesModels.PrivateTimelinePostEntity;
import com.FCI.SWE.ServicesModels.PublicPagePostEntity;
import com.FCI.SWE.ServicesModels.PublicSharedPostEntity;
import com.FCI.SWE.ServicesModels.PublicTimelinePostEntity;
import com.FCI.SWE.ServicesModels.UserEntity;
import com.FCI.SWE.ServicesModels.privateSharedPostEntity;
/**
 * This class contains REST services, also contains action function for web
 * application
 * 
 * @author Mohamed Samir
 * @version 1.0
 * @since 2014-02-12
 *
 */
@Path("/")
@Produces(MediaType.TEXT_PLAIN)

public class PostServices {
<<<<<<< HEAD
	/**
	 * function Create My Timeline Post Service
	 * @param name : user name
	 * @param Content : content in any post
	 * @param Feeling : feeling in any post
	 * @param Privacy : showing the privacy of post(public,custom)
	 * @param HashTag : hashtag of the post 
	 * @return done or not 
	 */
=======
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/CreateMyTimelinePostService")
	public String CreateMyTimelinePostService(@FormParam("name") String name,@FormParam("Content") String Content,
			@FormParam("Feeling") String Feeling, @FormParam("Privacy") String Privacy,@FormParam("HashTag") String HashTag)
	{
		if((Privacy.toLowerCase()).contains("public"))
		{
			PostPrivacy p=new PublicTimelinePost(name,Content,Feeling,"Public",name,HashTag);
			JSONObject json = new JSONObject();
			if(PostBuilder.perparePost(p))
				json.put("Status", "OK");
			else
				json.put("Status", "Failed");
			return json.toJSONString();
		}
		else if((Privacy.toLowerCase()).contains("private"))
		{
			PostPrivacy p=new PrivateTimelinePost(name,Content,Feeling,"Private",name,HashTag);
			JSONObject json = new JSONObject();
			if(PostBuilder.perparePost(p))
				json.put("Status", "OK");
			else
				json.put("Status", "Failed");
			return json.toJSONString();
		}
		else if((Privacy.toLowerCase()).contains("custom"))
		{
			String whoSee=(Privacy.toLowerCase()).replace("custom","");
			PostPrivacy p=new CustomTimelinePost(name,Content,Feeling,"Custom",whoSee,name,HashTag);
			JSONObject json = new JSONObject();
			if(PostBuilder.perparePost(p))
				json.put("Status", "OK");
			else
				json.put("Status", "Failed");
			return json.toJSONString();
		}
		return null;
		
	}
	
<<<<<<< HEAD
	/**
	 * function Create My Timeline Post Service
	 * @param name : user name
	 * @param Content : content in any post
	 * @param Feeling : feeling in any post
	 * @param Privacy : showing the privacy of post(public,custom)
	 * @param HashTag : hashtag of the post 
	 * @param owner : timeline owner
	 * @return done or not 
	 */
=======
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/CreateFriendTimelinePostService")
	public String CreateFriendTimelinePostService(@FormParam("name") String name,@FormParam("Content") String Content,
			@FormParam("Feeling") String Feeling, 
			@FormParam("Privacy") String Privacy,
			@FormParam("owner") String owner,@FormParam("HashTag") String HashTag) {
		System.out.println("inside service");
		if((Privacy.toLowerCase()).contains("public"))
		{
			PostPrivacy p=new PublicTimelinePost(name,Content,Feeling,"Public",owner,HashTag);
			JSONObject json = new JSONObject();
			if(PostBuilder.perparePost(p))
				json.put("Status", "OK");
			else
				json.put("Status", "Failed");
			return json.toJSONString();
		}
		else if((Privacy.toLowerCase()).contains("private"))
		{
			PostPrivacy p=new PrivateTimelinePost(name,Content,Feeling,"Private",owner,HashTag);
			JSONObject json = new JSONObject();
			if(PostBuilder.perparePost(p))
				json.put("Status", "OK");
			else
				json.put("Status", "Failed");
			return json.toJSONString();
		}
		else if((Privacy.toLowerCase()).contains("custom"))
		{
			String whoSee=(Privacy.toLowerCase()).replace("custom","");
			PostPrivacy p=new CustomTimelinePost(name,Content,Feeling,"Custom",whoSee,owner,HashTag);
			JSONObject json = new JSONObject();
			if(PostBuilder.perparePost(p))
				json.put("Status", "OK");
			else
				json.put("Status", "Failed");
			return json.toJSONString();
		}
		return null;
		
	}
<<<<<<< HEAD
	/**
	 * 
	 * @param hash : statement of hashtag 
	 * @return list of all posts that contain this hashtag 
	 */
=======
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	
	@POST
	@Path("/ShowHashtagTimelineService")
	
	public String ShowHashtagTimelineService(@FormParam("Hashtag")String  hash) {
		JSONArray array=new JSONArray();
		
		Vector<CustomTimelinePost> user= new Vector<CustomTimelinePost>();

		 user= CustomTimelinePostEntity.getAllList(hash);
		 System.out.println("user:   "+user.toString());
			for(int i=0;i<user.size();i++){
				
				    JSONObject object = new JSONObject();
				    object.put("UserName", user.get(i).getUserName());
				    object.put("Content", user.get(i).getContent());
				    object.put("Feeling", user.get(i).getFeeling());
				    object.put("Likes",user.get(i).getLikes());
				    object.put("Timeline'sOwner", user.get(i).getOwner());
				    object.put("Privacy", user.get(i).getPrivacy());
				    object.put("WhoCanSee", user.get(i).getWhoSee());
				    object.put("Hashtags", user.get(i).getHashtags());
					
				    System.out.println("object0:   "+object.toString());
					array.add(object);
				
			}
			
			
			
			Vector<PrivateTimelinePost> puser= new Vector<PrivateTimelinePost>();

			 puser= PrivateTimelinePostEntity.getAllList(hash);
			
				for(int i=0;i<user.size();i++){
					
					    JSONObject object = new JSONObject();
					    object.put("UserName", puser.get(i).getUserName());
					    object.put("Content", puser.get(i).getContent());
					    object.put("Feeling", puser.get(i).getFeeling());
					    object.put("Likes",puser.get(i).getLikes());
					    object.put("Timeline'sOwner", puser.get(i).getOwner());
					    object.put("Privacy", puser.get(i).getPrivacy());
					    
					    object.put("Hashtags", puser.get(i).getHashtags());
					    System.out.println("object1:   "+object.toString());
						array.add(object);
					
				}
				
				Vector<PublicTimelinePost> puuser= new Vector<PublicTimelinePost>();

				 puuser= PublicTimelinePostEntity.getAllList(hash);
				
					for(int i=0;i<puuser.size();i++){
						
						    JSONObject object = new JSONObject();
						    object.put("UserName", puuser.get(i).getUserName());
						    object.put("Content", puuser.get(i).getContent());
						    object.put("Feeling", puuser.get(i).getFeeling());
						    object.put("Likes",puuser.get(i).getLikes());
						    object.put("Timeline'sOwner", puuser.get(i).getOwner());
						    object.put("Privacy", puuser.get(i).getPrivacy());
						    
						    object.put("Hashtags", puuser.get(i).getHashtags());
						    System.out.println("object2:   "+object.toString());
							array.add(object);
						
					}
					System.out.println("array.toString():   "+array.toString());
					return array.toString();
		
	}
<<<<<<< HEAD
/**
 * 
 * @param id : user id
 * @return all hashtags with counter
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/HashtagTrendsService")
	
	public String HashtagTrendsService(@FormParam("ID") String id) {
		System.out.println("retJson:   ");
		JSONArray array=new JSONArray();
		
		  List<String>l1=new ArrayList<String>();
		  l1= CustomTimelinePostEntity.getAllListCount();
		  List<String>l2=new ArrayList<String>();
		 l2= PrivateTimelinePostEntity.getAllListCount();
		 List<String>l3=new ArrayList<String>();
		 l3= PublicTimelinePostEntity.getAllListCount();
		 List<String>list=new ArrayList<String>();
		 list.addAll(l1);
		 list.addAll(l2);
		 list.addAll(l3);
		 Map<String,Integer>best=new HashMap<String,Integer>();
			Set<String>count=new HashSet<String>(list);
			for(String key:count)
			{
			 int c=Collections.frequency(list, key);
				
				best.put(key, c);
			}
			int counter=0;
			Map<String,Integer>sorted=new TreeMap<String,Integer>(best);
			Iterator<String> it = sorted.keySet().iterator();
			while(it.hasNext())
			{if(counter>=10)
			{
				break;
			}
			else{
				String key= it.next();
				int v=sorted.get(key);
			JSONObject object = new JSONObject();
			object.put("Hastag",key);
			object.put("Count", v);
			array.add(object);
			}
			System.out.println("array.toString():   "+array.toString());
			counter++;
			}
		return array.toString();

	}
	
	
<<<<<<< HEAD
	/**
	 *  
	 * @param uname : user name
	 * @return list with all posts in timeline
	 */
=======
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/ShowUserTimeService")
	public String ShowPageTimeService(@FormParam("name") String uname) {
		
	
		Vector<PublicTimelinePostEntity> list1=PublicTimelinePostEntity.check(uname);
		
		JSONArray array=new JSONArray();
		for(int i=0;i<list1.size();i++){
			
		    JSONObject object = new JSONObject();
		    object.put("UserName", list1.get(i).getUserName());
		    object.put("Content", list1.get(i).getContent());
		    object.put("Likes",list1.get(i).getLikes());
		    object.put("Privacy",list1.get(i).getPrivacy());
			array.add(object);
		
	}
		
		
			Vector<PrivateTimelinePostEntity> list2=PrivateTimelinePostEntity.check(uname);
		
	for(int i=0;i<list2.size();i++){
			
		    JSONObject object = new JSONObject();
		    object.put("UserName", list2.get(i).getUserName());
		    object.put("Content", list2.get(i).getContent());
		    object.put("Likes",list2.get(i).getLikes());
<<<<<<< HEAD
		    object.put("Privacy","private");
		   
=======
<<<<<<< HEAD
		    object.put("Privacy","private");
		   
=======
		    object.put("Privacy",list1.get(i).getPrivacy());
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
			array.add(object);
		
	}
		
		
    Vector<CustomTimelinePostEntity> list3=CustomTimelinePostEntity.checkaccess(uname);
		
	for(int i=0;i<list3.size();i++){
			
		    JSONObject object = new JSONObject();
		    object.put("UserName", list3.get(i).getUserName());
		    object.put("Content", list3.get(i).getContent());
		    object.put("Likes",list3.get(i).getLikes());
<<<<<<< HEAD
		    object.put("Privacy",list3.get(i).getPrivacy());
		    object.put("WhoCanSee",list3.get(i).getWhoCanSee());
=======
<<<<<<< HEAD
		    object.put("Privacy",list3.get(i).getPrivacy());
		    object.put("WhoCanSee",list3.get(i).getWhoCanSee());
=======
		    object.put("Privacy",list1.get(i).getPrivacy());
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
			array.add(object);
		
	}
		
		return array.toString();
				
		
	}
<<<<<<< HEAD
	/**
	 * 
	 * @param name : user name
	 * @param Content : content in any post
	 * @param pr : showing the privacy of post(public,custom)
	 * @return done or not 
	 * @throws ParseException
	 */
=======
	
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	@POST
	@Path("/sharePostService")
	public String sharePostService(@FormParam("name") String name,@FormParam("Cont") String Content,
			@FormParam("privacy") String pr) throws ParseException {
		
		JSONParser parser = new JSONParser();
		Object obj;
		obj = parser.parse(Content);
		JSONObject object = (JSONObject) obj;
		
		if((Content.toLowerCase()).contains("public"))
		{
			if((pr.toLowerCase()).contains("public"))
			{
				PublicSharedPostEntity p=new PublicSharedPostEntity(object.get("UserName").toString(),object.get("Content").toString()
					, pr,object.get("Likes").toString(),name);
				p.save();
<<<<<<< HEAD
				return "done";
=======
<<<<<<< HEAD
				return "done";
=======
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
			}
			else if((pr.toLowerCase()).contains("private"))
			{
				privateSharedPostEntity p=new privateSharedPostEntity(object.get("UserName").toString(),object.get("Content").toString()
					, pr,object.get("Likes").toString(),name);
				p.save();
<<<<<<< HEAD
				return "done";
=======
<<<<<<< HEAD
				return "done";
=======
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
			}
			else if((pr.toLowerCase()).contains("custom"))
			{
				String whoSee=(pr.toLowerCase()).replace("custom","");
				CustomSharedPostEntity p=new CustomSharedPostEntity(object.get("UserName").toString(),object.get("Content").toString()
						, pr,object.get("Likes").toString(),name,whoSee);
				JSONObject json = new JSONObject();
<<<<<<< HEAD
				return "done";
=======
<<<<<<< HEAD
				return "done";
=======
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
				
			}
		}
		else if((Content.toLowerCase()).contains("private"))
		{
<<<<<<< HEAD
			
=======
<<<<<<< HEAD
			
=======
			System.out.println("prsfjgoitdjhoibfoihbjfoijfgoijnfogijnoifgjnoij");
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
				 if((pr.toLowerCase()).contains("custom"))
					{
						String whoSee=(pr.toLowerCase()).replace("custom","");
						CustomOwnerSharedPostEntity p=new CustomOwnerSharedPostEntity(object.get("UserName").toString(),object.get("Content").toString()
								, pr,object.get("Likes").toString(),name,whoSee);
						JSONObject json = new JSONObject();
						p.save();
<<<<<<< HEAD
						return "done";
=======
<<<<<<< HEAD
						return "done";
=======
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
					}
				 else{
				PrivateOwnerSharedPostEntity p=new PrivateOwnerSharedPostEntity(object.get("UserName").toString(),object.get("Content").toString()
					, pr,object.get("Likes").toString(),name);
				System.out.println("pr");
				p.save();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
				return "done";
				 }
			
		}
		else if((Content.toLowerCase()).contains("custom"))
		{
			 if((pr.toLowerCase()).contains("custom"))
				{
				 
				    String c=(pr.toLowerCase()).replace("custom","");
				    String a=(c.toLowerCase()).replace("(","");
				    String[] s=a.split(",");
				    Set <String>g=new HashSet<String>();
				    for(String s1:s)
				    {
				    	g.add(s1);
				    }
				    c=object.get("WhoCanSee").toString();
				     a=(c.toLowerCase()).replace("(","");
				    s=a.split(",");
				    Set <String>d=new HashSet<String>();
				    for(String s1:s)
				    {
				    	d.add(s1);
				    }
				    
				    d.retainAll(g);
					String whoSee=d.toString();
					CustomOwnerSharedPostEntity p=new CustomOwnerSharedPostEntity(object.get("UserName").toString(),object.get("Content").toString()
							, pr,object.get("Likes").toString(),name,whoSee);
					JSONObject json = new JSONObject();
					p.save();
					return "done";
				}
			 else{
				 CustomOwnerSharedPostEntity p=new CustomOwnerSharedPostEntity(object.get("UserName").toString(),object.get("Content").toString()
				, pr,object.get("Likes").toString(),name,object.get("WhoCanSee").toString());
			
			p.save();
			return "done";
			 }
		}
<<<<<<< HEAD
=======
=======
				 }
			
		}
	/*	else if((Privacy.toLowerCase()).contains("custom"))
		{
			String whoSee=(Privacy.toLowerCase()).replace("custom","");
			PostPrivacy p=new CustomTimelinePost(name,Content,Feeling,"Custom",whoSee,owner,HashTag);
			JSONObject json = new JSONObject();
			if(PostBuilder.perparePost(p))
				json.put("Status", "OK");
			else
				json.put("Status", "Failed");
			return json.toJSONString();
		}*/
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
		return null;
		
	}

}
