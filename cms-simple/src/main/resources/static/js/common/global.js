var global = {
    "server" : {
        "apiGatewayServer" :  "https://discovery:10001",
        "baseServiceImageServer" :  global.server.apiGatewayServer + "/image",
        "ssoServer" : global.server.apiGatewayServer + "/sso",
        "crmServer" : global.server.apiGatewayServer + "/crm"
    },
    "api" : {
        "imageCode" : global.server.baseServiceImageServer + "/api/base/service/image/v1/code",
        "imageCodeKaptcha" : global.server.baseServiceImageServer + "/api/base/service/image/v1/kaptchaCode",
        "userReg" : global.server.crmServer + "/api/rest/crm/user/v1/reg"
    }
} ;