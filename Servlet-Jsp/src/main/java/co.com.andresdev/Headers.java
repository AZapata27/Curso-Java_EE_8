package co.com.andresdev;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Headers")
public class Headers extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition","attachment;filename=ExcelEjemplo.xls");
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setDateHeader("Expires",-1);


        request.getSession()

        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("\t3");
        out.println("Total\t=SUMA(b2:b4)");


    }
}
