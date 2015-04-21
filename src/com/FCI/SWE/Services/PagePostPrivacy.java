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





	public abstract boolean save();
	
	

}
