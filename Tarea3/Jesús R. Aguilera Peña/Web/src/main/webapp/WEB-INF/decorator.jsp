<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tesis \ <sitemesh:write property='title'/></title>
        <style>
            #encabezado {
                background-color: #3333ff;
                clear: both;
                width: 100%;
                height: 80px;
            }
            #menu {
                background-color: #666600;
                border: 1px solid black;
                float: left;
                width: 80px;
                height: 600px;
            }
            #body {
                margin: 10px;
                float: left;
                width: 80%;
            }
        </style>
    </head>
    <body>
        <div id='encabezado'>Sistema de Administración de Tesis</div>
        <div id='menu'>Implementación de un producto de Software</div>
        <div id='body'><sitemesh:write property='body'/></div>
    </body>
</html>
