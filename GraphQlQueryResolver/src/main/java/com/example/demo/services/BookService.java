package com.example.demo.services;

import com.example.demo.entity.Book;
import com.example.demo.input.BookInput;
import com.example.demo.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo repo;

    public List<Book> allBook() {
        return this.repo.findAll();
    }

    public Book getBook(int book_id) {
        return this.repo.findById(book_id).orElseThrow(() -> new RuntimeException("book not available"));
    }

//    public Book create_Book(Book book) {
//        return this.repo.save(book);
//    }
     public  Book create_Book(BookInput bookInput){
        Book book= new Book();
        book.setId(bookInput.getId());
        book.setPrice(bookInput.getPrice());
        book.setAuthor(bookInput.getAuthor());
        book.setTitle(bookInput.getTitle());
         return this.repo.save(book);
     }

    public Book updateBook(Integer id, Book book) {
        Book bookDB = this.repo.findById(id).orElseThrow(() -> new RuntimeException("Not in db"));
        bookDB.setTitle(book.getTitle());
        bookDB.setAuthor(book.getAuthor());
        bookDB.setPrice(book.getPrice());
        return this.repo.save(bookDB);
    }



    public Book deleteBook(Integer id) {
        Book book1 = this.repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found in db"));
        this.repo.delete(book1);
        return book1;
    }
}
