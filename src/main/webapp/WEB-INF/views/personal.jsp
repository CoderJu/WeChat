<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/6/3
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="weui/css/weui.min.css">
<link rel="stylesheet" href="weui/css/weui.css">
<link rel="stylesheet" href="weui/css/demos.css">
<html>
<head>
    <head>
        <title>个人信息绑定</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

        <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.
">
    </head>
<body ontouchstart>
<header class='demos-header'>
    <h1 class="demos-title">个人信息</h1>
</header>
<form action="/updatePersonalInfo" id="userinfo" method="post">
<input  id="openid" name="openid"  type="hidden" value="<c:out value="${snsUserInfo.openid}"/>">
<div class="weui-cells weui-cells_form">
    <div class="weui-cell">
        <div class="weui-cell__hd"><label class="weui-label">姓名</label></div>
        <div class="weui-cell__bd">
            <input class="weui-input" id="lastname" name="lastname" type="lastname" placeholder="请输入姓名">
        </div>
    </div>
    <div class="weui-cell ">
        <div class="weui-cell__hd">
            <label class="weui-label">手机号</label>
        </div>
        <div class="weui-cell__bd">
            <input class="weui-input" type="tel" id="tel" name="tel" placeholder="请输入手机号">
        </div>
    </div>
    <div class="weui-cell"></div>
    <br/>
    <br/>
    <div class="weui-btn-area">
        <a class="weui-btn weui-btn_primary" href="javascript:submit()" id="showTooltips">确定</a>
    </div>
</div>
</form>
    <script src="jquery/jquery-3.3.1.min.js"></script>
    <script src="weui/js/jquery-weui.js"></script>
</body>
    <script type="text/javascript">
    function submit(){
    $("#userinfo").submit();
    }
    </script>
</html>
