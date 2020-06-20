<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>左边</title>

    <style type="text/css">
        body {
            width: 100%;
            height: 100%;
            font-family: "Open Sans", sans-serif;
            background-color: white;
        }

        .main {
            left: 50%;

        }

        .main h1 {
            color: #ffc975;
            text-shadow: 0 0 3px rgba(0, 0, 0, 0.10);
            letter-spacing: 1px;
            text-align: center;
        }

        .h2 {
            color: #8effbf;
            text-shadow: 0 0 3px rgba(0, 0, 0, 0.10);
            letter-spacing: 1px;
            text-align: center;
        }
        .h2 a {
            color: #8effbf;
            text-shadow: 0 0 3px rgba(0, 0, 0, 0.10);
            letter-spacing: 1px;
            text-align: center;
        }


    </style>

</head>
<body bgcolor="#a52a2a">
<div class="main">
    <h1 class="h1">导航栏</h1>
</div>

<div>
    <table align="center">
        <h2 class="h2">宠物主人信息</h2>
        <tr>
            <td><a href="master/selectSearchMaster.jsp" target="owner">查看主人信息</a></td>
        </tr>

        <tr>
            <td><a href="master/selectUpdateMaster.jsp" target="owner">修改主人信息</a></td>
        </tr>

        <tr>
            <td><a href="master/addMaster.jsp" target="owner">添加主人信息</a></td>
        </tr>

        <tr>
            <td><a href="master/delMaster.jsp" target="owner">删除主人信息</a></td>
        </tr>

    </table>
</div>

<div>
    <table align="center">
        <h2 class="h2">医生信息</h2>
        <tr>
            <td><a href="doctor/selectSearchDoctor.jsp" target="owner">查看医生信息</a></td>
        </tr>

        <tr>
            <td><a href="doctor/selectUpdateDoctor.jsp" target="owner">修改医生信息</a></td>
        </tr>

        <tr>
            <td><a href="doctor/addDoctor.jsp" target="owner">添加医生信息</a></td>
        </tr>

        <tr>
            <td><a href="doctor/delDoctor.jsp" target="owner">删除医生信息</a></td>
        </tr>

    </table>
</div>

<div>
    <table align="center">
        <h2 class="h2">宠物信息</h2>
        <tr>
            <td><a href="pet/selectSearchPet.jsp" target="owner">查看宠物信息</a></td>
        </tr>

        <tr>
            <td><a href="pet/selectUpdatePet.jsp" target="owner">修改宠物信息</a></td>
        </tr>

        <tr>
            <td><a href="pet/addPet.jsp" target="owner">添加宠物信息</a></td>
        </tr>

        <tr>
            <td><a href="pet/delPet.jsp" target="owner">删除宠物信息</a></td>
        </tr>

    </table>
</div>

<div>
    <table align="center">
        <h2 class="h2"><a href="logout.jsp"target="_parent" >登出</a></h2>

    </table>
</div>

</body>
</html>
