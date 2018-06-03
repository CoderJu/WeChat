package com.wechat.model.message.response;


/**
 * Created with IntelliJ IDEA.
 * 类名：TextMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:07
 * 描述: 回复文本消息 MsgType--text
 * 版本：V1.0
 */
public class TextRespMessage extends BaseRespMessage {
    //回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
