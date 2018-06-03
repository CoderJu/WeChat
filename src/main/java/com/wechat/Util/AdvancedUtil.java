package com.wechat.Util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.wechat.model.web.SNSUserInfo;
import com.wechat.model.web.WeChatOauth2Token;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：AdvancedUtil
 * 开发人员: Ju
 * 创建时间: 2018/6/2 20:17
 * 描述: 获取网页授权凭证
 * 版本：V1.0
 */
public class AdvancedUtil {

    private static Logger logger = Logger.getLogger(AdvancedUtil.class);

    /**
     * 获取网页授权凭证
     * @param appId 	公众号的唯一标识
     * @param appSecret 公众号的appsecret
     * @param code 填写第一步获取的code参数
     * @return
     */
    public static WeChatOauth2Token getOauth2Toke(String appId,String appSecret,String code){
        WeChatOauth2Token weChatOauth2Token = null;
        // 拼接请求地址
        String requestUrl = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
        requestUrl = requestUrl.replace("APPID", appId);
        requestUrl = requestUrl.replace("SECRET", appSecret);
        requestUrl = requestUrl.replace("CODE", code);
        // 获取网页授权凭证
        JSONObject jsonObject = CommonUtil.httpRequest(requestUrl, "GET", null);
        if (null != jsonObject) {
            try {
                weChatOauth2Token = new WeChatOauth2Token();
                weChatOauth2Token.setAccess_token(jsonObject.getString("access_token"));
                weChatOauth2Token.setExpires_in(jsonObject.getString("expires_in"));
                weChatOauth2Token.setRefresh_token(jsonObject.getString("refresh_token"));
                weChatOauth2Token.setOpenid(jsonObject.getString("openid"));
                weChatOauth2Token.setScope(jsonObject.getString("scope"));
            } catch (Exception e) {
                weChatOauth2Token = null;
                int errorCode = jsonObject.getInteger("errcode");
                String errorMsg = jsonObject.getString("errmsg");
                logger.info("获取网页授权凭证失败 errcode:{} errmsg:{}"+"||errorCode:"+ errorCode+"||errorMsg:"+errorMsg);
            }
        }
        return weChatOauth2Token;

    }


    /**
     * 检验授权凭证（access_token）是否有效
     * @param weChatOauth2Token
     * @return
     */
    public static  boolean CheckAccessToken(WeChatOauth2Token weChatOauth2Token){
        boolean bool = true;
        int errorCode ;
        String errorMsg = "";
        // 拼接请求地址
        String requestUrl = "https://api.weixin.qq.com/sns/auth?access_token=ACCESS_TOKEN&openid=OPENID";
        requestUrl = requestUrl.replace("ACCESS_TOKEN", weChatOauth2Token.getAccess_token());
        requestUrl = requestUrl.replace("OPENID", weChatOauth2Token.getOpenid());
        // 检验授权凭证（access_token）是否有效
        JSONObject jsonObject = CommonUtil.httpRequest(requestUrl, "GET", null);
        if (null != jsonObject) {
                errorCode = jsonObject.getInteger("errcode");
                errorMsg = jsonObject.getString("errmsg");
                if (errorCode == 0 && "ok".equals(errorMsg.toLowerCase())){
                    bool = true;
                }else{
                    logger.info("检验授权凭证（access_token）无效"+"||errorCode:"+ errorCode+"||errorMsg:"+errorMsg);
                    bool = false;
                }
        }
        return bool;
    }



    /**
     *  通过网页授权获取用户信息
     * @param accessToken 网页授权接口调用凭证
     * @param openId 用户标识
     * @return
     */
    public static SNSUserInfo getSNSUserInfo(String accessToken, String openId) {
        SNSUserInfo snsUserInfo =null;
        // 拼接请求地址
        String requestUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID";
        requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId);
        // 通过网页授权获取用户信息
        JSONObject jsonObject = CommonUtil.httpRequest(requestUrl, "GET", null);
        if (null != jsonObject) {
            try {
                snsUserInfo = new SNSUserInfo();
                // 用户的标识
                snsUserInfo.setOpenid(jsonObject.getString("openid"));
                // 昵称
                snsUserInfo.setNickname(jsonObject.getString("nickname"));
                // 性别（1是男性，2是女性，0是未知）
                snsUserInfo.setSex(jsonObject.getString("sex"));
                // 用户所在国家
                snsUserInfo.setCountry(jsonObject.getString("country"));
                // 用户所在省份
                snsUserInfo.setProvince(jsonObject.getString("province"));
                // 用户所在城市
                snsUserInfo.setCity(jsonObject.getString("city"));
                // 用户头像
                snsUserInfo.setHeadimgurl(jsonObject.getString("headimgurl"));
                // 用户特权信息
                JSONArray jsonArray = JSONArray.parseArray(jsonObject.getString("privilege"));
                snsUserInfo.setPrivilegeList(JSON.parseArray(jsonArray.toJSONString(), String.class));
            } catch (Exception e) {
                snsUserInfo = null;
                int errorCode = jsonObject.getInteger("errcode");
                String errorMsg = jsonObject.getString("errmsg");
                logger.error("获取用户信息失败 errcode:{} errmsg:{},||errorCode:"+errorCode+"||errorMsg:"+ errorMsg);
            }
        }
        return snsUserInfo;

    }
}
