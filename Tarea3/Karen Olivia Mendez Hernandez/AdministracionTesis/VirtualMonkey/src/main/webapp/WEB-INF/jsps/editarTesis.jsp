<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <legend>Administrar tesis</legend>
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

                    <c:forEach items="${tesis}" var="art">


                        <form action="registrarTesis" method>

                            <div id="derecha" align="left">                
                                <h2 align="center">Editar Tesis</h2><br>
                                    <br />

                                    <div>

                                        <label>Titulo de la Tesis</label>
                                        <input name="titulo" type="text" style="vertical-align:middle" value="${art.titulo}" size="80" maxlength="8" required/>
                                        <br />
                                        <br />
                                        <label>Nombre del autor</label>
                                        <input name="autor" type="text" style="vertical-align:middle" value="${art.autor}" size="80" maxlength="8" required/>
                                        <br />
                                        <br />
                                        <label>Grado obtenido  </label>
                                        <select name="grado"  >
                                            <option name="grado">Bachillerato</option>
                                            <option name="grado">Universidad</option>
                                            <option name="grado">Maestría</option>
                                        </select>
                                        <br />
                                        <br />
                                        <label>Año de titulación </label>

                                        <select name='anio'>
                                            <option name='anio'>1998</option>
                                            <option name='anio'>1999</option>
                                            <option name='anio'>2000</option>
                                            <option name='anio'>Despues del 2000</option>
                                        </select>
                                        <br />
                                        <br />
                                        <label>Institución de adscripción</label>
                                        <select name='institucion'>
                                            <option name='institucion'>Tecnologico</option>
                                            <option name='institucion'>UNAM</option>
                                            <option name='institucion'>Uv</option>
                                        </select>
                                        <br />
                                        <br />
                                        <label>Director de la Tesis</label>
                                        <input name="director" type="text" style="vertical-align:middle" value="${art.director}" size="80" maxlength="8" required/>

                                        <br />
                                        <br />
                                        <label>Especie de primate</label>
                                        <select name='especie'>
                                            <option name='especie'>Mono</option>
                                            <option name='especie'>Monkey</option>
                                            <option name='especie'>Mapache</option>
                                            <option name='especie'>Mono Araña</option>
                                        </select>
                                        <br />
                                        <br />
                                        <label>Condicion del sitio de realización de la tesis</label>
                                        <select name='condicion'>
                                            <option name='condicion'>Buena</option>
                                            <option name='condicion'>Regular</option>
                                            <option name='condicion'>Mala</option>
                                        </select>
                                        <br />
                                        <br />
                                        <label>Estado del pais donde se realizo</label>
                                        <select name='estado'>
                                            <option name='estado'>Veracruz</option>
                                            <option name='estado'>Tamaulipas</option>
                                            <option name='estado'>Oaxaca</option>
                                            <option name='estado'>Puebla</option>
                                        </select>
                                        <br />
                                        <br />
                                        <label>Disciplina de estudio</label>
                                        <select name='disciplina'><option name='disciplina'>Sociologia</option></select>
                                        <br />
                                        <br />
                                        <label>Subdisciplina</label>
                                        <select name='subdisciplina'><option name='disciplina'>Sociologia</option></select>
                                        <br />
                                        <br />
                                        <form method="post" action="subir" enctype="multipart/form-data">
                                            <input type="file" value="${art.archivo}" name="archivo"/>
                                        </form>                                      <br />
                                        <br />
                                        <input name="registrarTesis" type="submit" value="Editar tesis" />


                                    </div>
                            </div>
                        </form>
                    </c:forEach>
            </fieldset>
        </section>
        <p>&nbsp;</p>
        <footer> 

        </footer>

    </body>
</html>
