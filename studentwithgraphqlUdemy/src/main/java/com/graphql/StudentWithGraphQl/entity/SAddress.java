package com.graphql.StudentWithGraphQl.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class SAddress {
    @Id
    private  int add_id;
    private  String city;
    private  String Street;
}
