<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monkys \ <sitemesh:write property='title'/></title>
        <style>
            #encabezado {
                background-color: #e8fbc4;
                clear: both;
                width: 100%;
                height: 80px;
            }
            #menu {
                background-color: #3c6e3f;
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
        <div id='encabezado'>ENCABEZADO</div>
        <div id='menu'>MENU</div>
        <div id='body'><sitemesh:write property='body'/></div>
    </body>
</html>
