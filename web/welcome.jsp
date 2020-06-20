<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to PetHospital</title>
</head>


<frameset rows="15%,90%">
    <frame src="top.jsp" frameborder="0" noresize scrolling="no">

    <frameset cols="10%,*">
        <frame src="left.jsp" frameborder="0" noresize scrolling="no">
        <frame src="master/master.jsp" name="owner" frameborder="0" noresize scrolling="no">
    </frameset>
</frameset>

</html>
