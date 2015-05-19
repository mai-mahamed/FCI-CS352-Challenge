package com.FCI.SWE.ServicesModels;

import java.util.List;
import java.util.Vector;

import com.FCI.SWE.Services.PrivatePagePost;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PrivatePagePostEntity {

	private String UserName;
	private String Content;
	private String Privacy;
	private int Likes;
	private String PageName;
	private int Seen;



	
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getPrivacy() {
		return Privacy;
	}

	public void setPrivacy(String privacy) {
		Privacy = privacy;
	}

	public int getLikes() {
		return Likes;
	}

	public void setLikes(int likes) {
		Likes = likes;
	}

	public String getPageName() {
		return PageName;
	}

	public void setPageName(String pageName) {
		PageName = pageName;
	}

	public int getSeen() {
		return Seen;
	}

	public void setSeen(int seen) {
		Seen = seen;
	}

	public PrivatePagePostEntity(String userName, String content,
			String privacy, int likes, String pageName, int seen) {
		super();
		UserName = userName;
		Content = content;
		Privacy = privacy;
		Likes = likes;
		PageName = pageName;
		Seen = seen;
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @param privatePagePost : posts in page with private privacy
	 * @return Saving PrivatePagePost in data store
	 */
=======
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	public static boolean save(PrivatePagePost privatePagePost) {
		// TODO Auto-generated method stub
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("PrivatePagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity group = new Entity("PrivatePagePostEntity", list.size() + 1);

		group.setProperty("UserName", privatePagePost.getUserName());
		group.setProperty("Content", privatePagePost.getContent());
		group.setProperty("Likes",privatePagePost.getLikes());
		group.setProperty("Privacy", privatePagePost.getPrivacy());
		group.setProperty("PageName", privatePagePost.getPageName());
		group.setProperty("PostSeen", privatePagePost.getSeen());
		
		if(datastore.put(group).isComplete())
			return true;
		else return false;

	}

<<<<<<< HEAD
	/**
	 * 
	 * @param pname : page name
	 * @param name : owner name of this page
	 * @return checking page name & user name
	 */
	public static Vector<PrivatePagePostEntity> check(String pname,String name) {
=======
<<<<<<< HEAD
	public static Vector<PrivatePagePostEntity> check(String pname,String name) {
=======
<<<<<<< HEAD
	public static Vector<PrivatePagePostEntity> check(String pname,String name) {
=======
<<<<<<< HEAD
	public static Vector<PrivatePagePostEntity> check(String pname,String name) {
=======
	public static Vector<PrivatePagePostEntity> check(String pname) {
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		// TODO Auto-generated method stub
		
			Vector<PrivatePagePostEntity> list = new Vector<PrivatePagePostEntity>();
			DatastoreService datastore = DatastoreServiceFactory
					.getDatastoreService();
			
			Query gaeQuery = new Query("PrivatePagePostEntity");
			PreparedQuery pq = datastore.prepare(gaeQuery);
			for (Entity entity : pq.asIterable()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
				String a=PageEntity.get(pname);
				if(entity.getProperty("PageName").toString().equals(pname))
				{
					if(a.equals(name))
					{long key=entity.getKey().getId();		
					PrivatePagePostEntity p=new PrivatePagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
							,entity.getProperty("Privacy").toString()
							,Integer.parseInt(entity.getProperty("Likes").toString())
							,entity.getProperty("PageName").toString(),Integer.parseInt(entity.getProperty("PostSeen").toString()));	
					increaseSeen(key);
					list.add(p);
					}
						
					else{
						long key=entity.getKey().getId();		
						PrivatePagePostEntity p=new PrivatePagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
								,entity.getProperty("Privacy").toString()
								,Integer.parseInt(entity.getProperty("Likes").toString())
								,entity.getProperty("PageName").toString(),1);	
						increaseSeen(key);
						list.add(p);
					}
					
				}
					
				   
			}
<<<<<<< HEAD
		
		return list;
	}
	
	/**
	 * 
	 * @param ID : user ID
	 * @return increasing seen of posts
	 */
	public static boolean increaseSeen(long ID){
=======
<<<<<<< HEAD
		
		return list;
	}
	public static boolean increaseSeen(long ID){
=======
<<<<<<< HEAD
=======
=======
				
				if(entity.getProperty("PageName").toString().equals(pname))
				{
				
					long key=entity.getKey().getId();		
					PrivatePagePostEntity p=new PrivatePagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
							,entity.getProperty("Privacy").toString()
							,Integer.parseInt(entity.getProperty("Likes").toString())
							,entity.getProperty("PageName").toString(),1);	
					increaseSeen(key);
					list.add(p);
					
					
				   }
				}
>>>>>>> 03152846dbbe0d049207fe46386a2f5da3dd7061
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
		
		return list;
	}
	public static void increaseSeen(long ID){
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		Query gaeQuery = new Query("PrivatePagePostEntity");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());
		for (Entity entity : pq.asIterable()) {
			long key=entity.getKey().getId();
			if (key==ID) {
				
				Entity group = new Entity("PrivatePagePostEntity", key);
				PrivatePagePostEntity p=new PrivatePagePostEntity(entity.getProperty("UserName").toString(),entity.getProperty("Content").toString()
						,entity.getProperty("Privacy").toString()
						,Integer.parseInt(entity.getProperty("Likes").toString())
						,entity.getProperty("PageName").toString(),Integer.parseInt(entity.getProperty("PostSeen").toString()));
				
				group.setProperty("UserName", p.getUserName());
				group.setProperty("Content", p.getContent());
				group.setProperty("Likes",p.getLikes());
				group.setProperty("Privacy", p.getPrivacy());
				group.setProperty("PageName", p.getPageName());
				group.setProperty("PostSeen", (p.getSeen()+1));
				
				datastore.put(group);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
				return true;
			}
	
		}
		return false ;
<<<<<<< HEAD
=======
=======
				
			}
	
		}
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805


	}
}
