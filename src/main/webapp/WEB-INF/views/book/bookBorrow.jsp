<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/7/19
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书借阅</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.
">
    <jsp:include page="/WEB-INF/views/common/head.jsp"></jsp:include>

</head>

<body ontouchstart>
<header class='demos-header'>
    <h1 class="demos-title">图书借阅</h1>
</header>
<div class="bd">
    <div class="page__bd">
        <div class="weui-cells">
            <div class="weui-cell">
                <label class="weui-cell">书名:</label>
                <span class="weui-form-preview__value">${book.bname}</span>
            </div>
            <div class="weui-cell">
                <label class="weui-cell">作者:</label>
                <span class="weui-form-preview__value">${book.author}</span>
            </div>
            <div class="weui-cell">
                 <div class="weui-cell">借用数量：</div>
                 &nbsp;&nbsp;
                <div class="weui-cell__ft">
                    <div class="weui-count">
                        <a class="weui-count__btn weui-count__decrease"></a>
                        <input class="weui-count__number" type="number" id="borrownum" name="borrownum" value="1" />
                        <a class="weui-count__btn weui-count__increase"></a>
                    </div>
                </div>
            </div>
            </div>
        </div>

    <div class='demos-content-padded'>
    <a href="javascript:;" id="confirm" class="weui-btn weui-btn_primary">确认</a>
    <a href="javascript:hide();" class="weui-btn weui-btn_default">取消</a>
    </div>
     
    </div>
</div>

<script>
    $(function() {
        FastClick.attach(document.body);
    });
</script>

<script>
    var MAX = ${book.number}, MIN = 1;
    $('.weui-count__decrease').click(function (e) {
        var $input = $(e.currentTarget).parent().find('.weui-count__number');
        var number = parseInt($input.val() || "0") - 1
        if (number < MIN) number = MIN;
        $input.val(number)
    })
    $('.weui-count__increase').click(function (e) {
        var $input = $(e.currentTarget).parent().find('.weui-count__number');
        var number = parseInt($input.val() || "0") + 1
        if (number > MAX) number = MAX;
        $input.val(number)
    })

    $('.delete-swipeout').click(function () {
        $(this).parents('.weui-cell').remove()
    })
    $('.close-swipeout').click(function () {
        $(this).parents('.weui-cell').swipeout('close')
    })


</script>
</body>
</html>