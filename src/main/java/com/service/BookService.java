package com.service;

import com.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

    public List<Book> getAll();

    public Book getById(Integer id);
}
