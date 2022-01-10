package com.example.controller;

import dao.ListProductDAO;
import model.Cart;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AddToCartController", value = "/addToCart")
public class AddToCartController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/htm; charset=UTF-8");
        try {
            HttpSession session = request.getSession(true);
            String idd = request.getParameter("idd");
            String action = request.getParameter("action");
            if (action != null && action.equalsIgnoreCase("add")) {
                if (session.getAttribute("cart") == null) {
                    session.setAttribute("cart", new Cart());
                }
                int id = Integer.parseInt(idd);
                Product p = new ListProductDAO().getProductById(id);
                System.out.println(p.getPRODUCT_NAME() + p.getPRODUCT_IMG_SOURCE());
                Cart cart = (Cart) session.getAttribute("cart");
                cart.add(new Product(p.getPRODUCT_ID(), p.getPRODUCT_NAME(), p.getPRODUCT_DES(), p.getPRODUCT_PRICE(),
                        p.getPRODUCT_IMG_SOURCE(), p.getPRODUCT_TYPE(), p.getPRODUCT_BRAND(), 1));

                session.setAttribute("cart", cart);
            } else if (action != null && action.equalsIgnoreCase("delete")) {
                int id = Integer.parseInt(idd);
                Cart c = (Cart) session.getAttribute("cart");
                c.remove(id);
                session.setAttribute("cart", c);
            }
            response.sendRedirect("cart.jsp");
        } catch (Exception e) {
            response.getWriter().println(e);
        }
    }
}
