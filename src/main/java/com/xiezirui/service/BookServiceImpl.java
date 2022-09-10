package com.xiezirui.service;


import com.xiezirui.dao.BookMapper;
import com.xiezirui.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addOneBook(Book book) {
        return bookMapper.addOneBook(book);
    }

    public int deleteOneBookById(int id) {
        return bookMapper.deleteOneBookById(id);
    }

    public int updataOneBook(Book book) {
        return bookMapper.updataOneBook(book);
    }

    public Book seleteOneBookById(int id) {
        return bookMapper.seleteOneBookById(id);
    }

    public List<Book> seleteAllBooks() {
        return bookMapper.seleteAllBooks();
    }

    public Book seleteOneBookByName(String bookName) {
        return bookMapper.seleteOneBookByName(bookName);
    }
}
