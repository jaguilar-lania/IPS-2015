<%-- 
    Document   : listarDisciplina
    Created on : 28/02/2015, 01:47:28 AM
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplina</title>
    </head>
    <body>
        <h1>ADMINISTRAR DISCIPLINA</h1>
        
        <form:form action="agregarDisciplina" method="POST" commandName="disciplinaEnt">
            <table border="0" align="center" bgcolor="#CCCCCC" id="formulario">
               <tr> 
                 <td width="250">NOMBRE:</td>
                 <td width="384">
                     <form:hidden path="iddisciplina" />
                     <form:input path="disciplina" type="text"/>
                </td>
               
               <tr> 
                 <td  style="text-align:right"><input  name="btnguardar" type="submit" value="Guardar" ></td>
                 <td  style="text-align:left"><input  name="btncancelar" type="reset" value="Cancelar" ></td>
               </tr>
           </table>
        </form:form>
        <br>
        <br>
     
      <table id="tabla">		
            <tr> 
                 <td class="tdagregar2" colspan="1">
                        <!--<a href="#">
                        <img src="css/agregar.jpg" />Agregar Tesis</a>-->
                 </td>
                 
                 <td class="tdagregar" style="text-align: right;"  colspan="2">  
                     <form action="buscarDisciplina" method>
                         Buscar:
                         <input type='text' name='cadena'/>
                         <input type='submit' name='filtrar' value='Buscar'>
                     </form>
                 </td>
            </tr>
            <tr>
                <th>DISCIPLINA</th>
              
                <th>EDITAR</th>
                <th>ELIMINAR</th>
            </tr>
           
            <%int fila=0;%>
       
            <c:forEach items="${disciplinas}" var="dis">
                <% if ((fila%2)==0){%>
                    <tr>
                <%} else {%>
                    <tr class="alt">
                <%} fila+=1;%>
                    <td>
                        ${dis.disciplina}
                    </td>
                   
                    <td>
                        <a href="editarDisciplina?iddisciplina=${dis.iddisciplina}"><img src="css/editar2.jpg"/></a>
                    </td>
                    <td>
                       <a href="borrarDisciplina?iddisciplina=${dis.iddisciplina}"><img src="css/eliminar2.jpg"/></a>
                    </td>
                 </tr>
               
            </c:forEach>
      </table>
    </body>
</html>
