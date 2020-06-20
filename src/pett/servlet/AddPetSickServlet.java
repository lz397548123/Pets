package pett.servlet;

import pett.bean.MasterBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddMasterServlet")
public class AddPetSickServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String remarks = request.getParameter("remarks");
        System.out.println(id);
        System.out.println(remarks);
        MasterBean db = new MasterBean();
        if (db.addPetSick(id, remarks)) {
            response.sendRedirect("pages/success.jsp");
        } else {
            response.sendRedirect("pages/failure.jsp");
        }
    }
}
