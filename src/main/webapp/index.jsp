<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: chenyuan
  Date: 4/21/14
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
    ============= 结果 =============<br/>
    <s:iterator value="mapLists" id="column">
        <br/>key: <s:property value="key"/><br/>
        value: <s:iterator value="value" id="user">
            <s:property value="#user.userId"/> , <s:property value="#user.userName"/>
        </s:iterator>
        <br/>=== over ==
    </s:iterator>
</body>
</html>
