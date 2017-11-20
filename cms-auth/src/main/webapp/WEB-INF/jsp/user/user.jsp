<%@page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="../common/tag.jsp" %>
<html>
<head>
    <%@include file="../common/common.jsp"%>
    <title>用户列表</title>

    <link rel="Bookmark" href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/images/favicon.ico" >
    <link rel="Shortcut Icon" href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/images/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/lib/html5.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/lib/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" type="text/css" href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui.admin/css/style.css" />
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <%--<script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/jquery/1.9.1/jquery.min.js"></script>--%>
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/layer/2.4/layer.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui/js/H-ui.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/H-ui.admin.page/static/h-ui.admin/js/H-ui.admin.page.js"></script>
    <script src="https://cdn.bootcss.com/handlebars.js/4.0.11/handlebars.min.js"></script>

    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/script/js/ajax.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/script/js/constant.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/script/js/main.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/script/js/user.js"></script>
    
</head>
<body>
<%@include file="../main/main_header.jsp"%>
<%@include file="../main/main_left.jsp"%>
<%@include file="user_list.jsp"%>
<%@include file="../main/main_footer.jsp"%>
<script type="text/javascript">
    $(document).ready(function(){
        main.getMenu();
        //user.init() ;
        user.getUserList();
    });
</script>

</body>
</html>


