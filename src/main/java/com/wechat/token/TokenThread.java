package com.wechat.token;

import com.wechat.Util.TokenUtil;
import com.wechat.model.token.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * 类名：TokenThread
 * 开发人员: Ju
 * 创建时间: 2018/5/31 23:18
 * 描述: 定时获取微信access_token的线程
 * 版本：V1.0
 */
public class TokenThread implements Runnable  {
    private static Logger log = LoggerFactory.getLogger(TokenThread.class);
    // 第三方用户唯一凭证
    public static String appid = "";
    // 第三方用户唯一凭证密钥
    public static String appsecret = "";
    public static Token accessToken = null;
    @Override
    public void run() {
        while (true) {
            try {
                accessToken = TokenUtil.getToken(appid, appsecret);
                if (null != accessToken) {
                    log.info("获取access_token成功，有效时长{}秒 token:{}", accessToken.getExpiresIn(), accessToken.getAccessToken());
                    // 休眠7000秒
                    Thread.sleep((accessToken.getExpiresIn() - 200)*1000);
                } else {
                    // 如果access_token为null，60秒后再获取
                    Thread.sleep(60 * 1000);
                }
            } catch (InterruptedException e) {
                try {
                    Thread.sleep(60 * 1000);
                } catch (InterruptedException e1) {
                    log.error("{}", e1);
                }
                log.error("{}", e);
            }
        }
    }
}
