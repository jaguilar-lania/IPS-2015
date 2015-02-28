<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Artículo</title>
    </head>
    <body>
        <h2>Nuevo Artículo</h2>
        <sf:form action="agregarArticulo" method="POST" commandName="articulo">
            <table>
                <tr>
                    <td>Nombre:</td>
                    <td><sf:input path="nombre" type="text"/></td>
                </tr>
                <tr>
                    <td>Descripción:</td>
                    <td><sf:textarea path="descripcion" rows="2"/></td>
                </tr>
                <tr>
                    <td>Precio:</td>
                    <td><sf:input path="precio" type="text"/></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Agregar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
