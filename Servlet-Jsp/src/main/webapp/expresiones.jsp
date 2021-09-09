<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>JSP con Expresiones</title>
</head>
<body>

    <h1>JSP con Expresiones</h1>
    Concatenacion: <%= "saludos"+" "+"jsp"%>
    <br>
    Operaciones Matematicas <%= 2*3/2+1%>
    <br>
    Session id: <%= session.getId()%>
    <br>
    <br>
    <a href="index.jsp">Inicio</a>

</body>
</html>
