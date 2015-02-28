<%-- 
    Document   : decorator
    Created on : 23/02/2015, 12:05:36 AM
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BibliotecaVirtual \ <sitemesh:write property='title'/></title>
        <link rel="stylesheet" type="text/css" media="all" href="<c:url value='/css/styles.css'/>" /> 
         
        <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        
    </head>
    <body>
        <div id="encabezado"  >
	</div>
	<div id="cuerpo">
		<div id='cssmenu'> 
		  <ul >
                      <li  ><a href='#' >Inicio</a></li>
			<li ><a href='tesis'  >Tesis</a></li>
			<li ><a href='disciplina'  >Disciplina</a></li>
		  </ul>
		</div>
		<div id="datos">
                    <sitemesh:write property='body'/>
                </div>
        </div>
                     

        
    </body>
</html>
