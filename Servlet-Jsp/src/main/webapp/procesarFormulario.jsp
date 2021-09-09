<%--
  Created by IntelliJ IDEA.
  User: Andres Felipe Zapata
  Date: 8/09/2021
  Time: 8:22 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Procesar Formulario JSP</title>
</head>
<body>

    <h1>Resultado de procesar el formulario</h1>
    usuario: <%= request.getParameter("usuario")%>
    <br>
    password: <%= request.getParameter("password")%>

</body>
</html>
