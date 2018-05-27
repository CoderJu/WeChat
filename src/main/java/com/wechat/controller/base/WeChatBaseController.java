package com.wechat.controller.base;

import com.wechat.Util.WeChatUtil;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 2018/5/27.
 */
@Controller
@RequestMapping("/base")
public class WeChatBaseController {

    /**
     * 确认请求来自微信服务器
     */
    @RequestMapping("/get")
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");

        PrintWriter out = response.getWriter();

        System.out.println(signature);
        System.out.println(timestamp);
        System.out.println(nonce);
        System.out.println(echostr);

        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if (WeChatUtil.checkSignature(signature, timestamp, nonce))
        {
            out.print(echostr);
        }

        out.close();
        out = null;
    }

    /**
     * 处理微信服务器发来的消息
     */
    @RequestMapping("/post")
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // TODO 消息的接收、处理、响应
        System.out.println("接口调用了一次");

        String ret = IOUtils.toString(request.getInputStream(), "utf-8").toString();
        System.out.println("======"+ret);

       // WeChatMsgBL tWeChatMsgBL = new WeChatMsgBL();
       // String result = tWeChatMsgBL.dealWechatMsg(ret);

        response.setCharacterEncoding("UTF-8");

        // 返回文本消息，将处理结果返回
        PrintWriter out = response.getWriter();

        //System.out.println(result);

        //out.print(result);

        out.close();

    }

}
