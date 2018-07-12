<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/6/3
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="weui/css/weui.min.css">
<link rel="stylesheet" href="weui/css/weui.css">
<link rel="stylesheet" href="weui/css/demos.css">
<html>
<head>
    <head>
        <title>jQuery WeUI</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

        <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.
">
    </head>
<body ontouchstart>


<header class='demos-header'>
    <h1 class="demos-title">绑定个人信息</h1>
</header>
<div class="weui-cells weui-cells_form">
    <div class="weui-cell">
        <div class="weui-cell__hd"><label class="weui-label">姓名</label></div>
        <div class="weui-cell__bd">
            <input class="weui-input" type="lastname" placeholder="请输入姓名">
        </div>
    </div>
    <div class="weui-cell weui-cell_vcode">
        <div class="weui-cell__hd">
            <label class="weui-label">手机号</label>
        </div>
        <div class="weui-cell__bd">
            <input class="weui-input" type="tel" placeholder="请输入手机号">
        </div>
        <div class="weui-cell__ft">
            <button class="weui-vcode-btn">获取验证码</button>
        </div>
    </div>
    <div class="weui-cell"></div>
    <div class="weui-btn-area">
        <a class="weui-btn weui-btn_primary" href="javascript:submit()" id="showTooltips">确定</a>
    </div>

    <script src="jquery/jquery-3.3.1.min.js"></script>
    <script src="weui/js/jquery-weui.js"></script>
</body>
</html>
<script type="text/javascript">
    function submit(){
        alert("111");
    }
</script>
