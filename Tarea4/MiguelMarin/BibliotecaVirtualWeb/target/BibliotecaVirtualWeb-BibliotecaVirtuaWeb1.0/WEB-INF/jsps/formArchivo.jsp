<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subir Archivo</title>
    </head>
    <body>
        <h2>Subir Archivo</h2>
        <form method="post" action="subir" enctype="multipart/form-data">
            <input type="file" name="archivo"/>
            <input type="submit" value="subir"/>
        </form>
    </body>
</html>
