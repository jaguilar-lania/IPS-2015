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
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script type="javascript" >
            $(window).load(function(){
            var url = document.location.href;  // Getting the url
            var str = url.substr(0, url.lastIndexOf('/')); // get the specific url
            var nUrl = url.substr(url.lastIndexOf('/')+1); // Get the page name from url

            $('#menu li a').each(function(){
                if( $(this).attr('href') === nUrl){ // Comparing if we on the same page or not
                    alert($this.attr());
                    $(this).addClass('active'); // applying the class on the active page
                };
            });
            }
        </script>       
    </head>
    <body>
        <div id="encabezado"  >
	</div>
	<div id="cuerpo">
		<div id='cssmenu'> 
		  <ul >
                      <li  ><a href='#' >Inicio</a></li>
			<li ><a href='tesis'  >Tesis</a></li>
			<li ><a href='admindisciplina.html'  >Disciplina</a></li>
		  </ul>
		</div>
		<div id="datos">
                    <sitemesh:write property='body'/>
                </div>
        </div>
                     

        
    </body>
</html>
