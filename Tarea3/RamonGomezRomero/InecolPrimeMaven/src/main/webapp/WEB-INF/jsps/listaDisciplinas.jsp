<%-- 
    Document   : listaDisciplinas
    Created on : 28/02/2015, 12:07:18 AM
    Author     : Subli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INECOL PRIME</title>
    </head>
    <body>
       <h1>Disciplinas</h1>
        
       <div>
            <a href="agregarDisciplinaF">Agregar disciplina</a>
        </div>
       
        <p> </p>
         <p> </p>
          <p> </p>
       
        <div>
            <form action="buscarDisciplina">
                <input type='text' name='cadena'/>
                <input type='submit' name='filtrar' value='Buscar:'/>
            </form>
        </div>
        
       <p> </p>
        <c:forEach items="${disciplinas}" var = "dis">
        <li>${dis.nombre}</li>
        </c:forEach>
    </body>
</html>
