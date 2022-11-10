package com.example.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentGraphql {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String f_name;
    private String L_name;
    private  String city;
}
