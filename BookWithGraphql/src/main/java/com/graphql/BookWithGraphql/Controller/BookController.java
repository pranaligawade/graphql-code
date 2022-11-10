package com.graphql.BookWithGraphql.Controller;

import com.graphql.BookWithGraphql.entity.Book;
import com.graphql.BookWithGraphql.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

//all commented using rest mapping
//@RestController
//@RequestMapping("/books")
@Controller
public class BookController {
    @Autowired
    private BookService service;

    //    @PostMapping
//public Book create(@RequestBody Book book) {
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book b = new Book();
        b.setTitle((book.getTitle()));
        b.setAuthor(book.getAuthor());
        b.setPages(book.getPages());
        b.setDescription(book.getDescription());
        b.setPrice(book.getPrice());

        return this.service.create(b);
    }

//    @GetMapping

    @QueryMapping("allBook") //data getting
    public List<Book> getall() {
        return this.service.getAllBook();
    }

    //    @GetMapping("/{id}")
//    public Book get(@PathVariable Integer id) {
    @QueryMapping("getBook")
    public Book get(@Argument Integer id) {
        return this.service.getBYId(id);
    }

    @Getter
    @Setter

   private static class BookInput {
        private String title;
        private String Description;
        private double price;
        private String author;
        private int pages;
    }
}
