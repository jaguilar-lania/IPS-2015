<%-- 
    Document   : admonDisciplinas
    Created on : 28/02/2015, 02:47:14 AM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Virtual Monkey</title>

        
        
   <!-- <link href="Content/bootstrap.css" rel="stylesheet" />
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="Scripts/bootstrap.js" type="text/javascript"></script>-->
    

</head>

<body>
    
    
    <div>
        <div class="row">
            <div class='col-md-4'>
                
                    <div class="form-group">
                        <h1>Administrar Disciplinas</h1>
                        <form action="filtrarDisciplinas">
                            <input type="text" name="cadena" class="form-control"/>
                            <input type='submit' name='buscar' class="btn btn-primary" value="Buscar"/> 
                        </form>
                    </div>
                
                                
            </div>
        </div>
        
                <table class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>&nbsp;</th>
                            <th>&nbsp;</th>

                        </tr>
                    </thead>
                    
                    <tbody>
                    <c:forEach items="${disciplinas}" var="disciplinas1">
                        <tr>
                            <td class="col-md-1">${disciplinas1.id}</td>
                            <td>${disciplinas1.nombre}</td>
                                                                                
                            <td class="col-md-1">
                                <form action="buscarDisciplinaPorId">
                                    <button type="submit" class="btn btn-warning" >Editar</button>
                                     
                                    <input type="text" name="idDisciplina" value="${disciplinas1.id}" class="hide"  />
                                    
                               </form>
                        </div>
                            </td>
                            <td class="col-md-1">
                                <form action="eliminarDisciplina">
                                    <button type="submit" class="btn btn-danger">Eliminar</button>
                                    <input type="text" name="idDisciplina" value="${disciplinas1.id}" class="hide"  />
                                </form>
                                
                                                                
                            </td>
                            

                        </tr>
                    
                    </c:forEach>
                        
                    </tbody>
                </table>
        
               
            </div>
            <form action="crearDisciplina">
                <input type="submit" class="btn btn-primary" value="Crear Disciplina"/>
            </form> 
    
</body>
</html>

