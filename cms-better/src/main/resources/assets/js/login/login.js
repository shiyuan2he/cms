var login={

    init : function(){
        login.getImageCode() ;
    },
    /**
     * @description <p>获取图形验证码</p>
     * @author heshiyuan
     * @date 2018/1/3 8:50
     */
    getImageCode : function(){
        $("#imageCode").attr("src",global.api.imageCodeKaptcha) ;
    },
    doLogin : function(){
        var mobile = $("#mobile").val() ;
        var password = $("#password").val() ;
        var param = {

        } ;
        ajax.getJsonp();
    }
};