var global = {
    server : {
        baseServiceImageServer :  "https://localhost:10001",
        ssoServer : "https://localhost:10001"
    },
    api : {
        imageCode : global.server.baseServiceImageServer + "/image/api/base/service/image/v1/code?token=ss",
        imageCodeKaptcha : global.server.baseServiceImageServer + "/image/api/base/service/image/v1/kaptchaCode?token=ss"
    }
} ;