package com.yc.springcloud81.misconsumer.service;

import com.yc.springcloud81.misconsumer.bean.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    public Book getBook(int id);
}
