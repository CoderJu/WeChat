package com.wechat.service.impl;

import com.wechat.mapper.BookMapper;
import com.wechat.model.book.Book;
import com.wechat.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * 类名：BookServiceImpl
 * 开发人员: Ju
 * 创建时间: 2018/7/15 16:20
 * 描述:
 * 版本：V1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> searchBookByCategory(String cid) {
        return bookMapper.searchBookByCategory(cid);
    }

    @Override
    public List<Book> searchBookByName(Book book) {
        return bookMapper.searchBookByName(book);
    }
}
