package com.wechat.model.message.response;

/**
 * Created with IntelliJ IDEA.
 * 类名：ImageMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:11
 * 描述: 回复图片消息 MsgType--image
 * 版本：V1.0
 */
public class ImageRespMessage extends BaseRespMessage {
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
