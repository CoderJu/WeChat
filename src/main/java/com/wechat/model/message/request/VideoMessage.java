package com.wechat.model.message.request;

/**
 * Created with IntelliJ IDEA.
 * 类名：VideoMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 20:34
 * 描述:视频消息
 * 版本：V1.0
 */
public class VideoMessage extends BaseMessage {
    //视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    //视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
