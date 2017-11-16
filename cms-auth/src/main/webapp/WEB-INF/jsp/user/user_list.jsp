<%@page contentType="text/html;charset=utf-8" language="java" %>
<%@page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="../common/tag.jsp" %>
<html>
<head>
    <%@include file="../common/common.jsp"%>
    <title>cms主页</title>

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
    <script type="text/javascript" src="<%=basePath%>/resources/script/js/main.js"></script>
</head>
<body>
<%@include file="../main/main_header.jsp"%>
<%@include file="../main/main_left.jsp"%>

<section class="Hui-article-box">
    <nav class="breadcrumb">
        <i class="Hui-iconfont">&#xe67f;</i> 首页
        <span class="c-gray en">&gt;</span> 用户管理
        <span class="c-gray en">&gt;</span> 用户列表
        <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" >
            <i class="Hui-iconfont">&#xe68f;</i>
        </a>
    </nav>
    <div class="Hui-article">
        <article class="cl pd-20">
            <div class="text-c"> 日期范围：
                <input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
                -
                <input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
                <input type="text" class="input-text" style="width:250px" placeholder="输入会员名称、电话、邮箱" id="" name="">
                <button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
            </div>
            <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a></span> <span class="r">共有数据：<strong>88</strong> 条</span> </div>
            <div class="mt-20">
                <table class="table table-border table-bordered table-hover table-bg table-sort">
                    <thead>
                    <tr class="text-c">
                        <th width="25"><input type="checkbox" name="" value=""></th>
                        <th width="80">ID</th>
                        <th width="100">用户编号</th>
                        <th width="90">用户名</th>
                        <th width="">手机</th>
                        <th width="130">加入时间</th>
                        <th width="70">状态</th>
                        <th width="100">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="text-c">
                        <td><input type="checkbox" value="1" name=""></td>
                        <td>1</td>
                        <td><u style="cursor:pointer" class="text-primary" onclick="member_show('张三','member-show.html','10001','360','400')">张三</u></td>
                        <td>13000000000</td>
                        <td class="text-l">北京市 海淀区</td>
                        <td>2014-6-11 11:11:42</td>
                        <td class="td-status"><span class="label label-success radius">已启用</span></td>
                        <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-add.html','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="change_password('修改密码','change-password.html','10001','600','270')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </article>
    </div>
</section>
<%@include file="../main/main_footer.jsp"%>
<script type="text/javascript">
    $(document).ready(function(){
        main.getMenu();
    });
</script>

</body>
</html>


