<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>处理器方法返回string，用来表示视图</p>

    <form action="returnstring.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">
    </form>
    <br/>
    <button id="btn">发起ajax请求</button>

</body>
</html>
