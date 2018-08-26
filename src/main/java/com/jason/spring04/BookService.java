package com.jason.spring04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-24
 */
@Service("bookservice")
public class BookService {

    @Autowired
    IBookDao bookDao;

    public void addNewBook(){
        String bookname = "spring123";
        bookDao.save(bookname);
    }
}
