package com.wechat.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * 类名：MessageController
 * 开发人员: Ju
 * 创建时间: 2018/7/15 13:45
 * 描述:
 * 版本：V1.0
 */
@Controller
public class MessageController {

    private static Logger logger = Logger.getLogger(CategoryController.class);

    @RequestMapping(value = "msg",method = RequestMethod.GET)
    public String ShowMsg(){
        return "common/msg";
    }
}
