<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/7/18
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>图书明细</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.
">
    <jsp:include page="/WEB-INF/views/common/head.jsp"></jsp:include>

</head>

<body ontouchstart>
    <div >
        <img src="${book.imageurl}" style="width: 100%;height: 100%"/>
    </div>
    <div class="weui-form-preview__bd">
        <div class="weui-form-preview__item">
            <label class="weui-form-preview__label">书名</label>
            <span class="weui-form-preview__value">${book.bname}</span>
        </div>
        <div class="weui-form-preview__item">
            <label class="weui-form-preview__label">作者</label>
            <span class="weui-form-preview__value">${book.author}</span>
        </div>
        <div class="weui-form-preview__item">
            <label class="weui-form-preview__label">简介</label>
            <span class="weui-form-preview__value" style="text-align: left">${book.bdesc}</span>
        </div>

    </div>
    <div class="weui-form-preview__ft">
        <a class="weui-form-preview__btn weui-form-preview__btn_default" href="/searchBookByCategory?cid=${book.cid}">返回目录</a>
        <button type="submit" class="weui-form-preview__btn weui-form-preview__btn_primary" href="javascript:">我要借阅</button>
    </div>
</div>
</body>

</html>


