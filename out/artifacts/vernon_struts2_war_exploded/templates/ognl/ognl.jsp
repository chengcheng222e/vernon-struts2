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
    <a href="javascript:;" name="edit" onclick="editTest()">点击提交数据</a>
    <script type="text/javascript">
        function editTest() {
            var url = "/ognl/edit.do";
            var postData = {
                'user.userId': 11201,
                'user.userName': '陈袁',
                'user.age': 24,
                'user.address': '深圳市南山区高新科技园南区德赛大厦1101'
            };
            $.post(url, postData);
        }
    </script>
</body>
</html>
