<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tesis</title>
    </head>
    <body>
        <h2>Lista de Tesis</h2>
        <div>
            <a href="agregarTesisF">Agregar</a>
        </div>
        <div class="filtro">
            <form action="buscarTesis" method>
            <input type='text' name='cadena'/>
            <input type='submit' name='filtrar' value='Filtrar:'>
            </form>
        </div>
        <ol>
            
            <c:forEach items="${tesis}" var="tes">
                <li>${tes.titulo} ${tes.disciplina}</li>
                <a href="editarTesis?id=${tes.idtesis}">Editar </a>
                <a href="eliminarTesis?id=${tes.idtesis}">Eliminar </a>
            </c:forEach>
        </ol>
    </body>
</html>








