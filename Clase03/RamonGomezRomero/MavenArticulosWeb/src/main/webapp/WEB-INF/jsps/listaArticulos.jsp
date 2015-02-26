<%-- 
    Document   : listaArticulos
    Created on : 21/02/2015, 11:19:23 AM
    Author     : Subli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Articulos</title>
    </head>
    <body>
        <h1>Lista de Articulos disponibles</h1>
        
        <div>
            <form action="buscarArticulos">
                <input type='text' name='cadena'/>
                <input type='submit' name='filtrar' value='Filtrar:'/>
            </form>
        </div>
        
        <c:forEach items="${articulos}" var = "art">
        <li>${art.nombre}</li>
        </c:forEach>
    </body>
</html>
