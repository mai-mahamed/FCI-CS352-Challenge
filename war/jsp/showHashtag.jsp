<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@
   taglib prefix="c"
   uri="http://java.sun.com/jsp/jstl/core"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${it.HashList}" var="requests">

<p> Hashtags <c:out value="${requests}"></c:out></p>
<br></br>
</c:forEach>
<c:forEach items="${it.HashListCounter}" var="size">

<p> Hashtags counter <c:out value="${size}"></c:out></p>
<br></br>
</c:forEach>
</body>

</html>