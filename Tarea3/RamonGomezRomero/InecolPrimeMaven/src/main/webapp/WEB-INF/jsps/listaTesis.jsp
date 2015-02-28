<%-- 
    Document   : listaTesis
    Created on : 28/02/2015, 02:44:48 AM
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
       <h1>Tesis</h1>
        
       <div>
            <a href="agregarTesisF">Agregar Nueva Tesis</a>
        </div>
       
        <p> </p>
         <p> </p>
          <p> </p>
       
        <div>
            <form action="buscarTesis">
                <input type='text' name='cadena'/>
                <input type='submit' name='filtrar' value='Buscar:'/>
            </form>
        </div>
        
       <p> </p>
        <c:forEach items="${tesis}" var = "tes">
        <li>${tes.nombre}</li>
        </c:forEach>
    </body>
</html>
