package com.wechat.service.impl;

import com.wechat.mapper.SNSUserInfoMapper;
import com.wechat.model.web.SNSUserInfo;
import com.wechat.service.SNSUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * 类名：SNSUserServiceImpl
 * 开发人员: Ju
 * 创建时间: 2018/6/3 20:46
 * 描述: 网页授权接口实现
 * 版本：V1.0
 */
@Transactional
@Service("snsUserService")
public class SNSUserServiceImpl implements SNSUserService {

    @Autowired
    private SNSUserInfoMapper snsUserInfoMapper;
    @Override
    public SNSUserInfo selectSNSUserByOpenID(String openid) {
        return snsUserInfoMapper.selectSNSUserByOpenID(openid);
    }

    @Override
    public void insert(SNSUserInfo snsUserInfo) {
        snsUserInfoMapper.insert(snsUserInfo);
    }

    @Override
    public void updateSNSUserByOpenId(SNSUserInfo snsUserInfo) {
        snsUserInfoMapper.updateSNSUserByOpenId(snsUserInfo);
    }
}
