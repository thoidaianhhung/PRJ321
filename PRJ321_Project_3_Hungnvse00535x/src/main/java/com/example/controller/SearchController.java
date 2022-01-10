package com.example.controller;

import dao.ListProductDAO;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchController extends HttpServlet {
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
        response.setContentType("text/htm; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter ignored = response.getWriter()) {
            String name = request.getParameter("search");
            List<Product> list = new ListProductDAO().search(name);
            request.setAttribute("PRODUCTS", list);
            PrintWriter out = response.getWriter();
            out.println("Search");
            out.println(list.stream().count());
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            Logger.getLogger(ListController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
