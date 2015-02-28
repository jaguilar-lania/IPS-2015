<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Disciplina</title>
    </head>
    <body>
        <h2>Nueva Disciplina</h2>
        <sf:form action="agregarDisciplina" method="POST" commandName="disciplina">
            <table>
                <tr>
                    <td>Disciplina:</td>
                    <td><sf:input path="disciplina" type="text"/></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Agregar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
