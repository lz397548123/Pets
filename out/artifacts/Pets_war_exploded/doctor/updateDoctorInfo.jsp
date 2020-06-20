<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@page import="pett.bean.Doctor" %>
<%@page import="java.util.ArrayList" %>
<html>
<head>
    <title>修改医生信息</title>
</head>
<body bgcolor="#ff95ab">
<center>
    <br><br><br>
    <h3>请修改医生信息</h3>
    <form action="${pageContext.request.contextPath}/UpdateDoctorServlet" method="get">
        <table border="2" width="600">
            <%
                ArrayList<Doctor> al = (ArrayList<Doctor>) session.getAttribute("al");
                for (Doctor doctor : al) {
            %>
            <tr>
                <td>ID</td>
                <td>
                    <input type="text" name="mrId"
                           value="<%=doctor.getMrId()%>" readonly/>
                </td>
            </tr>

            <tr>
                <td>姓名</td>
                <td>
                    <input type="text" name="mrName"
                           value="<%=doctor.getMrName()%>"/>
                </td>
            </tr>

            <tr>
                <td>性别</td>
                <td>
                    <input type="text" name="mrSex"
                           value="<%=doctor.getMrSex()%>"/>
                </td>
            </tr>

            <tr>
                <td>年龄</td>
                <td>
                    <input type="text" name="mrAge"
                           value="<%=doctor.getMrAge()%>"/>
                </td>
            </tr>

            <tr>
                <td>家庭住址</td>
                <td>
                    <input type="text" name="mrAddress"
                           value="<%=doctor.getMrAddress()%>"/>
                </td>
            </tr>

            <tr>
                <td>电话</td>
                <td>
                    <input type="text" name="mrTel"
                           value="<%=doctor.getMrTel()%>"/>
                </td>
            </tr>

            <tr>
                <td>特长</td>
                <td>
                    <input type="text" name="mrSkill"
                           value="<%=doctor.getMrSkill()%>"/>
                </td>
            </tr>

            <tr align="center">
                <td colspan="2">
                    <input name="sure" type="submit" value="修改">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="clear" type="reset" value="清空">
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
