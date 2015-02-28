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
                                <li> <form action="registrar" method>
                                            <input type='submit' name='' value='Agregar tesis'>
                                     </form>
                            </li>
                                <li> <form action="salir" method>
                                            <input type='submit' name='' value='Salir'>
                                     </form>
                            </li>
                            </ul>

                        </div> 
                        <div id="derecha">
                            <h2>Busqueda de tesis</h2>
                            <form action="buscarTesis" method>
                                <input type='text' name='cadena'/>
                                <input type='submit' name='filtrar' value='Buscar'>
                                     
                            </form>
                           
                            <form id="form1" name="form1" method="post" action="">
                                <p>
                                <label>
                                    <input  type="radio" name="Opciones" value="Por autor" id="Opciones_0" />
                                    autor</label>
                                <br />
                                <label>
                                    <input type="radio" name="Opciones" value="Por palabra clave" id="Opciones_1" />
                                    clave</label>
                                <br />
                                <label>
                                    <input type="radio" name="Opciones" value="Por disciplina de estudio" id="Opciones_2" />
                                    disciplina</label>
                                <br />
                                <label>
                                    <input type="radio" name="Opciones" value="Por especie de primate" id="Opciones_3" />
                                    especie</label>
                                <br />
                                <label>
                                    <input type="radio" name="Opciones" value="Por institucion" id="Opciones_4" />
                                    institucion</label>
                                <br />
                                </p>
                            </form>

                            <select name="autor">
                            <option>Seleccione autor</option>
                            <option>Carlos Mora</option>
                            <option>Laura Pozos</option>
                            <option>Mayra Bonilla</option>
                            <option>Carmina Bautista</option>
                            </select>

                            <select name="disciplina">
                            <option>Seleccione disciplina</option>
                            <option>Sociologia</option>
                            <option>Antropologia</option>
                            </select>

                            <select name="especie">
                            <option>Seleccione especie</option>
                            <option>Homo sapiens</option>
                            <option>Mono</option>
                            </select>

                            <select name="institucion">
                            <option>Seleccione institucion</option>
                            <option>Uv</option>
                            <option>UNAM</option>
                            </select>

                            <br>
                            <br />
                            <div>
                            <ol>            
                                <c:forEach items="${tesis}" var="art">
                                    <li>
                                        <textarea  style="text-align: left "name="Tesis Primates" cols="50" rows="4" disabled="disabled">
                                            Titulo: ${art.titulo} 
                                            Autor:  ${art.autor} 
                                        </textarea>
                                        <form action="editarTesis" method>
                                            <input type='hidden' name='cadena' value='${art.titulo}'>
                                            <input type='submit' name='' value='Editar tesis'>
                                        </form>
                                            <br>
                                        <form action="eliminar" method>
                                            <input type='hidden' name='idtesis' value='${art.idtesis}'>
                                            <input type='submit' name='' value='Eliminar tesis' onClick="return confirm('¿Esta seguro que desea eliminar '+'${art.titulo}'+'?')">
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










