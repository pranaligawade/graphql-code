package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int post_id;
    private String title;
    private  String content;
    private Date addDate;
    private  String imgName;
   @ManyToOne
   @JsonIgnore
   @JoinColumn(name ="category_id")
    private  Category category;
   @ManyToOne
   @JsonIgnore
    private  User user;
}
