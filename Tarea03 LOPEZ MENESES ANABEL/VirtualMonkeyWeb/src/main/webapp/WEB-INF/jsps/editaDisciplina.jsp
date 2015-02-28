<%-- 
    Document   : editaDisciplina
    Created on : 28/02/2015, 07:50:24 AM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="Content/bootstrap.css" rel="stylesheet" />
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    
    <script src="Scripts/bootstrap.js" type="text/javascript"></script>
        <title>Edita Disciplina</title>
    </head>
    <body>
        <form action="guardarDisciplina">
    <div class="modal fade" id="datosTesis" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="exampleModalLabel">EDITA DISCIPLINA</h4>
                </div>
                
                <div class="modal-body">
                    <form>
                        
                        <div class=" form-group">
                            <label>Nombre</label>
                            <input type="text" name="nombre" class="form-control" value="${disciplina1.nombre}" />

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
