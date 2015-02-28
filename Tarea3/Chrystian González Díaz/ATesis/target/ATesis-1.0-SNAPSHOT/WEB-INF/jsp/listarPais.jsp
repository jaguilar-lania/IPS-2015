<%-- 
    Document   : listarPais
    Created on : 27/02/2015, 02:08:36 PM
    Author     : Chrys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paises</title>
    </head>
    <body>
        <h2>Lista de Paises</h2>

        <div>
            <form action="buscarArticulos" method>
            <input type='text' name='cadena'/>
            <input type='submit' name='filtrar' value='Filtrar:'>
            </form>
                   
        </div>
        <ol>
            
            <c:forEach items="${pais}" var="pa">
                <li>${pa.nombre}</li> <a href="editarArticulo?id=${pa.idPais}">Editar </a>
            </c:forEach>
                
        </ol>
    </body>
</html>