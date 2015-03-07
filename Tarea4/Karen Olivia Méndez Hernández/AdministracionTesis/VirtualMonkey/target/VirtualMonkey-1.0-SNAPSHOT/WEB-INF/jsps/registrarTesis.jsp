<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Documento sin título</title>
        <script src="file:///C|/Users/user/AppData/Roaming/Adobe/Dreamweaver CS6/es_ES/Configuration/Temp/Assets/eamFF98.tmp/SpryMenuBar.js" type="text/javascript"></script>
        <link href="file:///C|/Users/user/AppData/Roaming/Adobe/Dreamweaver CS6/es_ES/Configuration/Temp/Assets/eamFF98.tmp/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
    </head>
    <style> 
        header, footer { width: 100%; height: 100px; background: #ddf; font-size: 2em; text-align: center; clear: both; } 
        section { position: relative; } 
        span.campoConError {color: red;}
        #izquierda { position: relative; width: 23%; top: 0; left: 0; background: #ddf; float: left; height: 900px; } 
        #derecha { position: relative; width: 76%; top: 0; right: 0; background: #ddf; float: right; height: 900px; } 
        .esqinfder { position: absolute; bottom: 5px; right: 5px; background: #ddf; } 
    </style>
    <body>
        <header> 
            Virtual Monkey 
        </header> 
        <section> 
            <fieldset id="f">
                <legend>Administrar tesis</legend>
                
                    <div id="izquierda">
                        <br />
                        <br />
                        <br />

                        USUARIO: ADMINISTRADOR

                        <ul id="MenuBar1">
                            <li> <form action="salir" method>
                                    <input type='submit' name='' value='Salir'>
                                </form>
                            </li>
                        </ul>
                    </div>

            <div id="derecha" align="left">   
            <form:form action="registrarTesis" method="POST" commandName="tesisEntidad">
             <h2 align="center">Agregar Tesis</h2><br>
            <table border="0" align="center"  id="">
               <tr> 
                 <td width="150">TITULO TESIS:</td>
                 <td width="384">
                    <form:input path="idtesis" size="50" type="hidden"/> 

                     <form:input path="titulo" size="50" type="text" />
                     <form:errors path="titulo" cssClass="campoConError"/>
                 </td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
               
               <tr>
                 <td width="150">NOMBRE AUTOR : </td>
                 <td width="380"> <form:input path="autor" size="50" type="text" />
                  <form:errors path="autor"/></td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>

               <tr>
                 <td width="150">AÑO TITULACION: </td>
                 <td> <form:input  path="anio" size="50" type="text" />
                 <form:errors path="anio"/></td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
                 
                <tr>
                 <td width="150">DIRECTOR DE TESIS:</td>
                 <td><form:input path="director" size="50" type="text" />
                 <form:errors path="director"/></td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
               
               <tr> 
                 <td width="150">CONDICIÓN DE SITIO:</td>
                 <td><form:input name="condicion" size="50"  path="condicion"   type="text" value="" />
                 <form:errors path="condicion"/></td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
               
               <tr> 
                 <td width="150">GRADO OBTENIDO:</td>
                 <td>
                   <form:errors path="grado"/>
                    <form:select class="inputs" path="grado" name="select">
                        <form:option value="0" label="SELECCIONE UN GRADO"/>
                        <c:forEach items="${grado}" var="art">
                        <form:option value="${art.grado}" />
                        </c:forEach>
                        <form:errors path="grado"/>
                    </form:select>  
                </td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
               
               
               <tr> 
                 <td width="150">INSTITUCIÓN:  </td>
                 <td> 
                    <form:select class="inputs" path="institucion" name="select">
                        <form:option value="0" label="SELECCIONE UNA INSTITUCIÓN"/>
                        <c:forEach items="${institucion}" var="art">
                        <form:option value="${art.institucion}" />

                        </c:forEach>
                    </form:select>  
                    
                </td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
               
              
               <tr>
                 <td width="150">ESTADO:</td>
                 <td>
                      <form:select class="inputs" path="estado" name="select">
                        <form:option value="0" label="SELECCIONE UN ESTADO"/>
                        <c:forEach items="${estados}" var="art">
                        <form:option value="${art.estado}" />

                        </c:forEach>
                    </form:select> 
                     
                </td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
               
               <tr> 
                 <td width="150">DISCIPLINA:</td>
                 <td>
                  <form:select class="inputs" path="disciplina" name="select">
                      <form:option value="0" label="SELECCIONE UNA DISCIPLINA"/>
                        <c:forEach items="${disciplina}" var="art">
                        <form:option value="${art.nombre}" />

                        </c:forEach>
                    </form:select> 
                    
                </td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
               
               <tr>
                 <td width="150">SUBDISCIPLINA:</td>
                 <td width="650">
                      <form:select class="inputs" path="subdisciplina" name="select">
                          <form:option value="0" label="SELECCIONE UNA SUBDISCIPLINA"/>
                        <c:forEach items="${subdisciplina}" var="art">
                        <form:option value="${art.subdisciplina}" />
                        </c:forEach>
                    </form:select> 
                </td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
               
               <tr> 
                 <td width="150">ESPECIE:</td>
                 <td><form:select class="inputs" path="especie" name="select">
                         <form:option value="0" label="SELECCIONE UNA ESPECIE"/>
                        <c:forEach items="${especie}" var="art">
                        <form:option value="${art.especie}" />
                        </c:forEach>
                    </form:select> </td>
               </tr>
              
               <tr><td>&nbsp;</td></tr>
              
               <tr> 
                   <td>   <form method="post" action="subir" enctype="multipart/form-data">
                        <form:input name="archivo" size="50"  path="archivo"   type="file" value=""/>
                        <form:errors path="archivo"/>
                       </form></td>
               </tr>
               
               <tr><td>&nbsp;</td></tr>
              
               <tr> 
                 <td colspan="" style="text-align:left"><input  name="btnguardar" type="submit" value="Guardar" ></td>
                 <td colspan="" style="text-align:left"><input  name="btncancelar" type="reset" value="Cancelar" ></td>
               </tr>
           </table>
        </form:form>

                        </div>
                    
            </fieldset>
        </section>
        <p>&nbsp;</p>
        <footer> 

        </footer>

    </body>
</html>
