<%@page contentType="text/html;charset=utf-8" language="java" %>
<section class="Hui-article-box">
    <nav class="breadcrumb">
        <i class="Hui-iconfont">&#xe67f;</i> 首页
        <span class="c-gray en">&gt;</span> 用户管理
        <span class="c-gray en">&gt;</span> 用户列表
        <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" >
            <i class="Hui-iconfont">&#xe68f;</i>
        </a>
    </nav>
    <div class="Hui-article">
        <article class="cl pd-20">
            <div class="text-c"> 日期范围：
                <input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
                -
                <input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
                <input type="text" class="input-text" style="width:250px" placeholder="输入会员名称、电话、邮箱" id="" name="">
                <button type="submit" class="btn btn-success radius" id="searchUser" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
            </div>
            <div class="cl pd-5 bg-1 bk-gray mt-20">
                <span class="l">
                    <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
                        <i class="Hui-iconfont">&#xe6e2;</i> 批量删除
                    </a>
                    <a href="javascript:;" onclick="user.addUser('添加用户','/view/toAddUserView','','510')" class="btn btn-primary radius">
                        <i class="Hui-iconfont">&#xe600;</i> 添加用户
                    </a>
                </span>
                <span class="r">共有数据：<strong>88</strong> 条</span>
            </div>
            <div class="mt-20">
                <table class="table table-border table-bordered table-hover table-bg table-sort">
                    <thead>
                        <tr class="text-c">
                            <th width="25"><input type="checkbox" name="" value=""></th>
                            <th width="80">ID</th>
                            <th width="100">用户编号</th>
                            <th width="90">用户名</th>
                            <th width="">手机</th>
                            <th width="130">加入时间</th>
                            <th width="70">状态</th>
                            <th width="100">操作</th>
                        </tr>
                    </thead>
                    <tbody id="userList">
                        <script id="user-list-template" type="text/x-handlebars-template">
                            {{#each this}}
                            <tr class="text-c">
                                <td><input type="checkbox" value="" name=""></td>
                                <td>{{id}}</td>
                                <td><u style="cursor:pointer" class="text-primary" onclick="user.showUser('{{userName}}','/view/toUserDetailView','{{id}}','360','400')">{{userCode}}</u></td>
                                <td>{{userName}}</td>
                                <td>{{mobile}}</td>
                                <td>{{createTime}}</td>
                                <td class="td-status"><span class="label label-success radius">已启用</span></td>
                                <td class="td-manage">
                                    <a style="text-decoration:none" onClick="user.stopUser(this,'{{id}}')" href="javascript:;" title="停用">
                                        <i class="Hui-iconfont">&#xe631;</i>
                                    </a>
                                    <a title="编辑" href="javascript:;" onclick="user.editUser('编辑','/view/toAddUserView?userId={{id}}','4','','510')" class="ml-5" style="text-decoration:none">
                                        <i class="Hui-iconfont">&#xe6df;</i>
                                    </a>
                                    <a style="text-decoration:none" class="ml-5" onClick="user.changePassword('修改密码','/view/toChangePwdView','{{id}}','600','270')" href="javascript:;" title="修改密码">
                                        <i class="Hui-iconfont">&#xe63f;</i></a>
                                    <a title="删除" href="javascript:;" onclick="user.delUser(this,'{{id}}')" class="ml-5" style="text-decoration:none">
                                        <i class="Hui-iconfont">&#xe6e2;</i>
                                    </a>
                                </td>
                            </tr>
                            {{/each}}
                        </script>
                    </tbody>
                </table>
            </div>
        </article>
    </div>
</section>
