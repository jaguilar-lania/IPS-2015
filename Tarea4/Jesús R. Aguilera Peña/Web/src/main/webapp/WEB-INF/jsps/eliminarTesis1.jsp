<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Tesis</title>
    </head>
    <body>
        <h2>Eliminar Tesis</h2>
        <sf:form action="eliminarTesis" method="POST" commandName="tesis">
            <table>
                <tr>
                    <td>IdTesis:</td>
                    <td><sf:input path="idtesis" type="text"/></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Eliminar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
