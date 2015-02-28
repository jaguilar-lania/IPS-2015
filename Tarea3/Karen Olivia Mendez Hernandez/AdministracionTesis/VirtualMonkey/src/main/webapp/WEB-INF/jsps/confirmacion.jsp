<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>TESIS</title>
    </head>
    <style> 
        header, footer { width: 100%; height: 70px; background: #ddf; font-size: 2em; text-align: center; clear: both; } 
        section { position: relative; } 
        #f{background: #ddf}
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
                <legend>Administrar tesis</legend>
                <br>
                    <div>
                        <div id="izquierda">

                            <br />
                            <br />
                            <br />

                            USUARIO: ADMINISTRADOR

                            <ul id="MenuBar1">
                                <li><form action="salir" method>
                                    <input type='submit' name='' value='Salir'>
                                </form></li>
                            </ul>

                        </div> 
                        <div id="derecha">

                            
                            <br>
                            <br />
                            <div>
                            
                                TESIS ELIMINADA CORRECTAMENTE
                                
                                <form action="regresar" method>
                                            <input type='submit' name='' value='Regresar'>
                                     </form>
                                
                          </div>
                    <div>
                </div>
            </div> 
        </fielset>
    </section> 
    <footer> 
    Pie 
    </footer>
    </body>
</html>










