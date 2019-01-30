<%--
  Created by IntelliJ IDEA.
  User: 34432
  Date: 2019/1/30
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="/resources/js/form.js" type="text/javascript"></script>
<html>
<head>
    <title>秒杀页面</title>
</head>
<body>
<div align="center" style="margin-top: 100px" >
    <form action="/seckilling/excute" method="post" id="form">
        秒杀物品名称：${requestScope.seckill.name}<br>
        秒杀物品剩余量：${requestScope.seckill.number}<br>
        用户Id：<input id="id" name="id" type="text"><br>
        <input type="button" value="秒杀" class="btn btn-primary" onclick="check()">
    </form>
</div>
</body>
<%--<script type="text/javascript">--%>
    <%--function check(){--%>
        <%--var id = document.getElementById("id").value;--%>
        <%--if (id == "") {--%>
            <%--alert("请输入用户Id");--%>
            <%--return false;--%>
        <%--} else {--%>
            <%--document.getElementById("form").submit();--%>
            <%--return true;--%>
        <%--}--%>
    <%--}--%>
<%--</script>--%>
</html>
