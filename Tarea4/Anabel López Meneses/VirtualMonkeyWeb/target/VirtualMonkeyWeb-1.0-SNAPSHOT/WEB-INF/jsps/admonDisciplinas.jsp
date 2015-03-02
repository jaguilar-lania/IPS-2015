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


    <link href="Content/bootstrap.css" rel="stylesheet" />
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="Scripts/bootstrap.js" type="text/javascript"></script>
    

</head>

<body>
    <h1>Administrar Tesis</h1>
    <div>
        <div class="row">
            <div class="col-md-4">
                
                    <div class=" form-group">
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
                    <c:forEach items="${disciplinas}" var="tesis1">
                        <tr>
                            <td>${disciplinas.id}</td>
                            <td>${disciplinas.nombre}</td>
                                                                                
	                    <td>
                                <form action="buscarDisciplinaPorId">
                                    <button type="submit" class="btn btn-warning" >Editar</button>
                                     
                                    <input type="text" name="idDisciplina" value="${disciplinas.id}" class="hide"  />
                                    
                               </form>
                        </div>
                            </td>
                            <td>
                                <form action="eliminarTesis">
                                    <button type="submit" class="btn btn-danger">Eliminar</button>
                                    <input type="text" name="idTesis" value="${disciplinas.id}" class="hide"  />
                                </form>
                                
                                                                
                            </td>
                            

                        </tr>
                    
                    </c:forEach>
                        
                    </tbody>
                </table>
                
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#datosDisciplinas" data-whatever="@getbootstrap">Crear Tesis</button>
            </div>

                    
    <!--Muestro ventana modal-->
    <form action="guardarDisciplina">
    <div class="modal fade" id="datosTesis" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="exampleModalLabel">DISCIPLINA</h4>
                </div>
                
                <div class="modal-body">
                    <form>
                        
                        <div class=" form-group">
                            <label>Nombre</label>
                            <input type="text" name="nombre" class="form-control" />

                        </div>

                        
                    </form>
                </div>
                    
                <div class="modal-footer">
                    
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                    <button type='submit' name='guardar' class="btn btn-primary">Guardar</button>                                   
                </div>
            </div>
        </div>
    </div>
    </form>                        
</body>
</html>

