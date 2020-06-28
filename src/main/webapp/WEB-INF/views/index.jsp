<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
	<c:forEach var="list" items="${userlist}">
	<h5>${list.id}  ,  ${list.password} , ${list.name}</h5>
	</c:forEach>
	
	
	
</h1>

<P>  영진제작 </P>
</body>
</html>
  