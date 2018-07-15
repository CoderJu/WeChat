package com.wechat.service.impl;

import com.wechat.mapper.CategoryMapper;
import com.wechat.model.book.Category;
import com.wechat.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：CategoryServiceImpl
 * 开发人员: Ju
 * 创建时间: 2018/7/14 16:12
 * 描述:
 * 版本：V1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> showAllCategory() {
        return categoryMapper.showAllCategory();
    }
}
