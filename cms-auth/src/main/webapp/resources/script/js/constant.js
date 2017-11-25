var constant = {
    ssoServerAndPort : function(){
        return "http://localhost:9001/sso-server-better" ;
    },
    // 登陆
    ssoInterfaceLogin : function(){
        return constant.ssoServerAndPort() + "/api/sso/login/v1.0/login" ;
    },
    // 退出
    ssoInterfaceLogout : function(){
        return constant.ssoServerAndPort() + "/api/sso/login/v1.0/logout" ;
    },
    // 注册
    ssoInterfaceReg : function(){
        return constant.ssoServerAndPort() + "/api/sso/login/v1.0/reg" ;
    },
    // kaptcha验证码
    ssoInterfaceKaptchaCode : function(){
        return constant.ssoServerAndPort() + "/api/sso/image/v1.0/kaptchaCode" ;
    },
    // 验证码
    ssoInterfaceCode : function(){
        return constant.ssoServerAndPort() + "/api/sso/image/v1.0/code" ;
    },
    // 获取树形权限接口地址
    ssoInterfacePermissionsList : function(){
        return constant.ssoServerAndPort() + '/api/sso/auth/v1.0/permissions/list';
    },
    ssoInterfaceGetAllUsers : function(){
        return constant.ssoServerAndPort() + '/api/sso/login/v1.0/user/list' ;
    }

}
