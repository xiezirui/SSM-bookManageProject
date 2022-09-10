package com.xiezirui.service;

import com.xiezirui.dao.BookMapper;
import com.xiezirui.pojo.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookServiceImpl = context.getBean("bookServiceImpl", BookService.class);

        for (Book books : bookServiceImpl.seleteAllBooks()) {
            System.out.println(books);
        }

    }

}
