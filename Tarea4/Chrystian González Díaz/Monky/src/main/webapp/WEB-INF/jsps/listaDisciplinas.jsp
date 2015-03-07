<%-- 
    Document   : listaDisciplinas
    Created on : 2/03/2015, 03:20:47 PM
    Author     : Chrys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplinas</title>
    </head>
    <body>
        <h2>Lista de Disciplinas</h2>
        <div>
            <a href="agregarDisciplinaF">Agregar</a>
        </div>
        <div class="filtro">
            <form action="buscrDisciplinas" method>
            <input type='text' name='cadena'/>
            <input type='submit' name='filtrar' value='Filtrar:'>
            </form>
        </div>
        <ol>
            
            <c:forEach items="${disciplinas}" var="dis">
                <li>${dis.descripcion}</li> <a href="editarDisciplinaF?id=${dis.idDisciplina}">Editar </a>
            </c:forEach>
        </ol>
    </body>
</html>








