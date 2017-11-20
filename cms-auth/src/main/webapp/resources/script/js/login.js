var login = {
    getData : function(json){
        console.log("回调函数返回值：",json) ;
        if(json.success){
            window.location.href = '/cms/view/toMainView' ;
        }else{
            if(json.code == 'SSO9999'){
                login.changeImageCode();
            }else{
                window.location.href = '/cms/view/toMainView' ;
            }
        }
    },
    doLogin : function(){
        console.log("login") ;
        var url = constant.ssoInterfaceLogin() + "?mobile="+$('#mobile').val()+"&password="+$('#password').val()+"&codeImage="+$("#codeImage").val();
        ajax.getJsonp(url,"login.getData") ;
    },
    logout : function(){
        console.log("logout") ;
        ajax.getJsonp(constant.ssoInterfaceLogout(),login.getData()) ;
    },
    changeImageCode : function () {
        console.log("changeImageCode");
        $("#codeImg").attr("src",constant.ssoInterfaceKaptchaCode());
        //$("#codeImg")[0].src = constant.ssoInterfaceKaptchaCode();
    }
}
