package com.wechat.controller;

import com.wechat.model.book.Category;
import com.wechat.service.CategoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：CategoryController
 * 开发人员: Ju
 * 创建时间: 2018/7/14 16:09
 * 描述:图书目录控制类
 * 版本：V1.0
 */
@Controller
public class CategoryController {

    private static Logger logger = Logger.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/showAllCategory" ,method = RequestMethod.GET)
    public String showAllCategory(Model model){
        List<Category> categorys = categoryService.showAllCategory();
        System.out.print("categorys>>>>"+categorys);
        model.addAttribute("categorys",categorys);
        return "category/category";
    }
}
