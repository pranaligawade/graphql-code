package com.graphql.BookWithGraphql;

import com.graphql.BookWithGraphql.entity.Book;
import com.graphql.BookWithGraphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookWithGraphqlApplication implements CommandLineRunner {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookWithGraphqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book b1 = new Book();
        b1.setTitle("complete reference");
        b1.setDescription("for learning java");
        b1.setPrice(123344.1);
        b1.setPages(2000);
        b1.setAuthor("james gosling");

        Book b2 = new Book();
        b2.setTitle("thing reference");
        b2.setDescription("for learning java");
        b2.setPrice(5424.1);
        b2.setPages(4100);
        b2.setAuthor("james dsad gosling");

        Book b3 = new Book();
        b3.setTitle("thing python");
        b3.setDescription("for learning python");
        b3.setPrice(554.1);
        b3.setPages(4100);
        b3.setAuthor(" gosling");

        this.bookService.create(b1);
        this.bookService.create(b2);
        this.bookService.create(b3);
    }
}
