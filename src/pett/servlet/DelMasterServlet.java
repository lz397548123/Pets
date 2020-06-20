package pett.servlet;

import pett.bean.MasterBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DelMasterServlet")
public class DelMasterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mrId = request.getParameter("id");
        System.out.println(mrId);
        MasterBean db = new MasterBean();
        if (db.delMaster(mrId)) {
            response.sendRedirect("pages/success.jsp");
        } else {
            response.sendRedirect("pages/failure.jsp");
        }
    }
}
