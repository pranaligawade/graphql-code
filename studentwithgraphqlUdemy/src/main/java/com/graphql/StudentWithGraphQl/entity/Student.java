package com.graphql.StudentWithGraphQl.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

@Table(name = "graphql_Student")
public class Student {
    @Id
 private  int id;
 private String name;
 @OneToOne
 @JoinColumn(name = "add_id")
 private  SAddress sAddress;
// @OneToMany(mappedBy = "student")
// private  Subject subject;
}
