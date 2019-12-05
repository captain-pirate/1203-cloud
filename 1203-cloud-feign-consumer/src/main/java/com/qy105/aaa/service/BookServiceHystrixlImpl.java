package com.qy105.aaa.service;

import model.BookInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author AI
 * @title: BookServiceHystrixlImpl
 * @projectName 1203-cloud
 * @description: TODO
 * @date 2019/12/314:25
 */
@Service
public class BookServiceHystrixlImpl implements BookService {
    @Override
    public List<BookInfo> getAllBook() {
        System.out.println("服务降级中");
        return null;
    }
}
