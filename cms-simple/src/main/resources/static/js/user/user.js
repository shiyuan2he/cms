var user = {

    "init" : function(){
        user.getImageCode() ;
    },
    /**
     * @description <p>获取图形验证码</p>
     * @author heshiyuan
     * @date 2018/1/3 8:50
     */
    "getImageCode" : function(){
        $("#imageCode").attr("src",global.api.imageCodeKaptcha) ;
    }
};