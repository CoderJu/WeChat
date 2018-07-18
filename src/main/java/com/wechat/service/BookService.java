package com.wechat.service;/**
 * Created by User on 2018/7/15.
 */

import com.wechat.model.book.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：BookService
 * 开发人员: Ju
 * 创建时间: 2018/7/15 16:20
 * 描述:
 * 版本：V1.0
 */
public interface BookService {
    List<Book> searchBookByCategory(String cid);

    List<Book> searchBookByName(Book book);

    Book searchBookByBid(Integer bid);
}
