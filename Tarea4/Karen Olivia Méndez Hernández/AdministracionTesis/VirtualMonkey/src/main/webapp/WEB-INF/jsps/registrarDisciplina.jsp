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
            <legend>ADMINISTRAR DISCIPLINA</legend>
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
                    <form:form action="registrarDisciplina" method="POST" commandName="discEntidad">
                        <h2 align="center">Agregar Disciplina</h2><br>
                        <table border="0" align="center"  id="formulario">
                           <tr> 
                             <td width="150">NOMBRE:</td>
                             <td width="384">
                                 <form:hidden path="iddisciplina" />
                                 <form:input size="50" path="nombre" type="text"/>
                                 <form:errors path="nombre"/>
                            </td>
                           </tr>
                            <tr><td>&nbsp;</td></tr>
                            <br>
                           <tr> 
                            <td width="150">DESCRIPCIÓN:</td>
                            <td ><form:input size="50" path="descripcion"/>
                             <form:errors path="descripcion"/></td>
                           </tr>
                           <tr><td>&nbsp;</td></tr>
                           <tr> 
                             <td  style="text-align:right"><input  name="btnguardar" type="submit" value="Guardar" ></td>
                             <td  style="text-align:left"><input  name="btncancelar" type="reset" value="Cancelar" ></td>
                           </tr>
                       </table>
                    </form:form>
                </div>
        <br>
        <br>
       </fieldset>
        </section>
        <p>&nbsp;</p>
        <footer> 

        </footer>

    </body>
</html>
