var global = {
    server : {
        baseServiceImageServer :  "localhost:10001",
        ssoServer : "localhost:10002"
    },
    api : {
        imageCode : global.server.baseServiceImageServer + "/api/base/service/image/v1/code",
        imageCodeKaptcha : global.server.baseServiceImageServer + "/api/base/service/image/v1/kaptchaCode"
    }
} ;