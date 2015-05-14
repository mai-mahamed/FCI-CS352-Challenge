package com.FCI.SWE.Services;

public abstract class PostPrivacy {

	public String getHashtags() {
		return Hashtags;
	}





	public void setHashtags(String hashtags) {
		Hashtags = hashtags;
	}





	private String UserName;
	private String Content;
	private String Feeling;
	private String Privacy;
	private String Owner;
	private int Likes;
	private String Hashtags;
	



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





	public String getFeeling() {
		return Feeling;
	}





	public void setFeeling(String feeling) {
		Feeling = feeling;
	}





	public String getPrivacy() {
		return Privacy;
	}





	public void setPrivacy(String privacy) {
		Privacy = privacy;
	}





	public String getOwner() {
		return Owner;
	}





	public void setOwner(String owner) {
		Owner = owner;
	}





	public int getLikes() {
		return Likes;
	}





	public void setLikes(int likes) {
		Likes = likes;
	}




<<<<<<< HEAD
/**
 *@param content : content in any post
 * @param feeling : feeling in any post
 * @param privacy : showing the privacy of post(public,custom)
 * @param owner : owner of time line
 * @param userName : user name
 * @param owner : timeline owner 
 * @param hashTag : hashtag of the post 
 */
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	public PostPrivacy(String userName, String content, String feeling,
			String privacy, String owner, String hashTag) {
		super();
		UserName = userName;
		Content = content;
		Feeling = feeling;
		Privacy = privacy;
		Owner = owner;
		Likes=0;
		Hashtags=hashTag;
	}





<<<<<<< HEAD
	public abstract boolean save(); // abstract function
=======
	public abstract boolean save();
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
	
	

}
