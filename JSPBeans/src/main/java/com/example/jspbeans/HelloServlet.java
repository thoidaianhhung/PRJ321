package com.example.jspbeans;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String user = request.getParameter("user");
        HttpSession session = request.getSession(true);
        session.setAttribute("user", user);
        request.getRequestDispatcher("resultForm.jsp").forward(request, response);
    }

    public void destroy() {
    }
}