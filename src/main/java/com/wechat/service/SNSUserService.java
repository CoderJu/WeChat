package com.wechat.service;

import com.wechat.model.web.SNSUserInfo;

/**
 * Created with IntelliJ IDEA.
 * 类名：SNSUserService
 * 开发人员: Ju
 * 创建时间: 2018/6/3 20:45
 * 描述: 网页授权认证记录
 * 版本：V1.0
 */
public interface SNSUserService {

    /**
     * 根据Openid查找网页授权用户
     * @param openid
     * @return
     */
    SNSUserInfo selectSNSUserByOpenID(String openid);

    /**
     * 插入新的网页授权用户
     * @param snsUserInfo
     */
    void insert(SNSUserInfo snsUserInfo);

    /**
     * 通过opernid更新数据库对应网页授权用户
     * @param snsUserInfo
     */
    void updateSNSUserByOpenId(SNSUserInfo snsUserInfo);

    /**
     * 根据用户openID更新用户姓名和电话
     * @param snsUserInfo
     */
    void updateTelAndLastName(SNSUserInfo snsUserInfo);
}
