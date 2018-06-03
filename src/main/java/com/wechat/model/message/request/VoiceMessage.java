package com.wechat.model.message.request;

/**
 * Created with IntelliJ IDEA.
 * 类名：VoiceMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 20:31
 * 描述:语音消息
 * 版本：V1.0
 */
public class VoiceMessage extends BaseMessage {
    //语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    //语音格式，如amr，speex等
    private String Format;
    //语音识别结果，UTF8编码
    private String Recognition;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }
}
