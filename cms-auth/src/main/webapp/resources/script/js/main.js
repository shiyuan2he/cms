var main = {
    // 获取树形权限
    requestUrl_menu : constant.ssoInterfacePermissionsList(),
    /**
     * @description <p>获取菜单</p>
     * @author heshiyuan
     * @date 2017/11/15 20:05
     */
    getMenu : function () {
        ajax.getJsonp(main.requestUrl_menu,"main.callbackFunction") ;
    },
    callbackFunction: function (json) {
        console.log("回调函数返回值：", json);
        if (json.success) {
            var myTemplate = Handlebars.compile($("#menu-template").html());
            $('#menuList').html(myTemplate(json.data));
        }
    },
    /**
     * @description <p>左侧菜单树隐藏显示</p>
     * @author heshiyuan
     * @date 2017/11/16 13:13
     */
    displayOrNot : function(obj){
        if($(obj).next()[0].style.display != "block"){
            $(obj).next()[0].style.display = "block" ;
        }else{
            $(obj).next()[0].style.display = "none" ;
        }
    }
}
