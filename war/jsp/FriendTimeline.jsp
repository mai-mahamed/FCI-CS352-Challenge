<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<form action="/social/CreateFriendTimelinePost" method="post">
  Content : <input type="text" name="Content" /> <br>
  Privacy : <input type="text" name="Privacy" /><p>Public , Private or Custom(Name1,Name2,...)</p> <br>
  Feeling : <input type="text" name="Feeling" /> <br>
  Timleline owner : <input type="text" name="owner" /> <br>
  <input type="submit" value="Post">
  
  </form>
</body>
</html>