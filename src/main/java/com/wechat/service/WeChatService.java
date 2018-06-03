package com.wechat.service;

import com.wechat.model.user.WeChatUserInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * 类名：WeChatService
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:17
 * 描述: 微信消息核心处理接口
 * 版本：V1.0
 */
public interface WeChatService {

     String processRequest(HttpServletRequest request,String accessToken);

     WeChatUserInfo getUserInfo(String accessToken, String openId);
}
