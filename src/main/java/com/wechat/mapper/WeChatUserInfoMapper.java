package com.wechat.mapper;

import com.wechat.model.user.WeChatUserInfo;

/**
 * Created with IntelliJ IDEA.
 * 类名：WeChatUserInfoMapper.xml
 * 开发人员: Ju
 * 创建时间: 2018/6/3 14:25
 * 描述:关注用户管理类
 * 版本：V1.0
 */
public interface WeChatUserInfoMapper {

    /**
     * 插入关注用户数据
     * @param weChatUserInfo
     */
    void insert(WeChatUserInfo weChatUserInfo);

    /**
     * 通过openid查询
     * @param weChatUserInfo
     * @return
     */
    WeChatUserInfo selectByOpenId(WeChatUserInfo weChatUserInfo);

    /**
     * 根据OpenId更新数据库字段
     * @param weChatUserInfo
     */
    void updateByOpenId(WeChatUserInfo weChatUserInfo);

    /**
     * 取消关注改写数据库状态
     * @param weChatUserInfo
     */
    void unSubscribe(WeChatUserInfo weChatUserInfo);
}
