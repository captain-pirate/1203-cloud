package com.qy105.aaa.service;

import model.BookInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author AI
 * @title: BookService
 * @projectName 1202-cloud
 * @description: TODO
 * @date 2019/12/211:31
 */
@FeignClient(value = "provider-server",fallback = BookServiceHystrixlImpl.class)//调用服务
public interface BookService {
    /**
     * 拿到所有书籍
     * @return
     */
    @GetMapping("/getAllBook")//调用服务下的方法
    List<BookInfo> getAllBook();
}
