<%@page import="p1.Addpojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int a =0;
int b=0;
int c =0;
String name = null;

if(request.getAttribute("d1") != null){
	name = (String)request.getAttribute("d1");
}

%>

<center>
<div>
<form action="AddController" method = "get">
<br>Enter Studen ID: <input type="text" name = "s_id" value="1"/>
<br> <input type="submit" value = "Student_Detail"/>
<pre>Detials: <%=name %></pre>
</form>
</div>
</center>

</body>
</html>