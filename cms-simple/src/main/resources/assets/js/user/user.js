var user = {

    init : function(){
        user.getImageCode() ;
    },
    /**
     * @description <p>获取图形验证码</p>
     * @author heshiyuan
     * @date 2018/1/3 8:50
     */
    getImageCode : function(){
        $("#verifyCode").attr("src",constant.api.imageCodeKaptcha) ;
    },
    doReg : function(){
        var url = constant.api.userReg() ;
        var userName = $("#userName").val() ;
        var password = $("#password").val() ;
        var imageCode = $("#imageCode").val() ;
        user.verifyParam(userName,password,imageCode) ;
        var param = "?userName="+userName+
            "&password="+password+
            "&imageCode="+imageCode+
            "&token="+Math.ceil(Math.random() * 10000)
        ;
        ajax.postJson(url+param,user.doRegCallback)
        //ajax.postJsonp(url+param,"user.doLoginCallback") ;
    },
    doLogin : function(){
        var url = constant.api.userReg() ;
        var userName = $("#userName").val() ;
        var password = $("#password").val() ;
        var imageCode = $("#imageCode").val() ;
        user.verifyParam(userName,password,imageCode) ;
        var param = "?userName="+userName+
            "&password="+password+
            "&imageCode="+imageCode+
            "&token="+Math.ceil(Math.random() * 10000)
        ;
        ajax.getJson(url+param,user.doLoginCallback)
    },
    doRegCallback : function(json){
        console.log(json);
        if(json.success){
            console.log("reg success");
            window.location.href = "/dashboard" ;
        }else{
            console.log("reg failed");
            console.log(json.msg);
        }
    },
    doLoginCallback : function(json){
        console.log(json);
        if(json.success){
            console.log("login success");
            window.location.href = "/dashboard" ;
        }else{
            console.log("login failed");
            console.log(json.msg);
        }
    },
    verifyParam : function(){
        return true ;
    }

};