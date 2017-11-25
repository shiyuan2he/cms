var main = {
    // 获取树形权限
    requestUrl_menu : constant.ssoInterfacePermissionsList(),
    getMainContent : function(viewUrl){
        //ajax.getJson("http://localhost:9003/view/"+viewUrl,"main.fillContent") ;

        $.ajax({
            type : "GET",
            dataType : "json",
            url : "http://localhost:9003/view/"+viewUrl,
            success:function(htmlElement){
                console.log(htmlElement);
            },
            error:function(XMLHttpRequest, textStatus, errorThrown) {
                console.log(XMLHttpRequest.status);
                console.log(XMLHttpRequest.readyState);
                console.log(textStatus);
            }
        });
    },
    fillContent : function(htmlElement) {
        $("#content").html(htmlElement);
    },
    /**
     * @description <p>获取菜单</p>
     * @author heshiyuan
     * @date 2017/11/15 20:05
     */
    getMenu : function() {
        ajax.getJsonp(main.requestUrl_menu,"main.callbackFunction") ;
    },
    callbackFunction: function(json) {
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
