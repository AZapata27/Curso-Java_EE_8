package co.com.andresdev;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");


        try {
            PrintWriter out = response.getWriter();
            out.println("Hola Mundo");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
