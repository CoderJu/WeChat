<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/7/15
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <jsp:include page="/WEB-INF/views/common/head.jsp"></jsp:include>

</head>

<body ontouchstart>
<div class="page__bd">
    <div class="weui-search-bar" id="searchBar">
        <form class="weui-search-bar__form" action="/searchBookByName">
            <div class="weui-search-bar__box">
                <i class="weui-icon-search"></i>
                <input type="hidden" name="cid" id="cid" value="${cid}"/>
                <input type="search" class="weui-search-bar__input" id="searchInput" name="searchInput" placeholder="搜索" required="">
                <a href="javascript:" class="weui-icon-clear" id="searchClear"></a>
            </div>
            <label class="weui-search-bar__label" id="searchText" style="transform-origin: 0px 0px 0px; opacity: 1; transform: scale(1, 1);">
                <i class="weui-icon-search"></i>
                <span>搜索</span>
            </label>
        </form>
        <a href="javascript:" class="weui-search-bar__cancel-btn" id="searchCancel">取消</a>
    </div>
    <div class="weui-panel weui-panel_access">
        <div class="weui-panel__bd">
            <c:forEach items="${books}" var="item" varStatus="status">
                <a href="/searchBookByBid?bid=${item.bid}" class="weui-media-box weui-media-box_appmsg">
                    <div class="weui-media-box__hd">
                        <img class="weui-media-box__thumb" src="${item.imageurl}" alt="">
                    </div>
                    <div class="weui-media-box__bd">
                        <h4 class="weui-media-box__title">${item.bname}</h4>
                        <p class="weui-media-box__desc">${item.bdesc}</p>
                        <p class="weui-media-box__desc price_desc" style="color: red">${item.author}</p>
                    </div>
                </a>
            </c:forEach>
        </div>
    </div>
</div>

</body>

</html>

