package com.service.Impl;

import com.controller.Code;
import com.dao.BookDao;
import com.domain.Book;
import com.exception.BusinessException;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book getById(Integer id) {
        if(id==1){
            throw new BusinessException(Code.BUSINESS_ERR,"caonima");
        }
        return bookDao.getById(id);
    }
}
