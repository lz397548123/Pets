package pett.servlet;

import pett.bean.MasterBean;
import pett.bean.Pet;
import pett.bean.PetSick;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.ArrayList;

@WebServlet(name = "SelectSearchPetServlet")
public class SelectSearchPetServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            MasterBean db = new MasterBean();
            String petId = new String(request.getParameter("petId").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
            System.out.println(123456);
            ResultSet rs = db.selectUpdatePet(petId);
            HttpSession session = request.getSession();
            ArrayList<Pet> al = new ArrayList<>();
            while (rs.next()) {
                Pet mi = new Pet();
                mi.setPetId(rs.getString("id"));
                mi.setPetName(rs.getString("petName"));
                mi.setPetKind(rs.getString("kind"));
                mi.setPetSex(rs.getString("sex"));
                mi.setPetAge(rs.getString("age"));
                mi.setPetAddress(rs.getString("address"));
                mi.setMrPetName(rs.getString("name"));
                mi.setMrPetTel(rs.getString("tel"));
                al.add(mi);
                session.setAttribute("al", al);
            }
            rs.close();
            ResultSet rs2 = db.selectPetSick(petId);
            ArrayList<PetSick> al2 = new ArrayList<>();
            while (rs2.next()) {
                PetSick petSick = new PetSick();
                petSick.setId((rs2.getString("id")));
                petSick.setSickTime((rs2.getString("sickTime")));
                petSick.setRemarks((rs2.getString("remarks")));
                al2.add(petSick);
                session.setAttribute("al2", al2);
            }
            if (al.size() == 0) {
                response.sendRedirect("pages/failure.jsp");
            }
            if (al2.size() == 0) {
                PetSick petSick = new PetSick();
                petSick.setId("");
                petSick.setSickTime("");
                petSick.setRemarks("");
                al2.add(petSick);
                session.setAttribute("al2", al2);
            }
            response.sendRedirect("pet/searchPetInfo.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
