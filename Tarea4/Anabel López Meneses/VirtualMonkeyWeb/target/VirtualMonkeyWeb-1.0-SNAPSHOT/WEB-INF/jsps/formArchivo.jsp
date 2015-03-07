<%-- 
    Document   : formArchivo
    Created on : 6/03/2015, 02:36:12 PM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subir Archivo</title>
    </head>
    <body>
        <h2>Subir Archivo</h2>
        <form method="post" action="subir" enctype="multipart/form-data">
            <input type="file" name="archivo" accept=".pdf" />
            <input type="submit" value="subir"/>
        </form>
        <form:form action="guardarTesis" method="POST" commandName="tesis" >
            <input type="submit" value="Guardar Archivo"/>
            <form:hidden path="id"/>
        </form:form>
    
    </body>
</html>
