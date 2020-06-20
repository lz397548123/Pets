package pett.servlet;

import pett.bean.MasterBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SearchPetServlet")
public class SearchPetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String petId = request.getParameter("petId");
        String petName = request.getParameter("petName");
        String petKind = request.getParameter("petKind");
        String petSex = request.getParameter("petSex");
        String petAge = request.getParameter("petAge");
        String petAddress = request.getParameter("petAddress");
        String mrPetName = request.getParameter("mrPetName");
        String mrPetTel = request.getParameter("mrPetTel");

        System.out.println(petId);
        System.out.println(petKind);
        System.out.println(petSex);
        System.out.println(petAge);
        System.out.println(petAddress);
        System.out.println(mrPetName);
        System.out.println(mrPetTel);

        MasterBean db = new MasterBean();
        if (db.updatePet(petId, petName, petKind, petSex, petAge, petAddress, mrPetName, mrPetTel)) {
            response.sendRedirect("pages/success.jsp");
        } else {
            response.sendRedirect("pages/failure.jsp");
        }
    }
}


