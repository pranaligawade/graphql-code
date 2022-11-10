package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "bank_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
     private  String title;
     private  String author;
     private  float price;

}
