package com.wechat.model.token;

/**
 * Created with IntelliJ IDEA.
 * 类名：Token
 * 开发人员: Ju
 * 创建时间: 2018/5/31 22:19
 * 描述:凭证
 * 版本：V1.0
 */
public class Token {

    //获取到的凭证
    private String accessToken;
    // 凭证有效期，单位：秒
    private int expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}
