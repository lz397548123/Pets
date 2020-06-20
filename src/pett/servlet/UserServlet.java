package pett.servlet;

import pett.bean.UserBean;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String method = request.getParameter("method");
        if ("login".equals(method)) {
            String username = new String(request.getParameter("userName").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
            System.out.println(username);
            String password = new String(request.getParameter("password").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
            System.out.println(password);
            UserBean userBean = new UserBean();
            boolean isValid = userBean.valid(username, password);
            if (isValid) {
                System.out.println("登录成功！");
                request.getSession().setAttribute("username", username);
                response.sendRedirect("welcome.jsp");
            } else {
                response.sendRedirect("login.jsp");
                System.out.println("账号或密码错误");
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
