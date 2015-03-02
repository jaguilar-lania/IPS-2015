<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Disciplina</title>
    </head>
    <body>
        <h2>Editar Disciplina</h2>
        <sf:form action="agregarDisciplinaF" method="POST" commandName="disciplina">
            <table>
                <tr>
                    <td>IdDisciplina:</td>
                    <td><sf:input path="iddisciplina" type="text"/></td>
                </tr>
                <tr>
                    <td>Disciplina:</td>
                    <td><sf:input path="disciplina" type="text"/></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Guardar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
