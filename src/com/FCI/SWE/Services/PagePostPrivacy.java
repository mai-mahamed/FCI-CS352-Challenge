package com.FCI.SWE.Services;

public abstract class PagePostPrivacy {



	private String UserName;
	private String Content;
	private String Privacy;
	private int Likes;
	private String PageName;
	private int Seen;




	public int getSeen() {
		return Seen;
	}





	public void setSeen(int seen) {
		Seen = seen;
	}





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




<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
/**
 * @param userName : user name
 * @param content : content of any post
 * @param privacy : showing the privacy of post(custom)
 * @param pageName : page name
 */
<<<<<<< HEAD
=======
=======

>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	public PagePostPrivacy(String userName, String content,
			String privacy, String pageName) {
		
		UserName = userName;
		Content = content;
		Privacy = privacy;
		Likes=0;
		this.PageName=pageName;
		Seen=0;
		
	}



	public String getPageName() {
		return PageName;
	}





	public void setPageName(String pageName) {
		PageName = pageName;
	}





<<<<<<< HEAD
	public abstract boolean save(); // abstract function
=======
<<<<<<< HEAD
	public abstract boolean save(); // abstract function
=======
	public abstract boolean save();
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
	
	

}
