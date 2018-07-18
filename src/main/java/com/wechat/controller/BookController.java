package com.wechat.controller;

import com.wechat.model.book.Book;
import com.wechat.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：BookController
 * 开发人员: Ju
 * 创建时间: 2018/7/15 16:14
 * 描述: 图书入口
 * 版本：V1.0
 */
@Controller
public class BookController {

    private static Logger logger = Logger.getLogger(BookController.class);


    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/searchBookByCategory")
    public String searchBookByCategory(@RequestParam(value="cid",required=true) String cid, Model model){
       List<Book> books =  bookService.searchBookByCategory(cid);
       model.addAttribute("books",books);
       model.addAttribute("cid",cid);
       return "book/book";
    }

    @RequestMapping(value = "/searchBookByName",method = RequestMethod.GET)
    public String searchBookByName(
            @RequestParam(value="cid",required=true) String cid,
            @RequestParam(value="searchInput",required=true) String bname, Model model){
            Book book = new Book();
            book.setCid(cid);
            book.setBname(bname);
            List<Book> books =  bookService.searchBookByName(book);
            model.addAttribute("books",books);
            model.addAttribute("cid",cid);
            return "book/book";
    }

    @RequestMapping(value = "/searchBookByBid" ,method = RequestMethod.GET)
    public String searchBookByBid(@RequestParam(value = "bid",required = true) Integer bid ,Model model){
        Book book = bookService.searchBookByBid(bid);
        System.out.println(book);
        model.addAttribute("book",book);
        return "book/bookDetial";
    }
}
