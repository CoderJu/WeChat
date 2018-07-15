<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/7/14
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="weui/css/weui.min.css">
<link rel="stylesheet" href="weui/css/weui.css">
<link rel="stylesheet" href="weui/css/demos.css">
<!DOCTYPE html>
<html>
<head>
    <title>图书目录</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.
">
</head>

<body ontouchstart>

<header class='demos-header'>
    <h1 class="demos-title">图书目录</h1>
</header>

<div class="weui-grids">

    <c:forEach items="${categorys}" var="item" varStatus="status">
        <a href="" class="weui-grid js_grid">
            <div class="weui-grid__icon">
                <img src="${item.iconurl}" alt="">
            </div>
            <p class="weui-grid__label">
                    ${item.cname}
            </p>
        </a>
    </c:forEach>
</div>

<script src="jquery/jquery-3.3.1.min.js"></script>
<script src="weui/js/jquery-weui.js"></script>
<script>

</script>

</body>

</html>

