package com.wechat.model.message.response;

/**
 * Created with IntelliJ IDEA.
 * 类名：VoiceMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:14
 * 描述: 回复语音消息 MsgType--语音，voice
 * 版本：V1.0
 */
public class VoiceRespMessage extends BaseRespMessage {
    private Voice voice;

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }
}
