<%@ page isErrorPage="true" %>
<%@ page import="java.io.*" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Error</title>
</head>
<body>
    <h1>Se a producido un error en la aplicación</h1>
    <br>
    Ocurrio una excepcion: <%=exception.getMessage()%>
    <br>
    <textarea name="" id="" cols="30" rows="10">

        <% exception.printStackTrace(new PrintWriter(out)); %>

    </textarea>






</body>
</html>
