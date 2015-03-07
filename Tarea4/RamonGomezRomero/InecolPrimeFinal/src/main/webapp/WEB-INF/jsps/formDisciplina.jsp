<%-- 
    Document   : formDisciplina
    Created on : 7/03/2015, 01:02:26 AM
    Author     : Subli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INECOL PRIME</title>
    </head>
    <body>
        <h2>Disciplinas</h2>
        <sf:form action="agregarDisciplina" method="POST" commandName="disciplina">
            <div id="errores">
            <sf:errors path="nombre"/>
            </div>
            <table>
                <tr>
                    <td>A continuación</td>
                    <td>ingrese el nombre de la disciplina </td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Nombre:</td>
                    <td><sf:textarea path="nombre" rows="2"/></td>
                    <sf:hidden path="iddisciplina"/>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Agregar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
