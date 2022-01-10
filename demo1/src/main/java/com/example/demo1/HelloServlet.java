package com.example.demo1;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletContext context = getServletContext();
        Integer integer = (Integer) context.getAttribute("integer");
        if (integer == null) {
            integer = 0;
        } else {
            integer++;
        }
        context.setAttribute("integer", integer);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("Integer: " + integer);
    }

    public void destroy() {
    }
}