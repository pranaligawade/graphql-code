package com.graphql.StudentWithGraphQl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter

public class Subject {
    @Id
    private int id;
    private  String sub_name;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
