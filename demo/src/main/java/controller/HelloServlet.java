package controller;

import bean.Cart;

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

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        out.println("<html><body>");
        out.println("<h1>" + "User: " + user + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        /*String user = req.getParameter("user2");
        printWriter.println("<html>");
        printWriter.println("User post is: " + user);
        printWriter.println("</html>");*/
        /*Integer age = Integer.parseInt( req.getParameter("age"));*/
        /*int number = 2021;
        int age1 = number - age + 1;
        *//*printWriter.println("Tuoi là:  " + age1);*//*
        HttpSession session = req.getSession(true);
        session.setAttribute("age1", age1);
        req.getRequestDispatcher("ketqua.jsp").forward(req,resp);*/
        /*int number = 0;
        for (int i = 0; i <= age; i++) {
            if (i % 2 == 0) {
                number = number + i;
            }
        }
        HttpSession session = req.getSession(true);
        Cart cart = new Cart();
        cart.setTotalItems(number);
        session.setAttribute("number", number);
        req.getRequestDispatcher("ketqua.jsp").forward(req, resp);*/
    }

    public void destroy() {
    }
}