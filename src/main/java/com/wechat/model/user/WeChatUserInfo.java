package com.wechat.model.user;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：WeChatUserInfo
 * 开发人员: Ju
 * 创建时间: 2018/6/1 21:59
 * 描述: 微信用户的基本信息
 * 版本：V1.0
 */
public class WeChatUserInfo {
    private Integer id;
    //用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
    private String subscribe;
    //用户的标识，对当前公众号唯一
    private String openid;
    //用户的昵称
    private String nickname;
    //用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
    private String sex;
    //用户所在城市
    private String city;
    //用户所在国家
    private String country;
    //用户所在省份
    private String province;
    //用户的语言，简体中文为zh_CN
    private String language;
    //用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，
    // 0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效
    private String headimgurl;
    //用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
    private String subscribe_time;
    //只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
    private String unionid;
    //公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
    private String remark;
    //用户所在的分组ID（兼容旧的用户分组接口）
    private String groupid;
    //用户被打上的标签ID列表
    private List tagid_list;
    //返回用户关注的渠道来源，ADD_SCENE_SEARCH 公众号搜索，
    // ADD_SCENE_ACCOUNT_MIGRATION 公众号迁移，
    // ADD_SCENE_PROFILE_CARD 名片分享，
    // ADD_SCENE_QR_CODE 扫描二维码，
    // ADD_SCENEPROFILE LINK 图文页内名称点击，
    // ADD_SCENE_PROFILE_ITEM 图文页右上角菜单，
    // ADD_SCENE_PAID 支付后关注，
    // ADD_SCENE_OTHERS 其他
    private String subscribe_scene;
    //二维码扫码场景（开发者自定义）
    private String qr_scene;
    //二维码扫码场景描述（开发者自定义）
    private String qr_scene_str;
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
    //取消关注
    private String unsubscribedate;
    //取消关注时间
    private String unsubscribetime;
    //用户是否补充个人信息
    private Integer personal;

    public Integer getPersonal() {
        return personal;
    }

    public void setPersonal(Integer personal) {
        this.personal = personal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getSubscribe_time() {
        return subscribe_time;
    }

    public void setSubscribe_time(String subscribe_time) {
        this.subscribe_time = subscribe_time;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public List getTagid_list() {
        return tagid_list;
    }

    public void setTagid_list(List tagid_list) {
        this.tagid_list = tagid_list;
    }

    public String getSubscribe_scene() {
        return subscribe_scene;
    }

    public void setSubscribe_scene(String subscribe_scene) {
        this.subscribe_scene = subscribe_scene;
    }

    public String getQr_scene() {
        return qr_scene;
    }

    public void setQr_scene(String qr_scene) {
        this.qr_scene = qr_scene;
    }

    public String getQr_scene_str() {
        return qr_scene_str;
    }

    public void setQr_scene_str(String qr_scene_str) {
        this.qr_scene_str = qr_scene_str;
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

    public String getUnsubscribedate() {
        return unsubscribedate;
    }

    public void setUnsubscribedate(String unsubscribedate) {
        this.unsubscribedate = unsubscribedate;
    }

    public String getUnsubscribetime() {
        return unsubscribetime;
    }

    public void setUnsubscribetime(String unsubscribetime) {
        this.unsubscribetime = unsubscribetime;
    }

    @Override
    public String toString() {
        return "WeChatUserInfo{" +
                "subscribe='" + subscribe + '\'' +
                ", openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", language='" + language + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", subscribe_time='" + subscribe_time + '\'' +
                ", unionid='" + unionid + '\'' +
                ", remark='" + remark + '\'' +
                ", groupid='" + groupid + '\'' +
                ", tagid_list=" + tagid_list +
                ", subscribe_scene='" + subscribe_scene + '\'' +
                ", qr_scene='" + qr_scene + '\'' +
                ", qr_scene_str='" + qr_scene_str + '\'' +
                ", createdate='" + createdate + '\'' +
                ", createtime='" + createtime + '\'' +
                ", lastname='" + lastname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", lastoperatedate='" + lastoperatedate + '\'' +
                ", lastoperatetime='" + lastoperatetime + '\'' +
                '}';
    }
}
