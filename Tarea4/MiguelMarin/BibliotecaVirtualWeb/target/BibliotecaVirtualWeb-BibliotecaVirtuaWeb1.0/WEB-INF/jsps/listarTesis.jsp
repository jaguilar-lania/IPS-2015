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
         <script type="text/javascript">
            
            function abrirPop()
            {
               var myWindow = window.open("subirArchivo", "_blanck", "width=400, height=400");
            }
        </script>
        <h1>ADMINISTRAR TESIS</h1>
        
        <form:form action="agregarTesis" method="POST" commandName="tesisEnt">
          
            <table border="0" align="center" bgcolor="#CCCCCC" id="formulario">
               <tr> 
                 <td width="250">TITULO TESIS:</td>
                 <td width="384">
                     <form:hidden path="idtesis" />
                     <form:input path="titulo" type="text"/>
                     <form:errors  path="titulo" cssClass="campoConError"/>
                 </td>
                 <td width="380">NOMBRE AUTOR : </td>
                 <td width="380"> 
                     <form:input path="autorTesis" type="text"/>
                     <form:errors path="autorTesis" cssClass="campoConError"/>
                 </td>
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
                 <td>
                     <form:input  path="anioTitulacion" type="text" />
                      <form:errors  path="anioTitulacion" cssClass="campoConError"/>
                 </td>
               </tr>
               <tr> 
                 <td width="250">INSTITUCION ADSCRIPCION:</td>
                 <td> 
                     <form:select  class="inputs" path="idinstitucionAdscripcion">
                        <form:option value="0" label="SELECCIONE UNA INSTITUCION"/>
                        <form:options items="${institucionadscripcion}" />
                     </form:select>
                    
                </td>
                 <td>DIRECTOR DE TESIS:</td>
                 <td>
                     <form:input path="directorTesis" type="text"/>
                     <form:errors path="directorTesis" cssClass="campoConError"/>
                 </td>
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
                      <form:select  class="inputs" path="idestado">
                        <form:option value="0" label="SELECCIONE UN ESTADO"/>
                        <form:options items="${estados}" />
                     </form:select>
                     
                </td>
               </tr>
               <tr> 
                 <td width="250">DISCIPLINA:</td>
                 <td>
                     <form:select  class="inputs" path="iddisciplina">
                        <form:option value="0" label="SELECCIONE UN DISCIPLINA"/>
                        <form:options items="${disciplinas}" />
                     </form:select>
                    
                </td>
                 <td>SUBDISCIPLINA:</td>
                 <td>
                      <form:select  class="inputs" path="idsubdisciplina">
                        <form:option value="0" label="SELECCIONE UN SUBDISCIPLINA"/>
                        <form:options items="${subdisciplinas}" />
                     </form:select>
                     
                </td>
               </tr>
               <tr> 
                 <td width="250">CONDICION DE SITIO:</td>
                 <td>
                     <form:input name="text322"  path="condicionSitio"   type="text" value=""/> 
                     <form:errors path="condicionSitio" cssClass="campoConError"/>
                 </td>
                 <td>ESPECIE:</td>
                 <td> 
                     <form:select  class="inputs" path="idespecie">
                        <form:option value="0" label="SELECCIONE UNA ESPECIE"/>
                        <form:options items="${especie}" />
                     </form:select>
                 </td>
               </tr>
               <tr>
                   <td>ARCHIVO:</td>
                    <td> 
                        
                       
                            
                           

                    </td>
                    <td></td>
                    <td></td>
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
                 <td class="tdagregar2" colspan="3">
                        <!--<a href="#">
                        <img src="css/agregar.jpg" />Agregar Tesis</a>-->
                 </td>
                 
                 <td class="tdagregar" style="text-align: right;"  colspan="2">  
                     <form action="buscarTesis" method>
                         Buscar:
                         <input type='text' name='cadena'/>
                         <input type='submit' name='filtrar' value='Buscar'>
                     </form>
                 </td>
            </tr>
            <tr>
                <th>TITULO</th>
                <th>AUTOR</th>
                
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
                       ${tes.anioTitulacion}
                    </td>
                    <td>
                        <a href="editarTesis?idtesis=${tes.idtesis}"><img src="css/editar2.jpg"/></a>
                    </td>
                    <td>
                       <a href="borrarTesis?idtesis=${tes.idtesis}"><img src="css/eliminar2.jpg"/></a>
                    </td>
                 </tr>
               
            </c:forEach>
      </table>
     
    </body>
</html>
