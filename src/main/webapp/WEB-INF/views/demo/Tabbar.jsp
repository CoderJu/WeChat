<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/6/3
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/head.jsp"%>
<html>
<head>
    <title>jQuery WeUI</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.
">
</head>
<body ontouchstart>

<div class="weui-tab">
    <div class="weui-tab__bd">
        <div id="tab1" class="weui-tab__bd-item weui-tab__bd-item--active">
            <jsp:include page="/showAllCategory"></jsp:include>
        </div>
        <div id="tab2" class="weui-tab__bd-item">
            <h1>页面二</h1>
        </div>
        <div id="tab3" class="weui-tab__bd-item">
            <h1>页面三</h1>
        </div>
        <div id="tab4" class="weui-tab__bd-item">
            <h1>页面四</h1>
        </div>
    </div>

    <div class="weui-tabbar">
        <a href="#tab1" class="weui-tabbar__item weui-bar__item--on">
            <div class="weui-tabbar__icon">
                <img src="icon/book/icon_nav_category.png" alt="">
            </div>
            <p class="weui-tabbar__label">图书馆</p>
        </a>
        <a href="#tab2" class="weui-tabbar__item">
            <div class="weui-tabbar__icon">
                <img src="icon/book/icon_nav_borrow.png" alt="">
            </div>
            <p class="weui-tabbar__label">我要借书</p>
        </a>
        <a href="#tab3" class="weui-tabbar__item">
            <div class="weui-tabbar__icon">
                <img src="icon/book/icon_nav_return.png" alt="">
            </div>
            <p class="weui-tabbar__label">我要归还</p>
        </a>
    </div>
</div>
</body>
</html>
<script type="text/javascript">

</script>