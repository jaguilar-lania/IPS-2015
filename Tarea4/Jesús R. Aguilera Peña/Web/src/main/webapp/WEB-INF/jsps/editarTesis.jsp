<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Tesis</title>
    </head>
    <body>
        <h2>Editar Tesis</h2>
        <sf:form action="agregarTesis" method="POST" commandName="tesis">
            <table>
                <tr>
                    <td>IdTesis:</td>
                    <td><sf:input path="idtesis" type="text"/></td>
                </tr>
                <tr>
                    <td>Autor:</td>
                    <td><sf:input path="autor" type="text"/></td>
                </tr>
                <tr>
                    <td>Titulo:</td>
                    <td><sf:textarea path="titulo" rows="2"/></td>
                </tr>
                <tr>
                <tr>
                    <td>Disciplina:</td>
                    <td><sf:textarea path="disciplina" rows="2"/></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Guardar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
