package com.example.controller;

import dao.OrderDao;
import model.Cart;
import model.Orders;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "PayController", value = "/pay")
public class PayController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            HttpSession session = request.getSession(true);
            OrderDao orderDao = new OrderDao();
            Cart cart = (Cart) session.getAttribute("cart");
            String USER_MAIL = request.getParameter("USER_MAIL");
            int ORDER_ID = Integer.parseInt(request.getParameter("ORDER_ID"));
            int ORDER_STATUS = Integer.parseInt(request.getParameter("ORDER_STATUS"));
            Date ORDER_DATE = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("ORDER_DATE"));
            java.sql.Date sqlDate = new java.sql.Date(ORDER_DATE.getTime());
            String ORDER_DISCOUNT_CODE = request.getParameter("ORDER_DISCOUNT_CODE");
            String ORDER_ADDRESS = request.getParameter("ORDER_ADDRESS");
            Orders d = new Orders(USER_MAIL, ORDER_ID, ORDER_STATUS, sqlDate, ORDER_DISCOUNT_CODE, ORDER_ADDRESS);
            orderDao.insertOrder(d, cart);
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            response.getWriter().println(e);
        }
    }
}
