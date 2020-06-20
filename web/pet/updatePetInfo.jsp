<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@page import="pett.bean.Pet" %>
<%@page import="java.util.ArrayList" %>
<html>
<head>
    <title>修改宠物信息</title>
</head>
<body bgcolor="#ff95ab">
<center>
    <br><br><br>
    <h3>请修改宠物信息</h3>
    <form action="${pageContext.request.contextPath}/UpdatePetServlet" method="get">
        <table border="2" width="600">
            <%
                ArrayList<Pet> al = (ArrayList<Pet>) session.getAttribute("al");
                for (Pet pet : al) {

            %>
            <tr>
                <td>宠物编号</td>
                <td>
                    <input type="text" name="petId"
                           value="<%=pet.getPetId()%>" readonly/>
                </td>
            </tr>

            <tr>
                <td>宠物名称</td>
                <td>
                    <input type="text" name="petName"
                           value="<%=pet.getPetName()%>"/>
                </td>
            </tr>

            <tr>
                <td>宠物品种</td>
                <td>
                    <input type="text" name="petKind"
                           value="<%=pet.getPetKind()%>"/>
                </td>
            </tr>

            <tr>
                <td>雌雄</td>
                <td>
                    <input type="text" name="petSex"
                           value="<%=pet.getPetSex()%>"/>
                </td>
            </tr>

            <tr>
                <td>年龄</td>
                <td>
                    <input type="text" name="petAge"
                           value="<%=pet.getPetAge()%>"/>
                </td>
            </tr>

            <tr>
                <td>宠物产地</td>
                <td>
                    <input type="text" name="petAddress"
                           value="<%=pet.getPetAddress()%>"/>
                </td>
            </tr>

            <tr>
                <td>宠物主人姓名</td>
                <td>
                    <input type="text" name="mrPetName"
                           value="<%=pet.getMrPetName()%>"/>
                </td>
            </tr>

            <tr>
                <td>宠物主人电话</td>
                <td>
                    <input type="text" name="mrPetTel"
                           value="<%=pet.getMrPetTel()%>"/>
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
