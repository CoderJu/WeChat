package com.wechat.model.message.response;

/**
 * Created with IntelliJ IDEA.
 * 类名：ImageMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:09
 * 描述: 图片
 * 版本：V1.0
 */
public class Image {
    //通过素材管理中的接口上传多媒体文件，得到的id。
    private String MediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
