package com.wechat.model.Button;


/**
 * Created with IntelliJ IDEA.
 * 类名：ComplexButton
 * 开发人员: Ju
 * 创建时间: 2018/5/31 23:47
 * 描述: 父菜单项 :包含有二级菜单项的一级菜单。这类菜单项包含有二个属性：name和sub_button，而sub_button以是一个子菜单项数组
 * 版本：V1.0
 */
public class ComplexButton extends BaseButton {
    private BaseButton[] sub_button;
    public BaseButton[] getSub_button() {
        return sub_button;
    }

    public void setSub_button(BaseButton[] sub_button) {
        this.sub_button = sub_button;
    }
}
