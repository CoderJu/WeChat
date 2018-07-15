<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/7/15
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" import="com.wechat.Util.JssdkUtil" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<link rel="stylesheet" href="weui/css/weui.min.css">
<link rel="stylesheet" href="weui/css/weui.css">
<link rel="stylesheet" href="weui/css/demos.css">
<script src="jquery/jquery-3.3.1.min.js"></script>
<script src="weui/js/jquery-weui.js"></script>
<script src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js"></script>
<%
    Map<String,Object> ret = new HashMap<String,Object>();
    ret= JssdkUtil.getWxConfig(request);
    request.setAttribute("appId", ret.get("appId"));
    request.setAttribute("timestamp", ret.get("timestamp"));
    request.setAttribute("nonceStr", ret.get("nonceStr"));
    request.setAttribute("signature", ret.get("signature"));
%>
<!DOCTYPE html>
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
<div class="weui-msg">
    <div class="weui-msg__icon-area"><i class="weui-icon-success weui-icon_msg"></i></div>
    <div class="weui-msg__text-area">
        <h2 class="weui-msg__title">注册成功</h2>
    </div>
    <div class="weui-msg__opr-area">
        <p class="weui-btn-area">
            <a href="javascript:showCategory();" class="weui-btn weui-btn_primary">图书目录</a>
            <a href="javascript:wx.closeWindow();;" class="weui-btn weui-btn_default">关闭窗口</a>
        </p>
    </div>
    <div class="weui-msg__extra-area">
        <div class="weui-footer">
            <p class="weui-footer__links">
                <a href="javascript:void(0);" class="weui-footer__link">底部链接文本</a>
            </p>
            <p class="weui-footer__text">Copyright © 2008-2016 CodeJu.cn</p>
        </div>
    </div>
</div>

</body>
</html>
<script type="text/javascript">
    function showCategory() {
        location.href="/showAllCategory";
    }
    function close() {
        window.close()
    }

    // 微信信息的以及调用的配置
    wx.config({
        debug: false,
        appId: '${appId}',
        timestamp: '${timestamp}',
        nonceStr: '${nonceStr}',
        signature: '${signature}',
        jsApiList: ['onMenuShareTimeline', 'onMenuShareAppMessage','onMenuShareQQ','onMenuShareWeibo','onMenuShareQZone']
    });
</script>
