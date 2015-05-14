package com.FCI.SWE.Services;

import java.util.Vector;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.FCI.SWE.ServicesModels.CustomPagePostEntity;
import com.FCI.SWE.ServicesModels.LikesEntity;
import com.FCI.SWE.ServicesModels.MessageEntity;
import com.FCI.SWE.ServicesModels.PageEntity;
import com.FCI.SWE.ServicesModels.PrivatePagePostEntity;
import com.FCI.SWE.ServicesModels.PublicPagePostEntity;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class PageServices {
	/**
	 *  @param pname : page name
	 * @param type : type of page
	 * @param category : category of page like (Education,Science,...etc)
	 * @param uname : user name
	 * @return send to user creating page was successfully
	 */
	@POST
	@Path("/CreatePageService")
	public String CreateFriendTimelinePostService(@FormParam("pname") String pname,
			@FormParam("type") String type, @FormParam("category") String category,@FormParam("uname") String uname) {
		JSONObject object2 = new JSONObject();
		if(pname.equals(null)||type.equals(null)|| category.equals(null)||uname.equals(null))
		{
			object2.put("Status","Failed");
		}
		else{
		PageEntity fuser=new PageEntity(pname,type,category,uname);
		fuser.savePage();
		    object2.put("Status","OK");
		}
		return object2.toString();
				
		
	}
	
	/**
	 *
	 * function create page post and check the privacy
	 * @param Content : content of the post in page
	 * @param Privacy : showing the privacy of post(public,custom)
	 * @param PageName : name of page
	 * @return send to user posting in page was successfully
	 */
	@POST
	@Path("/CreatePagePostService")
	public String CreatePagePostService(@FormParam("name") String name,@FormParam("Content") String Content,
			@FormParam("Privacy") String Privacy,
			@FormParam("PageName") String PageName) {
		System.out.println("inside service");
		if((Privacy.toLowerCase()).contains("public"))
		{
			PagePostPrivacy p=new PublicPagePost(name,Content,"Public",PageName);
			JSONObject json = new JSONObject();
			PagePost post =new PagePost(p);
			boolean found=PagePost.add();
			json.put("Status", "OK");
			return json.toJSONString();
		}
		else if((Privacy.toLowerCase()).contains("private"))
		{
			PagePostPrivacy p=new PrivatePagePost(name,Content,"private",PageName);
			JSONObject json = new JSONObject();
			PagePost post =new PagePost(p);
			boolean found=PagePost.add();
			json.put("Status", "OK");
			return json.toJSONString();
		}
		else if((Privacy.toLowerCase()).contains("custom"))
		{
			String whoSee=(Privacy.toLowerCase()).replace("custom","");
			System.out.println(whoSee);
			PagePostPrivacy p=new CustomPagePost(name,Content,"custom",whoSee,PageName);
			JSONObject json = new JSONObject();
			PagePost post =new PagePost(p);
			boolean found=PagePost.add();
			json.put("Status", "OK");
			return json.toJSONString();
		}
		return null;
		
	}
	/**
	 * 
	 * @param pname : page name
	 * @param uname : user name
	 * @return show all post in page  that user can see 
	 **/
	@POST
	@Path("/ShowPageTimeService")
	public String ShowPageTimeService(@FormParam("PageName") String pname,@FormParam("name") String uname) {
		
	// get public posts
		Vector<PublicPagePostEntity> list1=PublicPagePostEntity.check(pname,uname);
		
		JSONArray array=new JSONArray();
		for(int i=0;i<list1.size();i++){
			
		    JSONObject object = new JSONObject();
		    object.put("UserName", list1.get(i).getUserName());
		    object.put("Content", list1.get(i).getContent());
		    object.put("Likes",list1.get(i).getLikes());
		    object.put("PostSeen",list1.get(i).getSeen());
			array.add(object);
		
	}
		// check if user had made like for this page
		if(LikesEntity.checkaccess(pname,uname)){ 
			// get private posts
			Vector<PrivatePagePostEntity> list2=PrivatePagePostEntity.check(pname,uname);
		
	for(int i=0;i<list2.size();i++){
			
		    JSONObject object = new JSONObject();
		    object.put("UserName", list2.get(i).getUserName());
		    object.put("Content", list2.get(i).getContent());
		    object.put("Likes",list2.get(i).getLikes());
		    object.put("PostSeen",list2.get(i).getSeen());
			array.add(object);
		
	}
		}
		// get custom posts
			Vector<CustomPagePostEntity> list3=CustomPagePostEntity.checkaccess(pname,uname);
		
	for(int i=0;i<list3.size();i++){
			
		    JSONObject object = new JSONObject();
		    object.put("UserName", list3.get(i).getUserName());
		    object.put("Content", list3.get(i).getContent());
		    object.put("Likes",list3.get(i).getLikes());
		    object.put("PostSeen",list3.get(i).getSeen());
			array.add(object);
		
	}
		
		return array.toString();
				
		
	}
	
	/**
	 * function increase number of page likes and save who make like
	 * @param pname : page name
	 * @param uname : user name
	 * @return done or not
	 */
	@POST
	@Path("/LikePageService")
	public String LikePageService(@FormParam("pname") String pname,@FormParam("uname") String uname) {
		
		JSONObject object2 = new JSONObject();
		
		PageEntity.increaseLikes(pname);
		LikesEntity r=new LikesEntity(uname,pname);
		boolean found=r.save();
		    object2.put("Status","OK");

		return object2.toString();
				
		
	}

}
