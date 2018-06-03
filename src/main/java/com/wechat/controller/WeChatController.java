package com.wechat.controller;

import com.wechat.Util.AdvancedUtil;
import com.wechat.Util.PropertyUtil;
import com.wechat.Util.WeChatUtil;
import com.wechat.model.web.SNSUserInfo;
import com.wechat.model.web.WeChatOauth2Token;
import com.wechat.service.WeChatService;
import com.wechat.token.TokenThread;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * 类名：WeChatBaseController
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:24
 * 描述: 微信核心消息处理器
 * 版本：V1.0
 */
@Controller
@RequestMapping(value = "/core")
public class WeChatController {

    private static Logger logger = Logger.getLogger(WeChatController.class);

    @Autowired
    private WeChatService weChatService;
    /**
     * 确认请求来自微信服务器
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String doGet(@RequestParam(name = "signature" ,required = false) String signature  ,
                      @RequestParam(name = "nonce",required = false) String  nonce ,
                      @RequestParam(name = "timestamp",required = false) String  timestamp ,
                      @RequestParam(name = "echostr",required = false) String  echostr ) throws ServletException, IOException {
        logger.info("signature:"+signature+"||timestamp:"+timestamp+"||nonce:"+nonce+"||echostr:"+echostr);
        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if (WeChatUtil.checkSignature(signature, timestamp, nonce)) {
            logger.info("接入成功");
           return echostr;
        }
        logger.info("接入失败");
        return "";
    }

    /**
     * 处理微信服务器发来的消息
     */
    @RequestMapping(method = RequestMethod.POST)
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String accessToken = TokenThread.accessToken.getAccessToken();
        // 调用核心业务类接收消息、处理消息
        String respXml = weChatService.processRequest(request,accessToken);
        logger.info("respXml>>"+respXml+"||"+ TokenThread.accessToken.getAccessToken());
        PrintWriter out = response.getWriter();
        out.print(respXml);
        out.close();
    }



}
