package com.wechat.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wechat.Util.CommonUtil;
import com.wechat.Util.MessageUtil;
import com.wechat.model.message.response.TextRespMessage;
import com.wechat.model.user.WeChatUserInfo;
import com.wechat.service.WeChatService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * 类名：WeChatService
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:17
 * 描述: 微信消息核心处理接口
 * 版本：V1.0
 */

@Service("weChatService")
public class WeChatServiceImpl implements WeChatService {

    private static Logger logger = Logger.getLogger(WeChatServiceImpl.class);

    /**
     * 处理微信发来的请求
     * @param request
     * @return xml
     */
    @Override
    public String processRequest(HttpServletRequest request,String accessToken) {
        // xml格式的消息数据
        String respXml = null;
        // 默认返回的文本消息内容
        String respContent = "未知的消息类型！";

        // 获取接口访问凭证
        try {
            // 调用parseXml方法解析请求消息
            Map<String, String> requestMap = MessageUtil.xmlToMap(request);
            logger.info("requestMap>>>"+requestMap);
            // 发送方帐号
            String fromUserName = requestMap.get("FromUserName");
            // 开发者微信号
            String toUserName = requestMap.get("ToUserName");
            // 消息类型
            String msgType = requestMap.get("MsgType");

            // 回复文本消息
            TextRespMessage textMessage = new TextRespMessage();
            textMessage.setToUserName(fromUserName);
            textMessage.setFromUserName(toUserName);
            textMessage.setCreateTime(new Date().getTime());
            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

            // 文本消息
            if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
                respContent = "您发送的是文本消息！";
            }
            // 图片消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
                respContent = "您发送的是图片消息！";
            }
            // 语音消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
                respContent = "您发送的是语音消息！";
            }
            // 视频消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) {
                respContent = "您发送的是视频消息！";
            }
            // 视频消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_SHORTVIDEO)) {
                respContent = "您发送的是小视频消息！";
            }
            // 地理位置消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
                respContent = "您发送的是地理位置消息！";
            }
            // 链接消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
                respContent = "您发送的是链接消息！";
            }
            // 事件推送
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
                // 事件类型
                String eventType = requestMap.get("Event");
                // 关注
                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
                    getUserInfo(accessToken, fromUserName);
                    respContent = "谢谢您的关注！";
                }
                // 取消关注
                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
                    // TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
                    logger.info("++++++用户取消订阅");
                }
                // 扫描带参数二维码
                else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
                    // TODO 处理扫描带参数二维码事件
                }
                // 上报地理位置
                else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
                    // TODO 处理上报地理位置事件
                }
                // 自定义菜单
                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
                    // TODO 处理菜单点击事件
                }
            }
            // 设置文本消息的内容
            textMessage.setContent(respContent);
            // 将文本消息对象转换成xml
            respXml = MessageUtil.messageToXml(textMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respXml;
    }

    /**
     * 获取用户信息
     * @param accessToken
     * @param openId
     * @return
     */
    @Override
    public WeChatUserInfo getUserInfo(String accessToken, String openId) {
        WeChatUserInfo weChatUserInfo = null;
        String requestUrl = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID";

        requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId);
        // 获取用户信息
        JSONObject jsonObject = CommonUtil.httpRequest(requestUrl, "GET", null);
        if (null != jsonObject) {
            try {
             weChatUserInfo = new WeChatUserInfo();
             weChatUserInfo.setSubscribe(jsonObject.getString("subscribe"));
             weChatUserInfo.setOpenid(jsonObject.getString("openid"));
             weChatUserInfo.setNickname(jsonObject.getString("nickname"));
             weChatUserInfo.setSex(jsonObject.getString("sex"));
             weChatUserInfo.setCity(jsonObject.getString("city"));
             weChatUserInfo.setCountry(jsonObject.getString("country"));
             weChatUserInfo.setProvince(jsonObject.getString("province"));
             weChatUserInfo.setLanguage(jsonObject.getString("language"));
             weChatUserInfo.setHeadimgurl(jsonObject.getString("headimgurl"));
             weChatUserInfo.setSubscribe_time(jsonObject.getString("subscribe_time"));
             weChatUserInfo.setUnionid(jsonObject.getString("unionid"));
             weChatUserInfo.setRemark(jsonObject.getString("remark"));
             weChatUserInfo.setGroupid(jsonObject.getString("groupid"));
             weChatUserInfo.setTagid_list(jsonObject.getString("tagid_list"));
             weChatUserInfo.setSubscribe_scene(jsonObject.getString("subscribe_scene"));
             weChatUserInfo.setQr_scene(jsonObject.getString("qr_scene"));
             weChatUserInfo.setQr_scene_str(jsonObject.getString("qr_scene_str"));
            }catch (Exception e){
                if ("0".equals(weChatUserInfo.getSubscribe())){
                    logger.info("用户{}已取消关注"+weChatUserInfo.getOpenid()+"||"+weChatUserInfo.getNickname());
                }else {
                    int errorCode = jsonObject.getInteger("errcode");
                    String errorMsg = jsonObject.getString("errmsg");
                    logger.info("获取用户信息失败 errcode:{} errmsg:{}"+"||错误代码："+errorCode+"||错误信息："+errorMsg);
                }
            }

        }
        logger.info(">>>>>>>>>>>>>>>>weChatUserInfo"+weChatUserInfo);
        return weChatUserInfo;
    }
}

