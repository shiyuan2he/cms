<%@page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="../common/tag.jsp"%>
<html>
<head>
    <%@include file="../common/common.jsp"%>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/lib/html5.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/lib/respond.min.js"></script>
    <![endif]-->
    <link href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>登陆</title>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" method="post">
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-xs-8">
                    <input id="mobile" name="mobile" type="text" placeholder="请输入手机号" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <input id="password" name="password" type="password" placeholder="请输入密码" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input id="codeImage" class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
                    <img src="http://192.168.1.4:9001/api/sso/image/v1.0/kaptchaCode">
                    <a href="javascript:login.changeImageCode();">看不清，换一张</a>
                </div>
            </div>
            <%--<div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <label for="online">
                        <input type="checkbox" name="online" id="online" value="">
                        使我保持登录状态</label>
                </div>
            </div>--%>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input name="" type="button" onclick="javascript:login.doLogin();" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                </div>
            </div>
        </form>
    </div>
</div>
    <div class="footer">Copyright shiyuan2he by H-ui.admin.page.v3.0</div>

    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui/js/H-ui.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/script/js/ajax.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/script/js/constant.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/script/js/login.js"></script>
    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
</body>
</html>
