<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>接收请求参数，提交参数给controller</p>

    <form action="receiveparam.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">
    </form>
    <br/>
    <form action="receiveparam2.do" method="post">
        姓名：<input type="text" name="rname"><br/>
        年龄：<input type="text" name="rage"><br/>
        <input type="submit" value="提交参数">
    </form>
    <br/>
    <form action="receiveobject.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">
    </form>

</body>
</html>
