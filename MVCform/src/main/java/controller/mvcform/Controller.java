package controller.mvcform;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "controllerServlet", value = "/controller")
public class Controller extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        if (action == null) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if (action.equals("login")) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else if (action.equals("dologin")) {
            String user = req.getParameter("user");
            String password = req.getParameter("password");
            User user1 = new User(user, password);
            if (user1.validate()) {
                HttpSession session = req.getSession(true);
                session.setAttribute("user", user);
                req.getRequestDispatcher("loginSuccess.jsp").forward(req, resp);
            }
        }
    }

    public void destroy() {
    }
}