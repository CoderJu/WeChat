package com.wechat.model.message.request;

/**
 * Created with IntelliJ IDEA.
 * 类名：LinkMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 20:38
 * 描述:链接消息
 * 版本：V1.0
 */
public class LinkMessage extends BaseMessage{
    //消息标题
    private String Title;
    //消息描述
    private String Description;
    //消息链接
    private String Url;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
