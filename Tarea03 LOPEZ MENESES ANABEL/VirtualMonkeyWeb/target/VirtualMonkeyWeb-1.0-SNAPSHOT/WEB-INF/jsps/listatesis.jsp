<%-- 
    Document   : listatesis
    Created on : 25/02/2015, 12:00:33 PM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lista tesis</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <ol>
            <c:forEach items="${tesis}" var="tesis1">
                <li>${tesis1.titulo}</li> 
            </c:forEach>

        </ol>
    </body>
</html>
