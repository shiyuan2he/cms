<%@page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="../common/tag.jsp" %>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
    <%@include file="../common/common.jsp"%>
    <title>添加用户</title>
</head>
<body>
    <!--请在下方写此页面业务相关的脚本-->
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/My97DatePicker/4.8/WdatePicker.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/jquery.validation/1.14.0/jquery.validate.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/jquery.validation/1.14.0/validate-methods.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/java-resource/plugins/jquery.validation/1.14.0/messages_zh.js"></script>
    <%@include file="user_add_content.jsp"%>
    <script type="text/javascript">
    $(function(){
        $('.skin-minimal input').iCheck({
            checkboxClass: 'icheckbox-blue',
            radioClass: 'iradio-blue',
            increaseArea: '20%'
        });

        $("#form-member-add").validate({
            rules:{
                username:{
                    required:true,
                    minlength:2,
                    maxlength:16
                },
                sex:{
                    required:true,
                },
                mobile:{
                    required:true,
                    isMobile:true,
                },
                email:{
                    required:true,
                    email:true,
                },
                uploadfile:{
                    required:true,
                },

            },
            onkeyup:false,
            focusCleanup:true,
            success:"valid",
            submitHandler:function(form){
                $(form).ajaxSubmit();
                var index = parent.layer.getFrameIndex(window.name);
                parent.$('.btn-refresh').click();
                parent.layer.close(index);
            }
        });
    });
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>