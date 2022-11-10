package com.example.demo.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.Book;
import com.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Book_Query implements GraphQLQueryResolver {
    @Autowired
    private BookService bookService;

     public List<Book> getAllBook(){
         return this.bookService.allBook();
     }
     public  Book getBook(int book_id){
         return this.bookService.getBook(book_id);
     }
}
