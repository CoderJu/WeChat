package com.wechat.controller;

import com.wechat.Util.CommonUtil;
import com.wechat.Util.PropertyUtil;
import com.wechat.model.Button.BaseButton;
import com.wechat.model.Button.CommonButton;
import com.wechat.model.Button.ComplexButton;
import com.wechat.model.Button.Menu;
import com.wechat.model.token.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * 类名：MenuManager
 * 开发人员: Ju
 * 创建时间: 2018/5/31 23:57
 * 描述: 菜单管理器类
 * 版本：V1.0
 */
public class MenuManager {

    private static Logger log = LoggerFactory.getLogger(MenuManager.class);

    public static void main(String[] args) {
        // 第三方用户唯一凭证
        String appId = PropertyUtil.getValueByKey("WeChat.properties","appID");
        // 第三方用户唯一凭证密钥
        String appSecret =PropertyUtil.getValueByKey("WeChat.properties","appsecret");


        // 调用接口获取access_token
       Token at = CommonUtil.getAccessToken(appId, appSecret);

        if (null != at) {
            // 调用接口创建菜单
            int result = CommonUtil.createMenu(getMenu(), at.getAccessToken());

            // 判断菜单创建结果
            if (0 == result)
                log.info("菜单创建成功！");
            else
                log.info("菜单创建失败，错误码：" + result);
        }
    }

    /**
     * 组装菜单数据
     *
     * @return
     */
    private static Menu getMenu() {
        CommonButton btn11 = new CommonButton();
        btn11.setName("图书目录");
        btn11.setType("view");
        //btn11.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxaa8cddebe617c505&" +
              //  "redirect_uri=http%3A%2F%2Fwww.coderju.cn%2FWeChat%2Foauth&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect");
        btn11.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxaa8cddebe617c505&" +
          "redirect_uri=http%3A%2F%2Fwechat.tunnel.qydev.com%2Foauth&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect");

        CommonButton btn12 = new CommonButton();
        btn12.setName("我要借书");
        btn12.setType("view");
        btn12.setUrl("https://www.baidu.com");


        CommonButton btn13 = new CommonButton();
        btn13.setName("我要还书");
        btn13.setType("view");
        btn13.setUrl("http://wechat.tunnel.qydev.com");


       /* CommonButton btn14 = new CommonButton();
        btn14.setName("历史上的今天");
        btn14.setType("click");
        btn14.setKey("14");

        CommonButton btn21 = new CommonButton();
        btn21.setName("歌曲点播");
        btn21.setType("click");
        btn21.setKey("21");

        CommonButton btn22 = new CommonButton();
        btn22.setName("经典游戏");
        btn22.setType("click");
        btn22.setKey("22");

        CommonButton btn23 = new CommonButton();
        btn23.setName("美女电台");
        btn23.setType("click");
        btn23.setKey("23");

        CommonButton btn24 = new CommonButton();
        btn24.setName("人脸识别");
        btn24.setType("click");
        btn24.setKey("24");

        CommonButton btn25 = new CommonButton();
        btn25.setName("聊天唠嗑");
        btn25.setType("click");
        btn25.setKey("25");

        CommonButton btn31 = new CommonButton();
        btn31.setName("Q友圈");
        btn31.setType("click");
        btn31.setKey("31");

        CommonButton btn32 = new CommonButton();
        btn32.setName("电影排行榜");
        btn32.setType("click");
        btn32.setKey("32");

        CommonButton btn33 = new CommonButton();
        btn33.setName("幽默笑话");
        btn33.setType("click");
        btn33.setKey("33");*/


        /**
         * 微信：  mainBtn1,mainBtn2,mainBtn3底部的三个一级菜单。
         */

       /* ComplexButton mainBtn1 = new ComplexButton();
        mainBtn1.setName("生活助手");
        //一级下有4个子菜单
        mainBtn1.setSub_button(new CommonButton[] { btn11, btn12, btn13, btn14 });

        ComplexButton mainBtn2 = new ComplexButton();
        mainBtn2.setName("休闲驿站");
        mainBtn2.setSub_button(new CommonButton[] { btn21, btn22, btn23, btn24, btn25 });


        ComplexButton mainBtn3 = new ComplexButton();
        mainBtn3.setName("更多体验");
        mainBtn3.setSub_button(new CommonButton[] { btn31, btn32, btn33 });*/


        /**
         * 封装整个菜单
         */
        Menu menu = new Menu();
        menu.setButton(new BaseButton[] { btn11, btn12, btn13 });

        return menu;
    }
}
