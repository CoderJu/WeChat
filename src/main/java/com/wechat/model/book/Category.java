package com.wechat.model.book;

/**
 * Created with IntelliJ IDEA.
 * 类名：Category
 * 开发人员: Ju
 * 创建时间: 2018/7/14 15:50
 * 描述: 图书目录
 * 版本：V1.0
 */
public class Category {

    //id
    private Integer cid;
    //目录名称
    private String cname;
    //图片链接icon
    private String iconurl;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", iconurl='" + iconurl + '\'' +
                '}';
    }
}
