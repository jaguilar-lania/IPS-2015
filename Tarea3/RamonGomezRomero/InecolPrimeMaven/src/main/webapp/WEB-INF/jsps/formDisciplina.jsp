<%-- 
    Document   : formDisciplina
    Created on : 28/02/2015, 12:58:49 AM
    Author     : Subli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INECOL PRIME</title>
    </head>
    <body>
        <h2>Nueva Disciplina</h2>
        <sf:form action="agregarDisciplina" method="POST" commandName="disciplina">
            <table>
                <tr>
                    <td>Identificador:</td>
                    <td><sf:input path="iddisciplina" type="text"/></td>
                </tr>
                <tr>
                    <td>Nombre:</td>
                    <td><sf:textarea path="nombre" rows="2"/></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Agregar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
