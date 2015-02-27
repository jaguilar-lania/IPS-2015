<%-- 
    Document   : listaArticulos
    Created on : 21/02/2015, 11:18:52 AM
    Author     : miguel
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tesis</title>
    </head>
    <body>
        <h1>ADMINISTRAR TESIS</h1>
        

         <table border="0" align="center" bgcolor="#CCCCCC" id="formulario">
            <tr> 
              <td width="180">TITULO TESIS:</td>
              <td width="384"> <input type="text" value=""></td>
              <td width="380">NOMBRE AUTOR : </td>
              <td width="380"> <input name="text2" type="text" value=""></td>
            </tr>
            <tr> 
              <td width="180">GRADO OBTENIDO:</td>
              <td> <select class="inputs" name="select">
                  <option value="1">LICENCIATURA</option>
                  <option value="2">MAESTRIA</option>
                  <option value="3">DOCTORADO</option>
                </select></td>
              <td>AÑO TITULACION: </td>
              <td> <input name="text" type="text" value=""></td>
            </tr>
            <tr> 
              <td width="180">INSTITUCION ADSCRIPCION:</td>
              <td><select class="inputs" name="select2">
                  <option value="1">UNIVERSIDAD VERACRUZANA</option>
                  <option value="2">LANIA</option>
                  <option value="3">INECOL</option>
                </select> </td>
              <td>DIRECTOR DE TESIS:</td>
              <td><input name="text3" type="text" value=""></td>
            </tr>
            <tr> 
              <td width="180">ESPECIE:</td>
              <td></td>
              <td>ESTADO:</td>
              <td><select class="inputs" name="select4">
                  <option value="1">VERACRUZ</option>
                  <option value="2">PUEBLA</option>
                  <option value="3">CAMPECHE</option>
                </select> </td>
            </tr>
            <tr> 
              <td width="180">DISCIPLINA:</td>
              <td><select class="inputs" name="select3">
                  <option value="1">TOXICOLOGÍA</option>
                  <option value="2">ESTRATEGIAS</option>
                  <option value="3">GENETICA</option>
                </select> </td>
              <td>SUBDISCIPLINA:</td>
              <td><select class="inputs" name="select4">
                  <option value="1">HUMANA</option>
                  <option value="2">INTERACCION</option>
                  <option value="3">ALIMENTARIA</option>
                </select> </td>
            </tr>
            <tr> 
              <td width="180">ESTATUS</td>
              <td><select class="inputs" name="select3">
                  <option value="1">ACTIVA</option>
                  <option value="2">INACTIVA</option>
                </select> </td>
              <td>AÑO:</td>
              <td><input name="text32" type="text" value=""> </td>
            </tr>
            <tr> 
              <td width="180">CONDICION DE SITIO:</td>
              <td>
                <input name="text322" type="text" value=""> </td>
              <td>ARCHIVO:</td>
              <td><input name="text3222" type="text" value=""></td>
            </tr>
                     <tr> 
              <td colspan="2" style="text-align:right"><input  name="btnguardar" type="button" value="Guardar" ></td>
              <td colspan="2" style="text-align:left"><input  name="btncancelar" type="button" value="Cancelar" ></td>
            </tr>
      </table>
     
      <table id="tabla">		
            <tr> 
                 <td class="tdagregar" colspan="4">
                        <a href="#">
                        <img src="css/agregar.jpg" />Agregar Tesis</a>
                 </td>
                 <td class="tdagregar">Buscar:</td>
                 <td class="tdagregar" ><input  type="text" id="busqueda"></td>
                 <td class="tdagregar" >
                        <input  name="e" type="button" id="btnbuscar" value="Buscar">
                 </td>
            </tr>
            <tr>
                <th>TITULO</th>
                <th>AUTOR</th>
                <th>ESPECIE PRIMATE</th>
                <th>DISCIPLINA</th>
                <th>AÑO</th>
                <th>EDITAR</th>
                <th>ELIMINAR</th>
            </tr>
           
            <%int fila=0;%>
       
            <c:forEach items="${tesis}" var="tes">
                 <tr>
                    <td>
                        ${tes.titulo}
                    </td>
                    <td>
                        ${tes.autorTesis}
                    </td>
                    <td>
                        ${tes.anioTitulacion}
                    </td>
                    <td>
                        ${tes.iddisciplina}
                    </td>
                    <td>
                        ${tes.iddisciplina}
                    </td>
                    <td>
                        ${tes.iddisciplina}<a href="editarArticulo?id=${tes.idtesis}">Editar</a>
                    </td>
                    <td>
                        ${tes.anioTitulacion}<a href="editarArticulo?id=${tes.idtesis}">Editar</a>
                    </td>
                  </tr>
            </c:forEach>
          
     
    </body>
</html>
