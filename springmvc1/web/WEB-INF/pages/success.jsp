<%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/11/14
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/save" method="post">
    姓名: <input type="text" name="username" value="">
    年龄: <input type="text" name="age" value="">
    生日: <input type="date" name="birthday" value="">
    爱好: <input type="checkbox" name="hobby" value="篮球">
    <input type="checkbox" name="hobby" value="足球">
    <input type="checkbox" name="hobby" value="炉石传说">
    <input type="submit" value="提交">
</form>
<script src="js/jquery-1.12.4.js"></script>
<script>
    $(function () {
        var $a = $("input:submit");
        $a.click(function (event) {
            var data = $("form").serialize();
            $.ajax({
                type: 'post',
                url: "save",
                cache: false,
                data: data,
                dataType: 'json',
                success: function (data) {
                    alert('success');
                },
                error: function () {
                    alert("请求失败")
                }
            })
            event.preventDefault();
            return false;
        });
    })
</script>
<script>
    var user = {
        "username": "ym",
        "age": 3,
        "birthday": "2019-11-14",
        "hobby": ["篮球", "足球"]
    };
    $.ajax({
        url: "user",
        type: "post",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(user),
        success: function (data) {
            alert(data)
        }
    })
</script>
</body>
</html>
