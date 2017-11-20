<%@page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="../common/tag.jsp" %>
<html>
<head>
    <title>用户列表</title>
    <%@include file="../common/common.jsp"%>
    <script src="https://cdn.bootcss.com/handlebars.js/4.0.11/handlebars.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/datatables/1.10.0/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/My97DatePicker/4.8/WdatePicker.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/laypage/1.2/laypage.js"></script>

    <script type="text/javascript" src="<%=basePath%>/resources/script/js/user.js"></script>
</head>
<body>
<%@include file="../main/main_header.jsp"%>
<%@include file="../main/main_left.jsp"%>
<%@include file="user_list_content.jsp"%>
<%@include file="../main/main_footer.jsp"%>
<script type="text/javascript">
    $(document).ready(function(){
        user.init() ;
        main.getMenu();
    });
</script>

</body>
</html>


