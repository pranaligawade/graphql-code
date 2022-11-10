package com.graphql.BookWithGraphql.Repo;

import com.graphql.BookWithGraphql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Book_Repo extends JpaRepository<Book, Integer> {
}
