/**
 * @description <p></p>
 * @param
 * @return 
 * @author heshiyuan
 * @date 2018/6/29 11:26
 */
function article_save_submit() {
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

    var ue = UE.getEditor('editor');
    var content = $("content").val();
}