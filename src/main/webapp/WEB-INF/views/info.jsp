<%--
  Created by IntelliJ IDEA.
  User: 1034511
  Date: 04-10-2022
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>
    Welcome Back!! ${jspPlayerName}
</h1>

<h1> Player Info </h1>
<p>
        Name : ${name} <br>
        Age : ${age} <br>
        Nationality : ${nationality} <br>
        Id : ${id} <br>

</p>

<%
    System.out.println(request.getAttribute("name"));
%>
</body>
</html>