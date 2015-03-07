
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INECOL PRIME</title>
    </head>
    <body>
        <h2>Nueva Tesis</h2>
        <sf:form action="agregarTesis" method="POST" commandName="tesis">
            <table>
                <tr>
                    <td>Titulo:</td>
                    <td><sf:textarea path="titulo"/></td>
                </tr>
                
                <tr>
                    <td>Año:</td>
                    <td><sf:input path="anio" type="text"/></td>
                </tr>
                
                <tr>
                    <td>Condiciones:</td>
                    <td><sf:input path="condiciones" type="text"/></td>
                </tr>
                
                <tr>
                    <td>Pais:</td>
                    <td><sf:input path="idpais" type="text"/></td>
                </tr>
                <tr>
                    <td>Institucion:</td>
                    <td><sf:textarea path="idinstitucion"/></td>
                </tr>
                
                <tr>
                    <td>Grado academico:</td>
                    <td><sf:input path="idgradoacademico" type="text"/></td>
                </tr>
                <tr>
                    <td>Especie:</td>
                    <td><sf:textarea path="idespecie"/></td>
                </tr>
                
                <tr>
                    <td>Disciplina:</td>
                    <td><sf:textarea path="iddisciplina"/></td>
                </tr>
                
                <tr>
                    <td>Director:</td>
                    <td><sf:textarea path="iddirector"/></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Agregar"/></td>
                </tr>
            </table>
        </sf:form>
    </body>
</html>