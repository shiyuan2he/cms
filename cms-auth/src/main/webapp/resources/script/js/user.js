var user = {
    // 获取树形权限
    requestUrl_userList : constant.ssoInterfaceGetAllUsers() ,
    /**
     * @description <p>获取用户列表</p>
     * @author heshiyuan
     * @date 2017/11/15 20:05
     */
    getUserList : function () {
        ajax.getJsonp(user.requestUrl_userList,"user.callbackFunction") ;
    },
    callbackFunction: function (json) {
        console.log("回调函数返回值：", json);
        if (json.success) {
            var myTemplate = Handlebars.compile($("#user-list-template").html());
            $('#userList').html(myTemplate(json.data));
        }
    },
    addUser : function(title,url,w,h){
        layer_show(title,url,w,h);
    },
    stopUser : function(obj,id){
        layer.confirm('确认要停用吗？',function(index){
            $(obj).parents("tr").find(".td-manage")
                .prepend('<a style="text-decoration:none" onClick="user.startUser(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
            $(obj).remove();
            layer.msg('已停用!',{icon: 5,time:1000});
        });
    },
    startUser : function(obj,id){
        layer.confirm('确认要启用吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="user.stopUser(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
            $(obj).remove();
            layer.msg('已启用!',{icon: 6,time:1000});
        });
    },
    editUser : function(title,url,w,h){
        layer_show(title,url,w,h);
    },
    showUser : function(title,url,w,h){
        layer_show(title,url,w,h);
    },
    changePassword : function(title,url,w,h){
        layer_show(title,url,w,h);
    },
    delUser : function(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            $(obj).parents("tr").remove();
            layer.msg('已删除!',{icon:1,time:2000});
        });
    },
    init : function(){
        /*$('.table-sort').dataTable({
            "aaSorting": [[ 1, "desc" ]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
            ]
        });
        $('.table-sort tbody').on( 'click', 'tr', function () {
            if ( $(this).hasClass('selected') ) {
                $(this).removeClass('selected');
            }
            else {
                table.$('tr.selected').removeClass('selected');
                $(this).addClass('selected');
            }
        });*/
        user.getUserList();
    }
}
