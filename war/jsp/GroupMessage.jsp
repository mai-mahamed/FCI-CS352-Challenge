<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<form action="/social/CreateGroupChat" method="post">
  Name1 : <input type="text" name="Name1" /> <br>
  Name2 : <input type="text" name="Name2" /> <br>
  Name3 : <input type="text" name="Name3" /> <br>
  Name4 : <input type="text" name="Name4" /> <br>
  Conversation : <input type="text" name="Conversation" /> <br>
  
  <input type="submit" value="SendGroupMessage">
   
  </form>
</body>
</html>