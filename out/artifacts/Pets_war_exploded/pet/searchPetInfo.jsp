<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@page import="pett.bean.Pet" %>
<%@page import="java.util.ArrayList" %>
<%@ page import="pett.bean.PetSick" %>
<html>
<head>
    <title>宠物信息</title>
</head>
<body bgcolor="#ff95ab">
<%
    String id = null;
%>
<center>
    <br><br><br>
    <h3>宠物信息</h3>
    <form action="${pageContext.request.contextPath}/SearchPetServlet" method="get">
        <table border="2" width="600">
            <%
                ArrayList<Pet> al = (ArrayList<Pet>) session.getAttribute("al");
                for (Pet pet : al) {
                    id = pet.getPetId();
            %>
            <tr>
                <td>宠物编号</td>
                <td>
                    <%=pet.getPetId()%>
                </td>
            </tr>

            <tr>
                <td>宠物名称</td>
                <td>
                    <%=pet.getPetName()%>
                </td>
            </tr>

            <tr>
                <td>宠物品种</td>
                <td>
                    <%=pet.getPetKind()%>
                </td>
            </tr>

            <tr>
                <td>雌雄</td>
                <td>
                    <%=pet.getPetSex()%>
                </td>
            </tr>

            <tr>
                <td>年龄</td>
                <td>
                    <%=pet.getPetAge()%>
                </td>
            </tr>

            <tr>
                <td>宠物产地</td>
                <td>
                    <%=pet.getPetAddress()%>
                </td>
            </tr>

            <tr>
                <td>宠物主人姓名</td>
                <td>
                    <%=pet.getMrPetName()%>
                </td>
            </tr>

            <tr>
                <td>宠物主人电话</td>
                <td>
                    <%=pet.getMrPetTel()%>
                </td>
            </tr>

            <tr>
                <td align="center">诊断时间</td>
                <td align="center">备注</td>
            </tr>

            <%
                ArrayList<PetSick> al2 = (ArrayList<PetSick>) session.getAttribute("al2");
                for (PetSick petSick : al2) {
            %>

            <tr>
                <td>
                    <%=petSick.getSickTime()%>
                </td>
                <td>
                    <%=petSick.getRemarks()%>
                </td>
            </tr>

            <%
                    }
                }
            %>
        </table>
    </form>
</center>

<form action="${pageContext.request.contextPath}/AddPetSickServlet" method="post">
    <table align="right" width="100" border="0">
        <tr>
            <td>宠物编号</td>
            <td>
                <label><input type="text" name="id" style="border:0;background:none;" value="<%=id%>" readonly></label>
            </td>
        </tr>
        <tr>
            <td>备注</td>
            <td>
                <label><textarea name="remarks" cols="20" rows="4"></textarea></label>
            </td>
        </tr>
        <tr align="center">
            <td align="center">
                <input name="petSickAdd" type="submit" value="添加病历">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
