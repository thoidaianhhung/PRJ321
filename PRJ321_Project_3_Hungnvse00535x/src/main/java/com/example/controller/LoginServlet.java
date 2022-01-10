package com.example.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            request.getSession(true).invalidate();
            // make sure that email is validate
            String regexMail = "^[A-Z0-9_a-z]+@[A-Z0-9.a-z]+\\.[A-Za-z]{2,6}$";
            String regex = "[a-zA-Z0-9_!@#$%^&*]+";
            // collect data from a login form
            String user = request.getParameter("uname");
            String password = request.getParameter("pswd");
            Account account = new Account();
            account.setUSER_MAIL(user);
            account.setPASSWORD(password);
            HttpSession session = request.getSession(true);
            if (!password.matches(regex) || !user.matches(regexMail)) {
                session.setAttribute("error", "validate syntax");
                response.sendRedirect("login.jsp");
            }
            // read information of account in web.xml
            String uid = getServletContext().getInitParameter("username");
            String pwd = getServletContext().getInitParameter("password");
            // check account
            if (user != null && account.getPASSWORD().equals(pwd) && account.getUSER_MAIL().equalsIgnoreCase(uid)) {
                // set session
                session.setAttribute("user", user);
                // login is validate
                response.sendRedirect("index.jsp");
            } else {
                session.setAttribute("error", "sai username hoặc password");
                response.sendRedirect("login.jsp");
            }
        } catch (NullPointerException e) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    public void destroy() {
    }
}