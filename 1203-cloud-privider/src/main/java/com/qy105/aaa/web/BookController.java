package com.qy105.aaa.web;

import model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BookService;

import java.util.List;

/**
 * @author AI
 * @title: BookController
 * @projectName 1202-cloud
 * @description: TODO
 * @date 2019/12/210:02
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    private int i = 1;
    @GetMapping("getAllBook")

    public List<BookInfo> getAllBook() {
        List<BookInfo> allBook = bookService.getAllBook();
        if (null == allBook) {
            return null;
        }
        for (BookInfo bookInfo : allBook) {
            System.out.println(bookInfo);
        }
//        if (++i % 2 == 0) {
//            throw new IllegalArgumentException("服务出错了");
//            try {
//                Thread.sleep(15000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        return allBook;
    }
}
