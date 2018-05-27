<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
<link href="bootstrap/css/bootstrap.min.css"  rel="stylesheet" type="text/css">
<script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>


<html>
<body>
<h2>Hello World!</h2>
<button class="btn btn-lg btn-danger"
        type="button"
        data-toggle="popover"
        title="弹出框"
        data-content="插件"
        data-placement="bottom"
>点击</button>

<button type="button" class="btn btn-warning" title="Popover title"
        data-container="body" data-toggle="popover" data-placement="right"
        data-content="右侧的 Popover 中的一些内容">
    右侧的 Popover
</button>
</body>
<script>
    $(function () {
        $("[data-toggle='popover']").popover();
    })

</script>
</html>
