<%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/11/24
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>hello</h1>
    <form action="user" method="post">
        <input type="text" name="name">
        <input type="number" name="age">
        <input type="date" name="birthDay">
        <input type="submit" value="提交">

    </form>
    <form action="file" enctype="multipart/form-data" method="post">
        <input type="file" name="file">
        <input type="submit">
    </form>
</body>
</html>
