package com.wechat.model.message.event;

/**
 * Created with IntelliJ IDEA.
 * 类名：BaseEvent
 * 开发人员: Ju
 * 创建时间: 2018/5/31 20:49
 * 描述:接收事件推送基础类
 * 版本：V1.0
 */
public class BaseEvent {
    //开发者微信号
    private String ToUserName;
    //发送方帐号（一个OpenID）
    private String FromUserName;
    //消息创建时间 （整型）
    private long CreateTime;
    //消息类型，event
    private String MsgType;
    //事件类型，subscribe(订阅)、unsubscribe(取消订阅)
    private String Event;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }
}
