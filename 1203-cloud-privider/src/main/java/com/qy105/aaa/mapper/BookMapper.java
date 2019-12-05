package com.qy105.aaa.mapper;

import model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author AI
 * @title: BookMapper
 * @projectName 1129-dubbo
 * @description: TODO
 * @date 2019/11/2911:18
 */
@Mapper
public interface BookMapper {
    /**
     * 获取所有书籍
     * @return
     */
    @Select("select * from book_info")
    List<BookInfo> getAllBook();
}
