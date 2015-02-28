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
                <legend>Administrar disciplina</legend>
                <br>
                    <div>
                        <div id="izquierda">

                            <br />
                            <br />
                            <br />

                            USUARIO: ADMINISTRADOR

                            <ul id="MenuBar1">
                                <li> <form action="registrar" method>
                                            <input type='submit' name='' value='Agregar disciplina'>
                                     </form>
                            </li>
                                <li> <form action="salir" method>
                                            <input type='submit' name='' value='Salir'>
                                     </form>
                            </li>
                            </ul>

                        </div> 
                        <div id="derecha">
                            <h2>Busqueda de disciplina</h2>
                            <form action="buscarDisciplina" method>
                                <input type='text' name='cadena'/>
                                <input type='submit' name='filtrar' value='Buscar'>
                                     
                            </form>
                           
                            
                            <br>
                            <br />
                            <div>
                            <ol>            
                                <c:forEach items="${disciplina}" var="art">
                                    <li>
                                        <textarea  style="text-align: left "name="Tesis Primates" cols="50" rows="4" disabled="disabled">
                                            Nombre: ${art.nombre} 
                                            Autor:  ${art.descripcion} 
                                        </textarea>
                                        <form action="editarDisciplina" method>
                                            <input type='hidden' name='cadena' value='${art.nombre}'>
                                            <input type='submit' name='' value='Editar disciplina'>
                                        </form>
                                            <br>
                                        <form action="eliminar" method>
                                            <input type='hidden' name='iddisciplina' value='${art.iddisciplina}'>
                                            <input type='submit' name='' value='Eliminar disciplina' onClick="return confirm('¿Esta seguro que desea eliminar '+'${art.nombre}'+'?')">
                                        </form>
                                    </li> 
                                </c:forEach>
                            </ol>
                          </div>
                    <div>
                </div>
            </div> 
        </fielset>
    </section> 
    <footer> 

    </footer>
    </body>
</html>










