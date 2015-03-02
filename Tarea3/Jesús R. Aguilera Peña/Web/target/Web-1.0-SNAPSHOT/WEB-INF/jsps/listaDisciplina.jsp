<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplina</title>
    </head>
    <body>
        <h2>Lista de Disciplinas</h2>
        <div>
            <a href="agregarDisciplina">Agregar</a>
        </div>
        <div class="filtro">
            <form action="buscarDisciplina" method>
            <input type='text' name='cadena'/>
            <input type='submit' name='filtrar' value='Filtrar:'>
            </form>
        </div>
        <ol>
            
            <c:forEach items="${disciplina}" var="tes">
                <li>${tes.disciplina}</li>
                <a href="editarDisciplinaF?iddisciplina=${tes.iddisciplina}">Editar </a>
                <a href="eliminarDisciplina?iddisciplina=${tes.iddisciplina}">Eliminar </a>
            </c:forEach>
        </ol>
    </body>
</html>








