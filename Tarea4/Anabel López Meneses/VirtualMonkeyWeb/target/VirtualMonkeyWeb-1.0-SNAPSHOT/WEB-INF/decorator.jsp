<%-- 
    Document   : decorator
    Created on : 21/02/2015, 02:40:02 PM
    Author     : Anny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Virtual Monkey \<sitemesh:write property='title'/> </title>
        <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
        <link rel="stylesheet" href="Content/bootstrap.css" type="text/css"/>
        <link rel="stylesheet" href="Content/bootstrap-theme.min.css" type="text/css">
          <script src="Scripts/bootstrap-filestyle.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/jquery-1.6.js" ></script>
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/cufon-replace.js"></script>  
        <script type="text/javascript" src="js/Vegur_300.font.js"></script>
        <script type="text/javascript" src="js/PT_Sans_700.font.js"></script>
        <script type="text/javascript" src="js/PT_Sans_400.font.js"></script>
        <script type="text/javascript" src="js/tms-0.3.js"></script>
        <script type="text/javascript" src="js/tms_presets.js"></script>
        <script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
        <script type="text/javascript" src="js/atooltip.jquery.js"></script>
                
        
        <link href="Content/bootstrap.css" rel="stylesheet" />
        <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
        <script src="Scripts/bootstrap.js" type="text/javascript"></script>


        <!--<style>
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
        </style>-->
        
    </head>
    <body>
        <!--<div id='encabezado'> ENCABEZADO</div>-->
        <div id ='encabezado' class="main">
            <header>
                <div class="wrapper">
                        <!--<h1><a href="index.html" id="logo">Virtual Monkey</a></h1>-->
                        <form id="search" method="post">
                                <fieldset>
                                        <div class="bg"><input class="input" type="text" value="Search"  onblur="if(this.value=='') this.value='Search'" onFocus="if(this.value =='Search' ) this.value=''" ></div>
                                </fieldset>
                        </form>
                </div>
                <div class="main">
                    <nav>
                            <ul id="menu">
                                    <li class="active"><a href="index.html"><span>Inicio</span></a></li>
                                   
                                    <li><a href="tesis"><span>Tesis</span></a></li>
                                    <li><a href="disciplinas"><span>Disciplinas</span></a></li>
                                    
                            </ul>
                    </nav>
                </div>
            </header>
        </div>
        <div id='body' >
            
            <div >
                <sitemesh:write property="body" />
               
            </div>
            
        </div>
        
        </div>
            
    </body>
</html>
