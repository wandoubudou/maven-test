<%--
  Created by IntelliJ IDEA.
  User: Wadu
  Date: 2019/7/23
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
TEST
${user.name}
${user.id}

<form method="post" action="/user/upload" enctype="multipart/form-data">
    <input type="text" name="id">
    <input type="file" name="file">
    <input type="submit" value="Submit">
</form>
</body>
</html>
