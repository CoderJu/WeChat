package com.wechat.controller;

import com.wechat.model.User;
import com.wechat.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by User on 2018/5/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/select/{id}",method = RequestMethod.GET)
    public String selectUser(@PathVariable Integer id){
        logger.info("id>>>>>>>"+id);
        User user = userService.selectUser(id);
        logger.info("user++"+user);
        return "index";
    }
}
