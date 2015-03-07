<%-- 
    Document   : admonTesis
    Created on : 24/02/2015, 04:39:16 PM
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


    <!--<link href="Content/bootstrap.css" rel="stylesheet" />
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="Scripts/bootstrap.js" type="text/javascript"></script>-->
    

</head>

<body>
    
    <div > 
        <div>
            <div class="col-md-4">
                
                <h1>Administrar Tesis</h1>
                
                    <div class=" form-group">
                        <form action="filtrarTesis">
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
                            <th>Titulo</th>
                            <th>Año</th>
                            <th>Autor</th>
                            <th>Condición Sitio</th>
                            <th>Director de la Tesis</th>
                            <th>Especie del Primate</th>
                            <th>Estado</th>
                            <th>Grado Obtenido</th>
                            <th>Institución de Procedencia</th>
                            <th>Subdisciplina de Estudio</th>
                            <th>&nbsp;</th>
                            <th>&nbsp;</th>

                        </tr>
                    </thead>
                    
                    <tbody>
                    <c:forEach items="${tesis}" var="tesis1">
                        <tr>
                            <td>${tesis1.id}</td>
                            <td>${tesis1.titulo}</td>
                            <td>${tesis1.anio}</td>
                            <td>${tesis1.autor}</td>
                            <td>${tesis1.condicionsitio}</td>
                            <td>${tesis1.directortesis}</td>
                            <td>${tesis1.especieprimate}</td>
                            <td>${tesis1.estado}</td>
                            <td>${tesis1.gradoobtenido}</td>
                            <td>${tesis1.institucion}</td>
                            <td>${tesis1.subdisciplina}</td>
                                                    
                             <!--<td>
                                <form:form action="SubirArchivo">
                                    <a href="formArchivo"><button type="submit" class="btn btn-primary" >Subir Archivo</button></a>
                                    <input type="text" name="idTesis" value="${tesis1.id}" class="hide"  />                                  
                               </form:form>
                           </td>  -->  
	                    <td>
                                <form:form action="buscarTesisPorId">
                                    <button type="submit" class="btn btn-warning" >Editar</button>
                                     
                                    <input type="text" name="idTesis" value="${tesis1.id}" class="hide"  />
                                    
                               </form:form>
                           </td>
                            <td>
                                <form action="eliminarTesis">
                                    <button type="submit" class="btn btn-danger">Eliminar</button>
                                    <input type="text" name="idTesis" value="${tesis1.id}" class="hide"  />
                                </form>
                                
                                                                
                            </td>
                            

                        </tr>
                    
                    </c:forEach>
                        
                    </tbody>
                </table>
        
            </div>

    
       <!-- <input type="submit" class="btn btn-primary" 
               data-toggle="modal" data-target="#datosTesis" 
               data-whatever="@getbootstrap" value="Crear Tesis" />-->
       <form action="crearTesis">
           <input type="submit" class="btn btn-primary" value="Crear Tesis"/>
       </form> 
       
       
        
    <!--Muestro ventana modal-->
    <!--<form action="guardarTesis">-->
    <!--<form:form action="guardarTesis">
    <div class="modal fade" id="datosTesis" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="exampleModalLabel">TESIS</h4>
                </div>
                
                <div class="modal-body">
                    <form>
                        
                        <div class=" form-group">
                            <label>Titulo</label>
                            <input type="text" name="titulo" class="form-control" />

                        </div>

                        <div class="form-group">
                            <label>Año</label>
                            <input type="text" class="form-control" name="anio"  />
                        </div>

                        <div class="form-group">
                            <label>Autor</label>
                            <select class="form-control" name ="autor">
                                <option value="NONE" label="--- Seleccionar Autor ---"/>
                                <option value="1">Autor 1</option>
                            </select>
                        </div>

                        <div class=" form-group">
                            <label>Condición Sitio</label>
                            <select class="form-control" name="condicion">
                                <option value="NONE" label="--- Seleccionar Condición Sitio ---"/>
                                <option value="1">Condición 1</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Director de la Tesis</label>
                            <select class="form-control" name="director">
                                <option value="NONE" label="--- Seleccionar Director ---"/>
                                <option value="1">Director 1</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Especie del Primate</label>
                            <select class="form-control" name="especie">
                                <option value="NONE" label="--- Seleccionar Especie ---"/>
                                <option value="1">Primate 1</option>
                            </select>
                        </div>
                        
                        <div class="form-group">
                            <label>Estado</label>
                            <select class="form-control" name="estado">
                                <option value="NONE" label="--- Seleccionar estado ---"/>
                                <option value="1">Veracruz</option>
                            </select>                                              
                        </div>
                        <div class="form-group">
                            <label>Grado Obtenido</label>
                            <select class="form-control" name="grado">
                                <option value="NONE" label="--- Seleccionar Grado ---"/>
                                <option value="1">Maestria</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Institución de Procedencia</label>
                            <select class="form-control" name="institucion">
                                <option value="NONE" label="--- Seleccionar Institución ---"/>
                                <option value="1">Universidad Veracruzana</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Subdisciplina de Estudio</label>
                            <select class="form-control" name="subdisciplina">
                                <option value="NONE" label="--- Seleccionar Subdisciplina ---"/>
                                <option value="1">Changos 1</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Archivo de la Tesis</label>
                            <input type="file" id="ejemplo_archivo_1">
                        </div>

                    </form>
                </div>
                    
                <div class="modal-footer">
                    <form action="guardarTesis">  
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                    <button type='submit' name='guardar' class="btn btn-primary">Guardar</button>                                   
                    </form>
                </div>
            </div>
        </div>
    </div>
    </form:form>          -->              
</body>
</html>

