<%-- 
    Document   : drowlist
    Created on : 4/03/2015, 11:36:57 AM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form:form method="POST" commandname="estados">

        <div class="form-group">
            <label>Estado</label>
             <form:select path="country">
                    <form:option value="NONE" label="--- Select ---"/>
                    <form:options items="${countryList}" />
            </form:select>                                                 
        </div>
        </form:form>
    </body>
</html>
