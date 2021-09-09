<%--
  Created by IntelliJ IDEA.
  User: Andres Felipe Zapata
  Date: 8/09/2021
  Time: 7:24 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello World prueba!</h2>
<a href="/Servlet-Jsp/HolaMundo">llamando el servlet Hola mundo</a>
<a href="/Servlet-Jsp/Headers">Prueba de Headers Servlet</a>
<a href="expresiones.jsp">Ira expresiones Jsp</a>
<br>
<h4> Formulario HTML </h4>
<form name="form1" action="procesarFormulario.jsp">
    Usuario: <input type="text" name="usuario">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit" value="Enviar">

</form>


<ul>
    <li><%= 4 * 3 %>
    </li>
    <li></li>
</ul>
</body>
</html>


