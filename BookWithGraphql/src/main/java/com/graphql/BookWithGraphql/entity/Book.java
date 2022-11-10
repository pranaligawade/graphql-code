package com.graphql.BookWithGraphql.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "project_book_jpa")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
 private String title;
 private String Description;
 private double price;
 private String author;
 private int pages;

}
