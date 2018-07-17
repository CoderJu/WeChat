<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/7/15
  Time: 21:59
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
    <style>
        .price_desc{
            color:red;
            font-size: 16px;
            text-align:right;
        }
    </style>
    <title>图书列表</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.
">
</head>

<body ontouchstart>

<header class='demos-header'>
    <h1 class="demos-title">图书列表</h1>
</header>
<div class="page__bd">
    <div class="weui-panel weui-panel_access">
        <div class="weui-panel__bd">
            <c:forEach items="${books}" var="item" varStatus="status">
                <a href="javascript:void(0);" class="weui-media-box weui-media-box_appmsg">
                    <div class="weui-media-box__hd">
                        <img class="weui-media-box__thumb" src="${item.imageurl}" alt="">
                    </div>
                    <div class="weui-media-box__bd">
                        <h4 class="weui-media-box__title">${item.bname}</h4>
                        <p class="weui-media-box__desc">${item.bdesc}</p>
                        <p class="weui-media-box__desc price_desc">${item.author}</p>
                    </div>
                </a>
            </c:forEach>
        </div>
    </div>
</div>
<script src="jquery/jquery-3.3.1.min.js"></script>
<script src="weui/js/jquery-weui.js"></script>
<script>

</script>

</body>

</html>

