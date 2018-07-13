package com.wechat.controller;

import com.wechat.model.user.WeChatUserInfo;
import com.wechat.model.web.SNSUserInfo;
import com.wechat.service.SNSUserService;
import com.wechat.service.WeChatService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * 类名：RegisterController
 * 开发人员: Ju
 * 创建时间: 2018/7/13 21:29
 * 描述: 注册用户基本信息类
 * 版本：V1.0
 */
@Controller
public class RegisterController {
    private static Logger logger = Logger.getLogger(RegisterController.class);
    @Autowired
    private SNSUserService snsUserService;
    @Autowired
    private WeChatService weChatService;

    @RequestMapping( value = "/updatePersonalInfo" ,method = RequestMethod.POST)
    public String updatePersonalInfo(@RequestParam(value="openid",required=true) String openid,
                                     @RequestParam(name = "lastname",required = false) String  lastname ,
                                     @RequestParam(name = "tel",required = false) String  tel, Model model ){
        logger.info("注册参数：openid："+openid+"||姓名:"+lastname+"||手机号码:"+tel);
        SNSUserInfo snsUserInfo = new SNSUserInfo();
        snsUserInfo.setOpenid(openid);
        snsUserInfo.setLastname(lastname);
        snsUserInfo.setTelephone(tel);
        snsUserService.updateTelAndLastName(snsUserInfo);

        WeChatUserInfo weChatUserInfo = new WeChatUserInfo();
        weChatUserInfo.setOpenid(openid);
        weChatUserInfo.setLastname(lastname);
        weChatUserInfo.setTelephone(tel);
        weChatUserInfo.setPersonal(1);
        weChatService.updateTelAndLastName(weChatUserInfo);
        model.addAttribute("register","1");
        return "personal";
    }
}
