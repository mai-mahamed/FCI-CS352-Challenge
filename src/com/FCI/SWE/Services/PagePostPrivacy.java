package com.FCI.SWE.Services;

<<<<<<< HEAD
public abstract class PagePostPrivacy
{



	private String UserName ;
	private String Content ;
	private String Privacy ;
	private int Likes ;
	private String PageName ;
	private int Seen ;
=======
public abstract class PagePostPrivacy {



	private String UserName;
	private String Content;
	private String Privacy;
	private int Likes;
	private String PageName;
	private int Seen;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805




<<<<<<< HEAD
	public int getSeen()
	{
 		return Seen ;
=======
	public int getSeen() {
		return Seen;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public void setSeen(int seen) 
	{
		Seen = seen ;
=======
	public void setSeen(int seen) {
		Seen = seen;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public String getUserName()
	{
		return UserName ;
=======
	public String getUserName() {
		return UserName;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public void setUserName(String userName) 
	{
		UserName = userName ;
=======
	public void setUserName(String userName) {
		UserName = userName;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public String getContent()
	{
		return Content ;
=======
	public String getContent() {
		return Content;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public void setContent(String content) 
	{
		Content = content ;
=======
	public void setContent(String content) {
		Content = content;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}



<<<<<<< HEAD
	public String getPrivacy()
	{
		return Privacy ;
=======
	public String getPrivacy() {
		return Privacy;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public void setPrivacy(String privacy) 
	{
		Privacy = privacy ;
=======
	public void setPrivacy(String privacy) {
		Privacy = privacy;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}




<<<<<<< HEAD
	public int getLikes()
	{
		return Likes ;
=======
	public int getLikes() {
		return Likes;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public void setLikes(int likes) 
	{
		Likes = likes ;
=======
	public void setLikes(int likes) {
		Likes = likes;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}




<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
/**
 * @param userName : user name
 * @param content : content of any post
 * @param privacy : showing the privacy of post(custom)
 * @param pageName : page name
 */
<<<<<<< HEAD
	public PagePostPrivacy(String userName , String content ,
			String privacy, String pageName) 
	{
		
		UserName = userName ;
		Content = content ;
		Privacy = privacy ;
		Likes=0 ;
		this.PageName = pageName ;
		Seen=0 ;
=======
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
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
		
	}



<<<<<<< HEAD
	public String getPageName()
	{
		return PageName ;
=======
	public String getPageName() {
		return PageName;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public void setPageName(String pageName) 
	{
		PageName = pageName ;
=======
	public void setPageName(String pageName) {
		PageName = pageName;
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	}





<<<<<<< HEAD
	public abstract boolean save() ; // abstract function
=======
<<<<<<< HEAD
	public abstract boolean save(); // abstract function
=======
<<<<<<< HEAD
	public abstract boolean save(); // abstract function
=======
	public abstract boolean save();
>>>>>>> d293d0515af81388349236d24a3aec7554c709a2
>>>>>>> b4bce9d46968d253f312331916dbea989824bfcd
>>>>>>> ed6cdda22f362a9816aed254c00b74fc2be43805
	
	

}
