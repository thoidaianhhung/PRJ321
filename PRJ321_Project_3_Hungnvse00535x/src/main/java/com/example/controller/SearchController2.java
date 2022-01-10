package com.example.controller;

import dao.ListProductDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchController2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            String text = request.getParameter("s");
            request.setAttribute("results", new ListProductDAO().search(text));
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("menus.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            response.getWriter().println(e);
        }
    }
}
