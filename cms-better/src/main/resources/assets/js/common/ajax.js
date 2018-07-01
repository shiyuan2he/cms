var XmlHttp = {
    init : {
        XMLHttpRequestPool: [],
        methodType : {
            getType : function(){
                return "GET";
            },
            postType : function(){
                return "POST";
            },
            putType : function(){
                return "PUT";
            },
            deleteType : function(){
                return "DELETE";
            },
        }
    },
    getInstance: function(){
        for (var i=0;i<XmlHttp.init.XMLHttpRequestPool.length;i++){
            if(this.init.XMLHttpRequestPool[i].readyState == 0 || this.init.XMLHttpRequestPool[i].readyState == 4){
                return this.init.XMLHttpRequestPool[i];
            }
        }
        this.init.XMLHttpRequestPool[this.init.XMLHttpRequestPool.length] = this.createHttpRequest();
        return this.init.XMLHttpRequestPool[this.init.XMLHttpRequestPool.length-1];
    },
    /**
     * @description <p>
     *     send()：发送请求. 如果该请求是异步模式(默认),该方法会立刻返回. 相反,如果请求是同步模式,则直到请求的响应完全接受以后,该方法才会返回.
     *     void setRequestHeader(
            DOMString header, 将要被赋值的请求头名称.
            DOMString value 给指定的请求头赋的值.
            );
            openRequest()：初始化一个请求. 这个方法用于本地代码; 如果用JavaScript 代码来初始化请求, 使用 open()代替. 看文档open().
            void sendAsBinary( 发送二进制数据 的send()方法变种.
                in DOMString body 请求体的DOMstring。这个数据已由一系列单字节字符截取（移除每个字符的高位字节）转换成了字符串。
            );

            流程：
                1、调用open方法连接服务器url
                2、调用setRequestHeader方法为请求头设置合适的请求头
                3、制定回调函数
                4、调用send方法发送请求

     onreadystatechange：用于指定xmlHttpRequest对象状态改变时的事件处理函数
     readyState：用于获取XMLHttpRequest对象的处理状态
                    0：XMLHttpRequest对象还没有完成初始化
                    1：XMLHttpRequest对象开始发送请求
                    2：XMLHttpRequest对象的请求发送完成
                    3：XMLHttpRequest开始读取服务器响应
                    4：XMLHttpRequest读取服务器响应结束
     responseText：用于获取服务器的响应文本
     responseXml：获取服务器相应的xml文档对象
     status：服务器返回的状态码，只有当服务器的状态已经完成时，才会有该状态码
                    200：服务器正常响应
                    304：该资源在上次请求之后没有任何修改
                    400：无法找到请求的资源
                    401：访问资源的权限不够
                    403：没有权限访问资源
                    404：需要访问的资源不存在
                    405：需要访问的资源被禁止
                    407：需要访问的资源需要代理身份验证
                    414：请求的URL太长
                    500：服务器内部错误
     statusText：服务器返回的状态文本信息，只有当服务器的响应已经完成时，才会有该状态文本信息
     * </p>
     * @param
     * @return 
     * @author heshiyuan 
     * @date 2018/7/1 09:35
     */
    send: function(url, data, callback, methodType){
        var xmlHttpRequest = this.getInstance();
        with(xmlHttpRequest){
            try{
                if(url.indexOf("?") > 0){
                    url += "&randomNum=" + Math.random();
                }else{
                    url += "?randomNum=" + Math.random();
                }
                /**
                 * abort()：如果请求已经被发送,则立刻中止请求.
                 void open(
                 DOMString method, 请求所使用的HTTP方法; 如"GET", "POST", "PUT", "DELETE" 如果下个参数是非HTTP(S)的URL,则忽略该参数.
                 DOMString url,  该请求所要访问的URL
                 optional boolean async, 一个可选的布尔值参数，默认为true,意味着是否执行异步操作，
                 如果值为false,则send()方法不会返回任何东西，直到接受到了服务器的返回数据。
                 如果为值为true，一个对开发者透明的通知会发送到相关的事件监听者。
                 这个值必须是true,如果multipart 属性是true，否则将会出现一个意外。
                 optional DOMString user, 用户名,可选参数,为授权使用;默认参数为空string.
                 optional DOMString password 密码,可选参数,为授权使用;默认参数为空string.


                 在一个已经激活的request下（已经调用open()或者openRequest()方法的request）再次调用这个方法相当于调用了abort（）方法。
                 );
                 */
                // 第一步

                open(methodType, url, true);
                if(undefined != methodType && ajax.init.methodType.postType() != methodType){
                    send(null);
                }else {
                    send(param);
                    /**
                     * 设置请求头，发送post请求，需要改请求头 application/x-www-form-urlencoded保证对请求参数采用合适的格式发送
                     * 不同的请求需要设置不同的请求头
                     */
                    // 第二步
                    setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                }
                onreadystatechange = function(){
                    // xmlHttpRequest读取服务器响应完成
                    if(xmlHttpRequest.readyState == 4 && (xmlHttpRequest.status() == 200 || xmlHttpRequest.status() == 304)){
                        callback.call(null, xmlHttpRequest);
                    }
                };
            }catch(e){
                console.log(e);
            }
        }
    },
    /**
     * @description <p>
     *      API:https://developer.mozilla.org/zh-CN/docs/Web/API/XMLHttpRequest
     *      创建XMLHttpRequest对象，只有借助XMLHttpRequest对象
     *      ajax才能够发送ajax异步请求
     *      XMLHttpRequest是整个ajax中的灵魂
     *
     *      XMLHttpRequest 是一个 API，它为客户端提供了在客户端和服务器之间传输数据的功能。
     *      它提供了一个通过 URL 来获取数据的简单方式，并且不会使整个页面刷新。
     *      这使得网页只更新一部分页面而不会打扰到用户。XMLHttpRequest 在 AJAX 中被大量使用。
     *
     *      除了 HTTP ，它还支持 file 和 ftp 协议。
     * </p>
     * @return XMLHttpRequest对象
     * @author heshiyuan 
     * @date 2018/6/30 21:51
     */
    createHttpRequest: function() {
        var xmlHttpRequest = null;
        if (Window.XMLHttpRequest) {
            xmlHttpRequest = new XMLHttpRequest();
        } else if (window.ActiveXObject) {// ie浏览器
            // ie浏览器中个版本实现xmlhttp方式不同
            var msxmls = ["MSXML3.XMLHTTP","MSXML2.XMLHTTP.5.0", "MSXML2.XMLHTTP.4.0", "MSXML2.XMLHTTP.3.0", "MSXML2.XMLHTTP", "Microsoft.XMLHTTP"];
            for (var i=0;i<msxmls.length;i++){
                try {
                    xmlHttpRequest = new ActiveXObject(msxmls[i]);
                } catch (e) {
                    console.log(e)
                    alter("浏览器不支持的"+msxmls[i]+"控件");
                }
            }
        }
        // 火狐等浏览器没有readyState属性
        if (xmlHttpRequest.readyState = null){
            xmlHttpRequest.readyState = 0;
            xmlHttpRequest.addEventListener("load", function(){
                xmlHttpRequest.readyState = 4;
                if (typeof xmlHttpRequest.onreadystatechange() == "function"){
                    xmlHttpRequest.onreadystatechange();
                }
            },"false");

        }
        return xmlHttpRequest;
    }
};