var user = {
    // 获取树形权限
    requestUrl_userList : constant.ssoInterfaceGetAllUsers() ,
    /**
     * @description <p>获取用户列表</p>
     * @author heshiyuan
     * @date 2017/11/15 20:05
     */
    getUserList : function () {
        ajax.getJsonp(main.requestUrl_userList,"user.callbackFunction") ;
    },
    callbackFunction: function (json) {
        console.log("回调函数返回值：", json);
        if (json.success) {
            var myTemplate = Handlebars.compile($("#menu-template").html());
            $('#menuList').html(myTemplate(json.data));
        }
    },
    init : function(){
        $('.table-sort').dataTable({
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
        });
    }
}
