package com.example.parameter;

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
        String user = getServletContext().getInitParameter("user");
        String password = getServletContext().getInitParameter("password");
        String user1 = request.getParameter("user");
        String password1 = request.getParameter("password");
        if (user1.equals(user) && password1.equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", user);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        }
    }

    public void destroy() {
    }
}