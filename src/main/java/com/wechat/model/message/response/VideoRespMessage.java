package com.wechat.model.message.response;

/**
 * Created with IntelliJ IDEA.
 * 类名：VideoMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:17
 * 描述: 回复视频消息 MsgType---video
 * 版本：V1.0
 */
public class VideoRespMessage extends BaseRespMessage {
   // 回复视频消息
    private Video video;

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
