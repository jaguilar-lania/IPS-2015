<%-- 
    Document   : editaTesis
    Created on : 27/02/2015, 08:44:03 PM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="Content/bootstrap.css" rel="stylesheet" />
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    
    <script src="Scripts/bootstrap.js" type="text/javascript"></script>
    
        <title>Edita Tesis</title>
    </head>
    <body>
    <form action="modificarTesis">
    <div class="form-group" id="datosTesisModifica" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="form-group">
            <div class="form-group">
                <div class="form-group">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="form-group" id="exampleModalLabel">EDITA TESIS</h4>
                </div>
                
                <div class="form-group">
                    <form>
                        
                        <div class=" form-group">
                            <label>Titulo</label>
                            <input type="text" name="titulo" class="form-control" value="${tesisId.titulo}" />

                        </div>

                        <div class="form-group">
                            <label>Año</label>
                            <input type="text" class="form-control" name="anio" value="${tesisId.año}" />
                        </div>

                        <div class="form-group">
                            <label>Autor</label>
                            <select class="form-control" name ="autor" value="">
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
                            <select class="form-control" name="director" >
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
                                <option value="NONE" label="--- Seleccionar Estado ---"/>
                                <option value="1" /> Veracruz</option>
                            <select>
                            
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
                    
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                    <input type='submit' name='modificar' class="btn btn-primary" value="Guardar"/>                                                      
                </div>
            </div>
        </div>
    </div>
    </form> 
        
    </body>
</html>
