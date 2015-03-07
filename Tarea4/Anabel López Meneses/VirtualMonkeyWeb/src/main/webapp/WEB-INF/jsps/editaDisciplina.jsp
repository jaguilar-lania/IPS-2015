<%-- 
    Document   : editaDisciplina
    Created on : 28/02/2015, 07:50:24 AM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="Content/bootstrap.css" rel="stylesheet" />
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    
    <script src="Scripts/bootstrap.js" type="text/javascript"></script>
        <title>Crea/Edita Disciplina</title>
    </head>
    <body>
        <form:form action="guardarDisciplina" method="POST" commandName="disciplina">
    <div class="container" id="datosDisciplinas" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="col-md-6">
            <div class="form-group">
                <h4 class="form-group" id="exampleModalLabel">CREA/EDITA DISCIPLINA</h4>
                
                <div class="form-group">
                    <form>
                        
                        <div class="form-group">
                            <label>Nombre</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="nombre" class="text " />
                            </div>
                            <form:input type="text" path="nombre" class="form-control" />
                            <form:hidden path="id"/>
                            
                        </div>
                                                        
                    </form>
                </div>
                    
                <div class="modal-footer">
                    
                    <a href="disciplinas"><button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button></a>
                    <input type='submit' name='guardar' class="btn btn-primary" value="Guardar" />   
                    
                </div>
            </div>
        </div>
    </div>
    </form:form>                        
    </body>
</html>
