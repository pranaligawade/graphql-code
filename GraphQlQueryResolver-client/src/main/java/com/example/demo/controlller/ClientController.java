package com.example.demo.controlller;

import com.example.demo.input.BookInput;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/api/book")
public class ClientController {
    @Autowired
    ClientService clientService;
    @GetMapping("ap/{id}")
public Book getBook(@PathVariable Integer id){
        return this.clientService.getBook(id);
    }
    @PostMapping("/create")
public  Book create_book(
        @RequestBody BookInput input
        ){
        return clientService.create_book(input);
}
}
