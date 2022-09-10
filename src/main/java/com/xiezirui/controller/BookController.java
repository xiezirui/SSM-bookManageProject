package com.xiezirui.controller;

import com.xiezirui.pojo.Book;
import com.xiezirui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/all")
    public String seleteAllBooks(Model model){

        List<Book> books = bookService.seleteAllBooks();

        model.addAttribute("books",books);

        return "all";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBooks(Book book){
        bookService.addOneBook(book);

        return "redirect:/book/all";
    }

    @RequestMapping("/toUpdata/{id}")
    public String toUpdata(@PathVariable int id,Model model){

        Book book = bookService.seleteOneBookById(id);

        model.addAttribute("book",book);

        return "updataBook";
    }

    @PostMapping("/updataBooks")
    public String upadataBooks(Book book){

        int i = bookService.updataOneBook(book);

        System.out.println(i);

        return "redirect:/book/all";
    }

    @RequestMapping("/deleteBooks/{id}")
    public String deleteBook(@PathVariable int id){

        bookService.deleteOneBookById(id);

        return "redirect:/book/all";
    }

    @PostMapping("/seleteOne")
    public String seleteOneBookByName(String bookName,Model model){

        Book book = bookService.seleteOneBookByName(bookName);

        //判断传入的book是否为空
        if (book == null){
            List<Book> books = new ArrayList<Book>();
            model.addAttribute("info","未找到书籍");
            model.addAttribute("books",bookService.seleteAllBooks());
        }else {
            List<Book> books = new ArrayList<Book>();
            books.add(book);
            model.addAttribute("books",books);
        }

        return "all";
    }
}
