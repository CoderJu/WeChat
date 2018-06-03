package com.wechat.model.message.event;

/**
 * Created with IntelliJ IDEA.
 * 类名：LocationEvent
 * 开发人员: Ju
 * 创建时间: 2018/5/31 20:57
 * 描述:上报地理位置事件 	事件类型，LOCATION
 * 版本：V1.0
 */
public class LocationEvent extends BaseEvent {
    //地理位置纬度
    private String Latitude;
    //地理位置经度
    private String Longitude;
    //地理位置精度
    private String Precision;

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getPrecision() {
        return Precision;
    }

    public void setPrecision(String precision) {
        Precision = precision;
    }
}
