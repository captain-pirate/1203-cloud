package service;

import model.BookInfo;

import java.util.List;

/**
 * @author AI
 * @title: BookService
 * @projectName 1129-dubbo
 * @description: TODO
 * @date 2019/11/2911:00
 */
public interface BookService {
    /**
     * 公共接口，拿到所有书籍
     * @return
     */
    List<BookInfo> getAllBook();
}
