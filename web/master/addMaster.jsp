<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset="UTF-8">
    <title>添加宠物主人信息</title>
</head>
<body bgcolor="#ff95ab">
<center>
    <br>
    <br>
    <br>
    <h3>添加宠物主人信息</h3>
    <form action="${pageContext.request.contextPath}/AddMasterServlet" method="get">
        <table border="0" width="240">
            <tr>
                <td>ID:</td>
                <td><input type="text" name="mrId"></td>
            </tr>

            <tr>
                <td>姓名:</td>
                <td><input type="text" name="mrName"></td>
            </tr>

            <tr>
                <td>性别:</td>
                <td><input type="text" name="mrSex"></td>
            </tr>

            <tr>
                <td>年龄:</td>
                <td><input type="text" name="mrAge"></td>
            </tr>

            <tr>
                <td>家庭住址:</td>
                <td><input type="text" name="mrAddress"></td>
            </tr>

            <tr>
                <td>电话号码:</td>
                <td><input type="text" name="mrTel"></td>
            </tr>

            <tr>
                <td>宠物种类:</td>
                <td><input type="text" name="mrPet"></td>
            </tr>

            <tr align="center">
                <td colspan="2">
                    <input name="sure" type="submit" value="添加"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="clear" type="reset" value="清空"/>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
