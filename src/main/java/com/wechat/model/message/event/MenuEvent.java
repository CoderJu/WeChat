package com.wechat.model.message.event;

/**
 * Created with IntelliJ IDEA.
 * 类名：MenuEvent
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:01
 * 描述:	事件类型，CLICK
 * 版本：V1.0
 */
public class MenuEvent extends BaseEvent {
    // 事件KEY值，与自定义菜单接口中KEY值对应
    private String EventKey;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }
}
