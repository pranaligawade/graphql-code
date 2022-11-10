package com.example.demo;

import com.example.demo.entity.Book;
//import com.example.demo.input.BookInput;
import com.example.demo.input.BookInput;
import com.example.demo.services.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class GraphQLWithSpringBootApplication
		implements CommandLineRunner
{


	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQLWithSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Book book=new Book(1,"I am noob","anand",50);
//	 BookInput bookInput= new BookInput();
//	 bookInput.setAuthor("tanu");
//	 bookInput.setPrice(124);
////		this.bookService.create_Book(book);
//		this.bookService.create_Book(bookInput);

	}
}
