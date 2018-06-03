package com.wechat.controller;

import com.wechat.Util.AdvancedUtil;
import com.wechat.Util.PropertyUtil;
import com.wechat.model.web.SNSUserInfo;
import com.wechat.model.web.WeChatOauth2Token;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * 类名：OAuthController
 * 开发人员: Ju
 * 创建时间: 2018/6/2 22:31
 * 描述: 微信网页授权
 * 版本：V1.0
 */
@Controller
public class OAuthController {
    private static Logger logger = Logger.getLogger(OAuthController.class);

    @RequestMapping(value = "/oauth",method = RequestMethod.GET)
    public String oauth(HttpServletRequest request, HttpServletResponse response,Model model) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        // 用户同意授权后，能获取到code
        String code = request.getParameter("code");
        String state = request.getParameter("state");

        String appId = PropertyUtil.getValueByKey("WeChat.properties","appID");
        String appsecret =PropertyUtil.getValueByKey("WeChat.properties","appsecret");
        logger.info("code:"+code+"||state:"+state+"||appId:"+appId+"||appsecret:"+appsecret);
        // 用户同意授权
        if (!"authdeny".equals(code)) {
            // 获取网页授权access_token
            WeChatOauth2Token weChatOauth2Token = AdvancedUtil.getOauth2Toke(appId, appsecret, code);
            // 网页授权接口访问凭证
            String accessToken = weChatOauth2Token.getAccess_token();
            // 用户标识
            String openId = weChatOauth2Token.getOpenid();
            // 获取用户信息
            if (AdvancedUtil.CheckAccessToken(weChatOauth2Token)) {//校验当前TOKEN是否有效
                SNSUserInfo snsUserInfo = AdvancedUtil.getSNSUserInfo(accessToken, openId);
                // 设置要传递的参数
                model.addAttribute("snsUserInfo", snsUserInfo);
                model.addAttribute("state", state);
            }else{
                model.addAttribute("errcode", "40003");
                model.addAttribute("errmsg", "invalid openid");
            }
        }
        // 跳转到show.jsp
        return "show";
    }
}
