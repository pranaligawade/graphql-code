package com.graphql.EmployeeWithGraphql.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "project_employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int empcode;
    private String address;
}
