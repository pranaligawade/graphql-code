package com.graphql.BookWithGraphql.services;


import com.graphql.BookWithGraphql.Repo.Book_Repo;
import com.graphql.BookWithGraphql.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private Book_Repo book_repo;

    //create
    public Book create(Book book) {
        return this.book_repo.save(book);
    }

    public List<Book> getAllBook() {
        return this.book_repo.findAll();
    }

    public Book getBYId(int id) {
        return this.book_repo.findById(id).orElseThrow(() -> new RuntimeException("book is not availble  in db"));
    }

}
