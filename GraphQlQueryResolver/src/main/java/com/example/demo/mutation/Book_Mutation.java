package com.example.demo.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.entity.Book;
//import com.example.demo.input.BookInput;

import com.example.demo.input.BookInput;
import com.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book_Mutation implements GraphQLMutationResolver {

    @Autowired
    private BookService bookService;
//    public  Book createBook1( Book book){
//        return this.bookService.create_Book(book);
//    }
public  Book createBook1( BookInput book){
      return this.bookService.create_Book(book);
    }
     public Book update(Integer id, BookInput bookInput){
        Book b= new Book();
        b.setId(bookInput.getId());
        b.setTitle(bookInput.getTitle());
        b.setAuthor(bookInput.getAuthor());
        b.setPrice(bookInput.getPrice());

     return this.bookService.updateBook(id,b);
     }
//    public Book update(Integer id, Book bookInput){
//        return this.bookService.updateBook(id,bookInput);
//    }

     public  Book delete(Integer id){
        return this.bookService.deleteBook(id);
    }
}
