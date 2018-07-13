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

     /**
      * 处理微信发来的请求
      * @param request
      * @param accessToken
      * @return
      */
     String processRequest(HttpServletRequest request,String accessToken);

     /**
      * 获取用户信息
      * @param accessToken
      * @param openId
      * @return
      */
     WeChatUserInfo getUserInfo(String accessToken, String openId);

     /**
      * 关注时将关注用户信息写入数据库
      * @param weChatUserInfo
      */
     void createWeChatUserInfo(WeChatUserInfo weChatUserInfo);

     /**
      * 取消关注时改写数据库状态
      * @param weChatUserInfo
      */
     void unSubscribe(WeChatUserInfo weChatUserInfo);

     /**
      * 根据openid更新用户姓名和电话
      * @param weChatUserInfo
      */
     void updateTelAndLastName(WeChatUserInfo weChatUserInfo);

     /**
      * 根据openid查找用户
      * @param openId
      * @return
      */
    WeChatUserInfo searchByOpenid(String openId);
}
