<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@page import="pett.bean.Doctor" %>
<%@page import="java.util.ArrayList" %>
<html>
<head>
    <title>医生信息</title>
</head>
<body bgcolor="#ff95ab">
<center>
    <br><br><br>
    <h3>医生信息</h3>
    <form action="${pageContext.request.contextPath}/SearchDoctorServlet" method="get">
        <table border="2" width="600">
            <%
                ArrayList<Doctor> al = (ArrayList<Doctor>) session.getAttribute("al");
                for (Doctor doctor : al) {
            %>
            <tr>
                <td>ID</td>
                <td>
                    <%=doctor.getMrId()%>
                </td>
            </tr>

            <tr>
                <td>姓名</td>
                <td>
                    <%=doctor.getMrName()%>
                </td>
            </tr>

            <tr>
                <td>性别</td>
                <td>
                    <%=doctor.getMrSex()%>
                </td>
            </tr>

            <tr>
                <td>年龄</td>
                <td>
                    <%=doctor.getMrAge()%>
                </td>
            </tr>

            <tr>
                <td>家庭住址</td>
                <td>
                    <%=doctor.getMrAddress()%>
                </td>
            </tr>

            <tr>
                <td>电话</td>
                <td>
                    <%=doctor.getMrTel()%>
                </td>
            </tr>

            <tr>
                <td>擅长科类</td>
                <td>
                    <%=doctor.getMrSkill()%>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </form>
</center>
</body>
</html>
