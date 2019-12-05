package com.qy105.aaa.web;


import com.qy105.aaa.service.BookService;
import model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author AI
 * @title: FeignBookController
 * @projectName 1202-cloud
 * @description: TODO
 * @date 2019/12/211:34
 */
@RestController
public class FeignBookController {
    @Autowired
    private BookService bookService;
    @GetMapping("FeignGetAllBook")
    public List<BookInfo> getAllBook() {
        List<BookInfo> allBook = bookService.getAllBook();
        System.out.println("feign" +allBook.size());
        return allBook;
    }
}
