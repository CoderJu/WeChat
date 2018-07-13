package com.wechat.mapper;

import com.wechat.model.web.SNSUserInfo;

/**
 * Created with IntelliJ IDEA.
 * 类名：SNSUserInfoMapper
 * 开发人员: Ju
 * 创建时间: 2018/6/3 20:42
 * 描述: 授权信息类
 * 版本：V1.0
 */
public interface SNSUserInfoMapper {
    /**
     * 插入授权用户信息
     * @param snsUserInfo
     */
    void insert(SNSUserInfo snsUserInfo);

    /**
     * 通过openID查找对应的授权用户
     * @param openid
     * @return
     */
    SNSUserInfo selectSNSUserByOpenID(String openid);

    /**
     * 根据OpenId更新对应的授权用户信息
     * @param snsUserInfo
     */
    void updateSNSUserByOpenId(SNSUserInfo snsUserInfo);

    /**
     * 根据OpenId更新用户姓名和电话
     * @param snsUserInfo
     */
    void updateTelAndLastName(SNSUserInfo snsUserInfo);
}
