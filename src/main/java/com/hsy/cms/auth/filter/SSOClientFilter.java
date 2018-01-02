package com.hsy.cms.auth.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path sso/com.hsy.sso.blog.filter
 * @date 19/10/2017 9:39 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@WebFilter("/*")
public class SSOClientFilter implements Filter {
    private static final Logger _logger = LoggerFactory.getLogger(SSOClientFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    /**
     * @description <p>
     *     1、静态资源文件放行
     *     2、从本服务session中获取用户信息
     *     3、从cookie中获取通票
     *     4、用验证通票跟此人匹配关系
     * </p>
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         _logger.info("【CMS系统检票处】进入到cms系统拦截器");
        /*HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 1、静态资源文件放行
        if(request.getRequestURL().toString().contains("resources")||request.getRequestURL().toString().contains("view")){
            _logger.info("【CMS系统检票处】此地址放行：{}",request.getRequestURL().toString());
            filterChain.doFilter(request, response);
        }else{
            _logger.info("【CMS系统检票处】此地址拦截：{}",request.getRequestURL().toString());
            // 2、从本服务session中获取用户信息==单票
            SessionBean sessionBean = (SessionBean) request.getSession().getAttribute(SsoEnum.SSO_KEY_USER_SESSION.getCode()) ;
            if(sessionBean==null||(null!=sessionBean&&null==sessionBean.getTicket())){
                // 3、从cookie中获取通票
                String ticket = "";
                Cookie[] cookies = request.getCookies();
                if(null==cookies||cookies.length<=0){
                    filterChain.doFilter(request, response);
                    return ;
                }
                for (Cookie cookie : cookies) {
                    _logger.info("【CMS系统检票处】cookie信息：name={},value={}", cookie.getName(), cookie.getValue());
                    if (SsoEnum.SSO_KEY_TICKET_COOKIE.getCode().equals(cookie.getName())) {
                        ticket = cookie.getValue();
                    }
                }
                // 4、用验证通票跟此人匹配关系
                if(StringHelper.isNotNullOrEmpty(ticket)) {
                    _logger.info("【CMS系统检票处】此人有通票{}",ticket);
                    // 用通票获取用户信息
                    _logger.info("【CMS系统检票处】将用户:{}手中通票:{}去sso服务中获取用户信息。",ticket);
                    String url = Config.SSO_SERVER_TICKET + ticket ;
                    _logger.info("【CMS系统检票处】http url={}",url);
                    try{
                        String sessionInfoJson = HttpClientUtils.sendHttpGet(url);
                        SessionBean ssoSession = JsonToBeanUtil.responseJsonToBean(sessionInfoJson,SessionBean.class) ;
                        if(null!=ssoSession&&null!=ssoSession.getTicket()) {
                            _logger.info("【CMS系统检票处】用户:{}手中通票{}跟sso服务验票大厅中的票匹配，允许通过",ssoSession.getMobile(), ticket);
                            request.getSession().setAttribute(SsoEnum.SSO_KEY_USER_SESSION.getCode(),ssoSession);
                            filterChain.doFilter(request, response);
                            return ;
                        }
                    }catch (Exception e){
                        _logger.error(e.getMessage(),e);
                    }
                }
            }else{
                _logger.info("【CMS系统检票处】用户:{}拥有单票，已登陆，允许通过");
                filterChain.doFilter(request, response);
                return ;
            }
            _logger.info("【CMS系统检票处】单票，通票均无效，请重新登陆，进行购票");
            // 没有sessionInfo也没有ticket，重新登录
            request.getRequestDispatcher("/WEB-INF/jsp/sso/login.jsp").forward(request,response);
            filterChain.doFilter(request, response);
        }*/
    }

    @Override
    public void destroy() {

    }
}
