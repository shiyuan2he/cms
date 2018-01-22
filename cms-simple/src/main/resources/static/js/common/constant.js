var constant = {
    server : {
        apiGatewayServer : function(){
            return "https://discovery:10001";
        } ,
        baseServiceImageServer :  function(){
            return constant.server.apiGatewayServer() + "/image";
        },
        ssoServer : function(){
            return constant.server.apiGatewayServer() + "/sso";
        },
        crmServer : function(){
            return constant.server.apiGatewayServer() + "/crm";
        }
    },
    api : {
        imageCode : function(){
            return constant.server.baseServiceImageServer() + "/api/base/service/image/v1/code";
        },
        imageCodeKaptcha : function(){
            return constant.server.baseServiceImageServer() + "/api/base/service/image/v1/kaptchaCode";
        },
        userReg : function(){
            //return constant.server.crmServer() + "/api/rest/crm/user/v1/reg";
            return "http://localhost:10005/api/rest/crm/user/v1/reg";
        },
        userLogin : function(){
            return constant.server.ssoServer() + "/api/rest/sso/v1/login" ;
        }
    }
};