<%--
  Created by IntelliJ IDEA.
  User: chenyuan
  Date: 5/14/14
  Time: 7:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>OGNL Test</title>
    <jsp:include page="/templates/common/inc/header_default.jsp"></jsp:include>
</head>
<body>
    <form action="/transfer/param.do" method="post">
        <input type="text" name="userList[0].userId" value="1111"/>
        <input type="text" name="userList[0].userName" value="1111"/>
        <input type="text" name="userList[0].age" value="1"/>
        <input type="text" name="userList[0].address" value="1111"/>
        <br/>

        <input type="text" name="userList[1].userId" value="2222"/>
        <input type="text" name="userList[1].userName" value="2222"/>
        <input type="text" name="userList[1].age" value="2"/>
        <input type="text" name="userList[1].address" value="2222"/>
        <br/>

        <input type="submit" value="SUBMIT"/>
    </form>
</body>
</html>
