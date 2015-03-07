<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        #izquierda { position: relative; width: 22%; top: 0; left: 0; background: #ddf; float: left; height: 900px; } 
        #derecha { position: relative; width: 78%; top: 0; right: 0; background: #ddf; float: right; height: 900px; } 
        .esqinfder { position: absolute; bottom: 5px; right: 5px; background: #ddf; } 
    </style>
    <body>
        <header> 
            Virtual Monkey 
        </header> 
        <section> 
            <fieldset id="f">
                <legend>Administrar Disciplina</legend>
                <div>
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
                     <div id="derecha">
                    <%int contador=0;%>
                     <c:forEach items="${disciplina}" var="art">
                       
                    <% if ((contador)==0){%>
                    <form:form action="registrarDisciplina" method="POST" commandName="discEntidad">
                        <h2 align="center">Editar Disciplina</h2><br>
                        <table border="0" align="center"  id="">
                           <tr> 
                             <td width="150">NOMBRE:</td>
                             <td width="384">
                                <form:input path="iddisciplina"  value="${art.iddisciplina}" size="50" type="hidden"/> 
                                <form:errors path="nombre"/>
                                 <form:input path="nombre" value="${art.nombre}" size="50" type="text" />
                             </td>
                           </tr>
                             
                             <tr> 
                             <td width="150">DESCRIPCIÓN:</td>
                             <td width="384">
                                  <form:errors path="descripcion"/>
                                <form:input path="descripcion"  value="${art.descripcion}" size="50" type="text"/> 

                             </td>
                           </tr>
                                <tr> 
                                    <td>
                                    <input name="registrarEditarDisciplina" type="submit" value="Guardar" />
                                    </td>
                                </tr>
                        </table>
                    
                    </form:form>
                    <%} else {%>
                    <%} contador+=1;%>
                    </c:forEach>
                     </div>
            </fieldset>
        </section>
        <p>&nbsp;</p>
        <footer> 

        </footer>

    </body>
</html>
