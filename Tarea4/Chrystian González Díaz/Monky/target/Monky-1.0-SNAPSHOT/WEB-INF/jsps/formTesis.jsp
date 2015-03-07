<%-- 
    Document   : formTesis
    Created on : 4/03/2015, 11:49:24 PM
    Author     : Chrys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Tesis</title>
    </head>
    <body>
        <h2>Nueva Tesis</h2>
        <sf:form action="agregarTesis" method="POST" commandName="tesis">
        <div id="errores">
            <sf:errors path="titulo"/>
        </div>
            <table>
                <tr>
                    <td>Usuario:</td>
                    <td><sf:input path="idUsuario" type="text"/></td>
                    <sf:hidden path="idTesis"/>
                </tr>
                <tr>
                    <td>Titulo:</td>
                    <td><sf:textarea path="titulo" rows="1"/></td>
                </tr>
                <tr>
                    <td>Disciplina:</td>
                    <td><sf:input path="idDisciplina" type="text"/></td>
                </tr>
                <tr>
                    <td>Archivo:</td>
                    <td><form method="post" action="subir" enctype="multipart/form-data">
                        <input type="file" name="archivo"/>
                    </form></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Agregar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
