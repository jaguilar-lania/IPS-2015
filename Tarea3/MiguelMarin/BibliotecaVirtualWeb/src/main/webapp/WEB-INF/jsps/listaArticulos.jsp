<%-- 
    Document   : listaArticulos
    Created on : 21/02/2015, 11:18:52 AM
    Author     : miguel
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Articulos</title>
    </head>
    <body>
        <h1>Lista de Articulos</h1>
        <div>
            <form action="/buscarArticulos">
            Filtrar: <input type="text" name="cadena"/>
            <input type="button" name="filtrar" value="Filtrar:" >
            </form>
        </div>
        <ol>
            <c:forEach items="${articulos}" var="art">
                <li>
                    ${art.nombre}<a href="editarArticulo?id=${art.idArticulo}">Editar</a>
                </li>
            </c:forEach>
        </ol>
    </body>
</html>
