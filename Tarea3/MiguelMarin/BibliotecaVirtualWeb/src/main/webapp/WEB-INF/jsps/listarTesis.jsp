<%-- 
    Document   : listaArticulos
    Created on : 21/02/2015, 11:18:52 AM
    Author     : miguel
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tesis</title>
    </head>
    <body>
        <h1>ADMINISTRAR TESIS</h1>
        
        <form:form action="agregarTesis" method="POST" commandName="tesisEnt">
            <table border="0" align="center" bgcolor="#CCCCCC" id="formulario">
               <tr> 
                 <td width="250">TITULO TESIS:</td>
                 <td width="384"><form:input path="titulo" type="text"/> </td>
                 <td width="380">NOMBRE AUTOR : </td>
                 <td width="380"> <form:input path="autorTesis" type="text"/></td>
               <tr> 
                 <td width="250">GRADO OBTENIDO:</td>
                 <td>
                     <form:select class="inputs" path="gradoObtenido" name="select">
                        <option value="1">LICENCIATURA</option>
                        <option value="2">MAESTRIA</option>
                        <option value="3">DOCTORADO</option>
                     </form:select>
                </td>
                 <td>AÑO TITULACION: </td>
                 <td> <form:input  path="anioTitulacion" type="text" /></td>
               </tr>
               <tr> 
                 <td width="250">INSTITUCION ADSCRIPCION:</td>
                 <td> 
                     <form:select class="inputs" path="idinstitucionAdscripcion" name="select2">
                        <option value="0">SELECCIONE UNA INSTITUCION</option>
                             <c:forEach items="${institucionadscripcion}" var="inst">
                                  <option value="${inst.idinstitucionAdscripcion}">${inst.nombre}</option>
                             </c:forEach>
                       </form:select> 
                </td>
                 <td>DIRECTOR DE TESIS:</td>
                 <td><form:input path="directorTesis" type="text"/></td>
               </tr>
               <tr> 
                <td width="250">ESTATUS</td>
                 <td><form:select class="inputs" path="estatus"  name="select3">
                        <option value="1">ACTIVA</option>
                        <option value="2">INACTIVA</option>
                    </form:select> 
                </td>
                 <td>ESTADO:</td>
                 <td>
                      <form:select class="inputs" path="idestado"  name="select4">
                     <option value="0">SELECCIONE UN ESTADO</option>
                     <c:forEach items="${estados}" var="est">
                              <option value="${est.idestado}">${est.nombre}</option>
                     </c:forEach>
                   </form:select> 
                </td>
               </tr>
               <tr> 
                 <td width="250">DISCIPLINA:</td>
                 <td> <form:select class="inputs" path="iddisciplina"  name="select3">
                        <option value="0">SELECCIONE UN DISCIPLINA</option>
                        <c:forEach items="${disciplinas}" var="dis">
                            <option value="${dis.iddisciplina}">${dis.disciplina}</option>
                         </c:forEach>
                     </form:select> 
                </td>
                 <td>SUBDISCIPLINA:</td>
                 <td> <form:select class="inputs" path="idsubdisciplina"  name="select4">
                        <option value="0">SELECCIONE UN SUBDISCIPLINA</option>
                       <c:forEach items="${subdisciplinas}" var="sdis">
                                <option value="${sdis.idsubdisciplina}">${sdis.nombre}</option>
                       </c:forEach>
                    </form:select> 
                </td>
               </tr>
               <tr> 
                 <td width="250">CONDICION DE SITIO:</td>
                 <td>
                     <form:input name="text322" path="archivoTesis"  type="text" value=""/> 
                 </td>
                 <td>ARCHIVO:</td>
                 <td> <form:input path="condicionSitio" name="text3222" type="text" value="" /></td>
               </tr>
              
               <tr> 
                 <td colspan="2" style="text-align:right"><input  name="btnguardar" type="submit" value="Guardar" ></td>
                 <td colspan="2" style="text-align:left"><input  name="btncancelar" type="reset" value="Cancelar" ></td>
               </tr>
           </table>
        </form:form>
        <br>
        <br>
     
      <table id="tabla">		
            <tr> 
                 <td class="tdagregar2" colspan="4">
                        <!--<a href="#">
                        <img src="css/agregar.jpg" />Agregar Tesis</a>-->
                 </td>
                 <td class="tdagregar">Buscar:</td>
                 <td class="tdagregar"  colspan="2">  
                     <form action="buscarTesis" method>
                         <input type='text' name='cadena'/>
                         <input type='submit' name='filtrar' value='Buscar'>
                     </form>
                 </td>
            </tr>
            <tr>
                <th>TITULO</th>
                <th>AUTOR</th>
                <th>DISCIPLINA</th>
                <th>SUBDISCIPLINA</th>
                <th>AÑO</th>
                <th>EDITAR</th>
                <th>ELIMINAR</th>
            </tr>
           
            <%int fila=0;%>
       
            <c:forEach items="${tesis}" var="tes">
                <% if ((fila%2)==0){%>
                    <tr>
                <%} else {%>
                    <tr class="alt">
                <%} fila+=1;%>
                    <td>
                        ${tes.titulo}
                    </td>
                    <td>
                        ${tes.autorTesis}
                    </td>
                    <td>
                         ${tes.iddisciplina}
                    </td>
                    <td>
                        ${tes.idsubdisciplina}
                    </td>
                    <td>
                       ${tes.anioTitulacion}
                    </td>
                    <td>
                       <a href="editarArticulo?id=${tes.idtesis}">Editar</a>
                    </td>
                    <td>
                       <a href="editarArticulo?id=${tes.idtesis}">Eliminar</a>
                    </td>
                 </tr>
               
            </c:forEach>
          
     
    </body>
</html>
