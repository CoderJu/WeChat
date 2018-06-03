package com.wechat.model.Button;

/**
 * Created with IntelliJ IDEA.
 * 类名：BaseButton
 * 开发人员: Ju
 * 创建时间: 2018/5/31 23:42
 * 描述:菜单基础类
 * 版本：V1.0
 */
public class BaseButton {

    //所有一级菜单、二级菜单都共有一个相同的属性，那就是name
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
