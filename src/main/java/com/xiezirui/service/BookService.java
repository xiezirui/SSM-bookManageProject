package com.xiezirui.service;

import com.xiezirui.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addOneBook(Book book);
    int deleteOneBookById(int id);
    int updataOneBook(Book book);
    Book seleteOneBookById(int id);
    List<Book> seleteAllBooks();
    Book seleteOneBookByName(String bookName);
}
