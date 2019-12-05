package com.qy105.aaa.service;

import com.qy105.aaa.mapper.BookMapper;
import model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BookService;

import java.util.List;

/**
 * @author AI
 * @title: BookServiceImpl
 * @projectName 1129-dubbo
 * @description: TODO  Service注解暴露服务
 * @date 2019/11/2911:16
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookInfo> getAllBook() {
        List<BookInfo> bookInfos = bookMapper.getAllBook();

        if (null==bookInfos) {
            return null;
        }
        return bookInfos;
    }
}
