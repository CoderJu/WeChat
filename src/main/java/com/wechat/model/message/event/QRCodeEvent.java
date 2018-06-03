package com.wechat.model.message.event;

/**
 * Created with IntelliJ IDEA.
 * 类名：QRCodeEvent
 * 开发人员: Ju
 * 创建时间: 2018/5/31 20:55
 * 描述: *
 * 用户未关注时，进行关注后的事件推送----事件类型，subscribe
 * 用户已关注时的事件推送----事件类型，SCAN
 * 版本：V1.0
 */
public class QRCodeEvent extends BaseEvent {
    //事件KEY值，qrscene_为前缀，后面为二维码的参数值
    private String EventKey;
    //二维码的ticket，可用来换取二维码图片
    private String Ticket;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }
}
