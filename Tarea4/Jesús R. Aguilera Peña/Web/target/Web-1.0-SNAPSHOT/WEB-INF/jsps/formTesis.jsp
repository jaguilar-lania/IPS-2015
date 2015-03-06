<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Tesis</title>
    </head>
    <body>
        <h2>Nueva Tesis</h2>
        <sf:form action="agregarTesis" method="POST" commandName="tesis">
            <div id="errores">
                <sf:errors path="autor"/>
            </div>
            <div id="errores">
                <sf:errors path="titulo"/>                                
            </div>
            <div id="errores">
                <sf:errors path="disciplina"/>                                
            </div>
            <table>
                <tr>
                    <td>Autor:</td>
                    <td><sf:input path="autor" type="text"/></td>
                    <sf:hidden path="idtesis"/>
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
                    <td></td><td><input type="submit" value="Agregar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>
