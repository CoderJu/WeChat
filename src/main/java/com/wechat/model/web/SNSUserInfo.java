package com.wechat.model.web;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：SNSUserInfo
 * 开发人员: Ju
 * 创建时间: 2018/6/1 23:15
 * 描述:通过网页授权获取的用户信息
 * 版本：V1.0
 */
public class SNSUserInfo {
    private Integer id;
    //用户的唯一标识
    private String openid;
    //用户昵称
    private String nickname;
    //用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
    private String sex;
    //	用户个人资料填写的国家
    private String province;
    //普通用户个人资料填写的省份
    private String country;
    //普通用户个人资料填写的城市
    private String city;
    //用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），
    // 用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
    private String headimgurl;
    //用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
    private List<String> privilegeList;
    //只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
    private String unionid;
    //创建日期
    private String createdate;
    //创建时间
    private String createtime;
    //姓名
    private String lastname;
    //电话
    private String telephone;
    //上次操作日期
    private String lastoperatedate;
    //上次操作时间
    private String lastoperatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public List<String> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<String> privilegeList) {
        this.privilegeList = privilegeList;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLastoperatedate() {
        return lastoperatedate;
    }

    public void setLastoperatedate(String lastoperatedate) {
        this.lastoperatedate = lastoperatedate;
    }

    public String getLastoperatetime() {
        return lastoperatetime;
    }

    public void setLastoperatetime(String lastoperatetime) {
        this.lastoperatetime = lastoperatetime;
    }

    @Override
    public String toString() {
        return "SNSUserInfo{" +
                "openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", privilegeList=" + privilegeList +
                ", unionid='" + unionid + '\'' +
                ", createdate='" + createdate + '\'' +
                ", createtime='" + createtime + '\'' +
                ", lastname='" + lastname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", lastoperatedate='" + lastoperatedate + '\'' +
                ", lastoperatetime='" + lastoperatetime + '\'' +
                '}';
    }
}
