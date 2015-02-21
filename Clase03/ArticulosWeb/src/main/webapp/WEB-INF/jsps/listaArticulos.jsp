<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Articulos</title>
    </head>
    <body>
        <h1>Lista de Artículos</h1>

        <ol>
            <c:forEach items="${articulos}" var="art">
                <li>${art.nombre}</li>
            </c:forEach>
        </ol>
    </body>
</html>








