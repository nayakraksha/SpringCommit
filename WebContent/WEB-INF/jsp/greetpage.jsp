<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/menu.jsp"></jsp:include>
<h2>login</h2>
${msg} <%= request.getParameter("name") %>
</body>
</html>                                                                                 