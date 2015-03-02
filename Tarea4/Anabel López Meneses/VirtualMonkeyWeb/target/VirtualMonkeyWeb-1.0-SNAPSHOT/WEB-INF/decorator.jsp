<%-- 
    Document   : decorator
    Created on : 21/02/2015, 02:40:02 PM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Articulos \<sitemesh:write property='title'/> </title>
        <style>
            #encabezado{
                background-color: #e8fbc4;
                clear: both;
                width: 100%;
                height: 80px;
            }
            #menu{
                background-color: #3c6e3f;
                border: 1px solid black;
                float: left;
                width: 80px;
                height: 600px;
            }
            #body{
                margin: 10px;
                float: left;
                width: 80%
            }
        </style>
    </head>
    <body>
        <div id='encabezado'> ENCABEZADO</div>
        <div id='menu'>MENU</div>
        <div id='body'><sitemesh:write property="body" />
            <div class="main">
<!--header -->
			<header>
				<div class="wrapper">
					<h1><a href="index.html" id="logo">Virtual Monkey</a></h1>
					<form id="search" method="post">
						<fieldset>
							<div class="bg"><input class="input" type="text" value="Search"  onblur="if(this.value=='') this.value='Search'" onFocus="if(this.value =='Search' ) this.value=''" ></div>
						</fieldset>
					</form>
				</div>
				<nav>
					<ul id="menu">
						<li class="active"><a href="index.html"><span>Inicio</span></a></li>
						<li><a href="Company.html"><span>Administrar</span></a></li>
						<li><a href="Solutions.html"><span>Tesis</span></a></li>
						<li><a href="Services.html"><span>Services</span></a></li>
						<li class="last"><a href="Contacts.html"><span>Contacts</span></a></li>
					</ul>
				</nav>
                        </header>
            </div>
        
        </div>
            
    </body>
</html>
