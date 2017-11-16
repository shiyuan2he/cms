<%@page contentType="text/html;charset=utf-8" language="java" %>
<!--_menu 作为公共模版分离出去-->
<aside class="Hui-aside">
    <div class="menu_dropdown bk_2" id="menuList">
        <script id="menu-template" type="text/x-handlebars-template">
          {{#each this}}
          <dl id="{{authImg}}">
              <dt onclick="javascript:main.displayOrNot(this);">
                  <i class="Hui-iconfont">{{{authStyle}}}</i> {{authDescription}}
                  <i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
              </dt>
              <dd>
                  <ul>
                      {{#each children}}
                      <li><a href="{{authAddress}}" target="_self" title="{{authDescription}}">{{authDescription}}</a></li>
                      {{/each}}
                  </ul>
              </dd>
          </dl>
          {{/each}}
        </script>

    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
