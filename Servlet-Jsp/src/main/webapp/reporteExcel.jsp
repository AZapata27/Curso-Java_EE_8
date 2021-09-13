
<%@ page import="co.com.andresdev.Conversiones, java.util.Date" %>
<%@ page contentType="application/vnd.ms-excel" %>
<%
        String nombreArchivo = "reporte.xls";
        response.setHeader("Content-Disposition","attachment;filename="+nombreArchivo);
%>
<html>
<head>
    <title>ReporteExcel</title>
</head>
<body>

    <h1>Reporte de Excel</h1>
    <br/>
    <table border="1">
        <tr>
            <th>Curso</th>
            <th>Descripcion</th>
            <th>Fecha</th>
        </tr>
        <tr>
            <td>1. Fundamentos Java</td>
            <td>Aprenderemos la sintaxis basica d Java</td>
            <td><%= Conversiones.format(new Date())%></td>
        </tr>
        <tr>
            <td>2. Programacion de java</td>
            <td>Aprenderemos programacion de POO en Java</td>
            <td><%= Conversiones.format(new Date())%></td>
        </tr>
    </table>


</body>
</html>
