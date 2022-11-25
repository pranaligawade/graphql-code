package com.example.demo.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "User_G")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private int user_id;
    private  String name;
    private  String email;
    private  String pass;
    private  String about;
    @OneToMany(mappedBy = "user",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Post> postList;
}
