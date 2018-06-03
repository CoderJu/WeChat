package com.wechat.model.message.request;

/**
 * Created with IntelliJ IDEA.
 * 类名：TextMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 20:28
 * 描述: 请求消息之文本消息
 * 版本：V1.0
 */
public class TextMessage extends  BaseMessage {
    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

}
