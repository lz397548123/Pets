package pett.servlet;

import pett.bean.MasterBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateDoctorServlet")
public class UpdateDoctorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mrId = request.getParameter("mrId");
        String mrName = request.getParameter("mrName");
        String mrSex = request.getParameter("mrSex");
        String mrAge = request.getParameter("mrAge");
        String mrAddress = request.getParameter("mrAddress");
        String mrTel = request.getParameter("mrTel");
        String mrSkill = request.getParameter("mrSkill");

        MasterBean db = new MasterBean();
        if (db.updateDoctor(mrId, mrName, mrSex, mrAge, mrAddress, mrTel, mrSkill)) {
            response.sendRedirect("pages/success.jsp");
        }
    }
}

