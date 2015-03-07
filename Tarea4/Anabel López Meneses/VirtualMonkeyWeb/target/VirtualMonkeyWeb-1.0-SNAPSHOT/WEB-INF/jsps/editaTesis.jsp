<%-- 
    Document   : editaTesis
    Created on : 27/02/2015, 08:44:03 PM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="Content/bootstrap.css" rel="stylesheet" />
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    
    <script src="Scripts/bootstrap.js" type="text/javascript"></script>-->
      
        
        <title>Crea/Edita Tesis</title>
    </head>
    <body>
    <form:form action="guardarTesis" method="POST" commandName="tesis">
            
    <div class="container" id="datosTesisModifica" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="col-md-6">
            <h4 class="form-group" id="exampleModalLabel">CREA/EDITA TESIS</h4>
            
            <form>
                <div class="form-group">
                        <div class="form-group">
                            
                            <label>Titulo</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="titulo" class="text " />
                            </div>
                           <form:input type="text" path="titulo" class="form-control" />
                            <form:hidden path="id"/>
                        </div>
                         
                                                        
                        <div class="form-group">
                            <label>Año</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="anio" class="text" />
                            </div>
                            <form:input type="number" path="anio" class="form-control" />
                        </div>

                        <div class="form-group" >
                            <label>Autor</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="idautor" class="text" />
                            </div>
                            
                            <form:select class="form-control" path ="idautor">
                                <form:option value="0" label="--- Seleccionar Autor ---"></form:option>/>
                                <form:options items="${listaAutor}"></form:options>
                                                              
                            </form:select>
                                                             
                        </div>

                        <div class=" form-group">
                            <label>Condición Sitio</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="idcondicionsitio" class="text" />
                            </div>
                            <form:select class="form-control" path="idcondicionsitio">
                                <form:option value="0" label="--- Seleccionar Condición Sitio ---"></form:option>
                                <form:options items="${listaCondicion}"></form:options>
                            </form:select>
                        </div>

                        <div class="form-group">
                            <label>Director de la Tesis</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="iddirectortesis" class="text" />
                            </div>
                            <form:select class="form-control" path="iddirectortesis" >
                                <form:option value="0" label="--- Seleccionar Director ---"></form:option>
                                <form:options items="${listaDirector}"></form:options>
                            </form:select>
                        </div>

                        <div class="form-group">
                            <label>Especie del Primate</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="idespecieprimate" class="text" />
                            </div>
                            <form:select class="form-control" path="idespecieprimate">
                                <form:option value="0" label="--- Seleccionar Especie ---"></form:option>
                                <form:options items="${listaEspecie}"></form:options>
                            </form:select>
                        </div>

                        <div class="form-group">
                            <label>Estado</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="idestado" class="text" />
                            </div>
                            <form:select class="form-control" path="idestado"> 
                                <form:option value="0" label="--- Seleccionar Estado ---"></form:option>
                                <form:options items="${listaEstado}"></form:options>
                                
                            </form:select>
                                                                           
                        </div>

                        <div class="form-group">
                            <label>Grado Obtenido</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="idgradoobtenido" class="text" />
                            </div>
                            <form:select class="form-control" path="idgradoobtenido">
                                <form:option value="0" label="--- Seleccionar Grado ---"></form:option>
                                <form:options items="${listaGrado}"></form:options>
                            </form:select>
                        </div>

                        <div class="form-group">
                            <label>Institución de Procedencia</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="idinstitucion" class="text" />
                            </div>
                            <form:select class="form-control" path="idinstitucion">
                                <form:option value="0" label="--- Seleccionar Institución ---"></form:option>
                                <form:options items="${listaInstitucion}"></form:options>
                            </form:select>
                        </div>

                        <div class="form-group">
                            <label>Subdisciplina de Estudio</label>
                            <div id="errores" class="text-danger text-uppercase">
                                <form:errors path="idsubdisciplina" class="text" />
                            </div>
                            <form:select class="form-control" path="idsubdisciplina">
                                <form:option value="0" label="--- Seleccionar Subdisciplina ---"></form:option>
                                <form:options items="${listaSubdisciplina}"></form:options>
                            </form:select>
                        </div>
                        
                      
                                
                        <div class="form-group">
                            <label>Archivo de la Tesis</label>
                            <input type="file" name="archivo" class="filestyle" data-buttonName="btn-primary" accept=".pdf"/>
                            
                            <!--<input type="submit" value="subir"/>-->
                        </div>
                </div>
                    
                            <div class="modal-footer">          
                                <a href="tesis"><button type="button" class="btn btn-default" value="tesis">Cancelar</button></a>
                                <input type='submit' name='modificar' class="btn btn-primary" value="Guardar"/>
                            </div>
                     
            </form>
        </div><!--div container-->
    </form:form> <!--form action guardarTesis-->
        
    </body>
</html>
