package com.wechat.mapper;

import com.wechat.model.book.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：BookMapper
 * 开发人员: Ju
 * 创建时间: 2018/7/15 16:21
 * 描述:
 * 版本：V1.0
 */
public interface BookMapper {

    List<Book> searchBookByCategory(String cid) ;
}
