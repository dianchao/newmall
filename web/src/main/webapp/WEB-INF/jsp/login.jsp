<%--
  Created by IntelliJ IDEA.
  User: zdc
  Date: 2018/10/16
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<!--网络中传输的编码-->
<%@page pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <!--浏览器编码-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/login.css">
    <style>

    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <div><a class="navbar-brand" href="index.html" style="font-size:32px;">尚意购-创意产品购物平台</a></div>
        </div>
    </div>
</nav>

<div class="container">
    <h1>${param.error}</h1>
    <form id="loginForm" method="post" action="user/dologin" class="form-signin" role="form">
        <h2 class="form-signin-heading"><i class="glyphicon glyphicon-cloud" style="color: green; font-size: larger"></i> 用户登录</h2>
        <div class="form-group has-success has-feedback">
            <input type="text" class="form-control" id="loginId" name="loginId" placeholder="请输入登录账号" autofocus>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
        </div>
        <div class="form-group has-success has-feedback">
            <input type="text" class="form-control" id="password" name="password" placeholder="请输入登录密码" style="margin-top:10px;">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        </div>
        <div class="form-group has-success has-feedback">
            <select class="form-control" >
                <option value="member">会员</option>
                <option value="user">管理</option>
            </select>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
            <br>
            <label>
                忘记密码
            </label>
            <label style="float:right">
                <a href="reg.html">我要注册</a>
            </label>
        </div>
        <a class="btn btn-lg btn-success btn-block" onclick="dologin()" > 登录</a>
    </form>
</div>
<script src="jquery/jquery-2.1.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script>
    function dologin() {
        /*
        var type = $(":selected").val();
        if ( type == "user" ) {
            window.location.href = "main.html";
        } else {
            window.location.href = "member.html";
        }
        */

        /**
         * 页面元素非空校验
         */
        var loginId = $("#loginId").val();
        if(loginId == ""){
            alert("输入的账户不能为空，请重新输入");
            return;
        }

        var password = $("#password").val();
        if(password == ""){
            alert("输入的密码不能为空，请重新输入");
            return;
        }

        //alert("执行提交");
        $("#loginForm").submit();
    }
</script>
</body>
</html>