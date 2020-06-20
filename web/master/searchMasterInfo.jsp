<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@page import="pett.bean.Master" %>
<%@page import="java.util.ArrayList" %>
<html>
<head>
    <title>宠物主人信息</title>
</head>
<body bgcolor="#ff95ab">
<center>
    <br><br><br>
    <h3>宠物主人信息</h3>
    <form action="${pageContext.request.contextPath}/SearchMasterServlet" method="get">
        <table border="2" width="600">
            <%
                ArrayList<Master> al = (ArrayList<Master>) session.getAttribute("al");
                for (Master master : al) {
            %>
            <tr>
                <td>ID</td>
                <td>
                    <%=master.getMrId()%>
                </td>
            </tr>

            <tr>
                <td>姓名</td>
                <td>
                    <%=master.getMrName()%>
                </td>
            </tr>

            <tr>
                <td>性别</td>
                <td>
                    <%=master.getMrSex()%>
                </td>
            </tr>

            <tr>
                <td>年龄</td>
                <td>
                    <%=master.getMrAge()%>
                </td>
            </tr>

            <tr>
                <td>家庭住址</td>
                <td>
                    <%=master.getMrAddress()%>
                </td>
            </tr>

            <tr>
                <td>电话</td>
                <td>
                    <%=master.getMrTel()%>
                </td>
            </tr>

            <tr>
                <td>宠物种类</td>
                <td>
                    <%=master.getMrPet()%>
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
