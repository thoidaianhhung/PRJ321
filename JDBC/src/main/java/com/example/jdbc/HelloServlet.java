package com.example.jdbc;

import context.DBContext;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        DBContext context = new DBContext();
        try {
            Connection connection = context.getConnection();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        printWriter.println("Connected to database!");
    }

    public void destroy() {
    }
}