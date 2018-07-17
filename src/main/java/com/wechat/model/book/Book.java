package com.wechat.model.book;

/**
 * Created with IntelliJ IDEA.
 * 类名：Book
 * 开发人员: Ju
 * 创建时间: 2018/7/15 16:18
 * 描述: BOOK实体类
 * 版本：V1.0
 */
public class Book {

    private Integer bid;

    private String bname;

    private String imageurl;

    private String bdesc;

    private String author;

    private  String cid;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getBdesc() {
        return bdesc;
    }

    public void setBdesc(String bdesc) {
        this.bdesc = bdesc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", bdesc='" + bdesc + '\'' +
                ", author='" + author + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }
}
