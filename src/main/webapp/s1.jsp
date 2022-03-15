<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title
</head>
<body>
<%//response.sendRedirect("s2.jsp") ;%>
<%//getServletContext().getRequestDispatcher("/s2.jsp").forward(request, response); %>
<jsp:forward page="/s2.jsp"/>
</body>
</html>