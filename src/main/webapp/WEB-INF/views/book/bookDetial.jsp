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
    <title>图书详情</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.
">
    <jsp:include page="/WEB-INF/views/common/head.jsp"></jsp:include>

    <style>
        .black_overlay{
            display: none;
            position: fixed;
            top: 0%;
            left: 0%;
            width: 100%;
            height: 100%;
            background-color: black;
            z-index:1001;
            -moz-opacity: 0.6;
            opacity:.60;
            filter: alpha(opacity=60);
        }
        .white_content {
            display: none;
            position: fixed;
            top: 5%;
            left: 5%;
            width: 90%;
            height: 90%;
            background-color: white;
            z-index:1002;
            overflow: auto;

        }
    </style>
</head>

<body ontouchstart>
    <div >
        <img src="${book.imageurl}" style="width: 100%;height: 100%"/>
    </div>
    <div class="weui-cells">
        <div class="weui-cell">
            <label class="weui-form-preview__label">书名</label>
            <span class="weui-form-preview__value">${book.bname}</span>
        </div>
        <div class="weui-cell">
            <label class="weui-form-preview__label">作者</label>
            <span class="weui-form-preview__value">${book.author}</span>
        </div>
        <div class="weui-cell">
            <label class="weui-form-preview__label">数量</label>
            <span class="weui-form-preview__value" >${book.number}</span>
        </div>
        <div class="weui-cell">
            <label class="weui-form-preview__label">简介</label>
            <span class="weui-form-preview__value" style="text-align: left">${book.bdesc}</span>
        </div>
    </div>
    <div class="weui-form-preview__ft">
        <a class="weui-form-preview__btn weui-form-preview__btn_default" href="/searchBookByCategory?cid=${book.category.cid}">返回目录</a>
        <c:if test="${book.number ==0 }">
        <a class="weui-form-preview__btn  weui-form-preview__btn_default" id="forbidBorrow">我要借阅</a>
        </c:if>
        <c:if test="${book.number > 0 }">
        <button type="submit"  id="borrow" class="weui-form-preview__btn weui-form-preview__btn_primary" href="javascript:one();">我要借阅</button>
        </c:if>
    </div>
</div>
    
    <div id="light" class="white_content">
        <jsp:include page="/borrow?bid=${book.bid}&openid=${sessionScope.user.openid}"></jsp:include>
    </div>
    <div id="fade" class="black_overlay">
    </div>
</body>
<script>
    $(function() {
        FastClick.attach(document.body);
    });
</script>
<script >
    jQuery(document).on("click", "#forbidBorrow", function(){
        jQuery.toast("该图书已经全部借出！","forbidden");
            setTimeout(function() {
                jQuery.hideLoading();
            }, 3000)
        });

    jQuery(document).on("click", "#borrow", function(){
        document.getElementById('light').style.display='block';
        document.getElementById('fade').style.display='block'
      //  jQuery("#light").addClass("weui-mask weui-mask--visible")
    });

    function hide(){
        document.getElementById('light').style.display='none';
        document.getElementById('fade').style.display='none';
        window.location.href="/searchBookByBid?bid=${book.bid}"
    }


</script>
</html>


