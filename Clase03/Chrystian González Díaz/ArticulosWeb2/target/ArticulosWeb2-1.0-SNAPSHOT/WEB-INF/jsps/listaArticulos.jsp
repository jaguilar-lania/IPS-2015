<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Articulos</title>
    </head>
    <body>
        <h2>Lista de Artículos</h2>

        <div>
            <form action="buscarArticulos" method>
            <input type='text' name='cadena'/>
            <input type='submit' name='filtrar' value='Filtrar:'>
            </form>
                   
        </div>
        <ol>
            
            <c:forEach items="${articulos}" var="art">
                <li>${art.nombre}</li> <a href="editarArticulo?id=${art.idArticulo}">Editar </a>
            </c:forEach>
        </ol>
    </body>
</html>








