package com.xiezirui.dao;

import com.xiezirui.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookMapper {
    int addOneBook(Book book);
    int deleteOneBookById(@Param("bookID") int id);
    int updataOneBook(Book book);
    Book seleteOneBookById(@Param("bookID") int id);
    List<Book> seleteAllBooks();
    Book seleteOneBookByName(@Param("bookName") String bookName);
}
