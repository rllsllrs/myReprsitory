package com.service;

import com.dao.BookDao;
import com.domain.Book;
import com.service.BookService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTest {

    @Autowired
    private BookService bookService;

    @Test
    public void test1() {
        Book book = bookService.getById(2);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> bookList=bookService.getAll();
        System.out.println(bookList);
    }
}
