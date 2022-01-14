package com.example.model;

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
        String action = request.getParameter("action");
        String page = null;
        if (action.equals("hello")) {
            page = "hello.jsp";
        } else {
            page = "error.jsp";
        }
        request.getRequestDispatcher(page).forward(request, response);
    }

    public void destroy() {
    }
}