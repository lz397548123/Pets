<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@page import="pett.bean.Master" %>
<%@page import="java.util.ArrayList" %>
<html>
<head>
    <title>修改宠物主人信息</title>
</head>
<body bgcolor="#ff95ab">
<center>
    <br><br><br>
    <h3>请修改宠物主人信息</h3>
    <form action="${pageContext.request.contextPath}/UpdateMasterServlet" method="get">
        <table border="2" width="600">
            <%
                ArrayList<Master> al = (ArrayList<Master>) session.getAttribute("al");
                for (Master master : al) {
            %>
            <tr>
                <td>ID</td>
                <td>
                    <input type="text" name="mrId"
                           value="<%=master.getMrId()%> " readonly/>
                </td>
            </tr>

            <tr>
                <td>姓名</td>
                <td>
                    <input type="text" name="mrName"
                           value="<%=master.getMrName()%>"/>
                </td>
            </tr>

            <tr>
                <td>性别</td>
                <td>
                    <input type="text" name="mrSex"
                           value="<%=master.getMrSex()%>"/>
                </td>
            </tr>

            <tr>
                <td>年龄</td>
                <td>
                    <input type="text" name="mrAge"
                           value="<%=master.getMrAge()%>"/>
                </td>
            </tr>

            <tr>
                <td>家庭住址</td>
                <td>
                    <input type="text" name="mrAddress"
                           value="<%=master.getMrAddress()%>"/>
                </td>
            </tr>

            <tr>
                <td>电话</td>
                <td>
                    <input type="text" name="mrTel"
                           value="<%=master.getMrTel()%>"/>
                </td>
            </tr>

            <tr>
                <td>宠物种类</td>
                <td>
                    <input type="text" name="mrPet"
                           value="<%=master.getMrPet()%>"/>
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
