package com.wechat.model.message.response;

/**
 * Created with IntelliJ IDEA.
 * 类名：MusicMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:23
 * 描述:回复音乐消息 MsgType--music
 * 版本：V1.0
 */
public class MusicRespMessage extends BaseRespMessage {

    private Music music;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
