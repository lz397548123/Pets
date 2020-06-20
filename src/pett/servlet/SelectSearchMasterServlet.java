package pett.servlet;

import pett.bean.MasterBean;
import pett.bean.Master;

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

@WebServlet(name = "SelectUpdateMasterServlet")
public class SelectSearchMasterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            MasterBean db = new MasterBean();
            String mrName = new String(request.getParameter("name").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
            System.out.println(mrName);
            ResultSet rs = db.selectSearchMaster(mrName);
            HttpSession session = request.getSession();
            ArrayList<Master> al = new ArrayList<>();
            while (rs.next()) {
                Master mi = new Master();
                mi.setMrId(rs.getString("id"));
                mi.setMrName(rs.getString("name"));
                mi.setMrSex(rs.getString("sex"));
                mi.setMrAge(rs.getString("age"));
                mi.setMrAddress(rs.getString("address"));
                mi.setMrTel(rs.getString("tel"));
                mi.setMrPet(rs.getString("pet"));
                al.add(mi);
                session.setAttribute("al", al);
            }
            rs.close();
            if (al.size() == 0) {
                response.sendRedirect("pages/failure.jsp");
            }
            response.sendRedirect("master/searchMasterInfo.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
