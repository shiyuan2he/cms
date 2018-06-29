/**
 * @description <p></p>
 * @param
 * @return 
 * @author heshiyuan
 * @date 2018/6/29 11:26
 */
function articleSaveSubmit() {
    debugger
    var bigTitle = $("bigTitle").val();
    var title = $("title").val();
    var classifiedColumn = $("classifiedColumn").val();
    var category = $("category").val();
    var sort = $("sort").val();
    var keywords = $("keywords").val();
    var description = $("description").val();
    var author = $("author").val();
    var source = $("source").val();
    var allowComment = $("allowComment").val();
    var commentStartTime = $("commentStartTime").val();
    var commentEndTime = $("commentEndTime").val();
    var pictureId = $("pictureId").val();

    // var ue = UE.getEditor('editor');
    // var content = $("content").val();
    var json = {
        "bigTitle": bigTitle,
        "title": title,
        "classifiedColumn":classifiedColumn,
        "category":category,
        "sort":sort,
        "keywords":keywords,
        "description":description,
        "author":author,
        "source":source,
        "allowComment":allowComment,
        "commentStartTime":commentStartTime,
        "commentEndTime":commentEndTime,
        "pictureId":pictureId
    };
    ajax.postJson("/information/add",uploadResult,json);
}
function uploadResult(){
    console.log("添加成功");
    window.location.href = "/view/information/list" ;
}

function setImg(obj){//用于进行图片上传，返回地址
    var f=$(obj).val();
    if(f == null || f ==undefined || f == ''){
        return false;
    }
    if(!/\.(?:png|jpg|bmp|gif|PNG|JPG|BMP|GIF)$/.test(f))
    {
        alertLayel("类型必须是图片(.png|jpg|bmp|gif|PNG|JPG|BMP|GIF)");
        $(obj).val('');
        return false;
    }
    var data = new FormData();
    $.each($(obj)[0].files,function(i,file){
        data.append('file', file);
    });
    $.ajax({
        type: "POST",
        url: "/picture/upload",
        data: data,
        cache: false,
        contentType: false,    //不可缺
        processData: false,    //不可缺
        dataType:"json",
        success: function(data) {
            debugger
            if(data.success){
                $("#uploadMessage").val(data.message);//将地址存储好
                $("#pictureId").val(data.pictureId);//将地址存储好
                $("#thumburlShow").attr("src",data.pictureUrl);//显示图片
            }else{
                alertLayel("上传失败");
                $("#url").val("");
                $(obj).val('');
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alertLayel("上传失败，请检查网络后重试");
            $("#url").val("");
            $(obj).val('');
        }
    });
}