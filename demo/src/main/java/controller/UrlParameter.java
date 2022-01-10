package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UrlParameter", value = "/UrlParameter")
public class UrlParameter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String use = request.getParameter("user");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("The user parameter is: " + use);
        printWriter.println("</html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
