package com.graphql.StudentWithGraphQl.services;


import com.graphql.StudentWithGraphQl.Repo.StudentREpo;
import com.graphql.StudentWithGraphQl.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudService {
    @Autowired
private StudentREpo studentREpo;

public Student getStudentById(int id){
    return studentREpo.findById(id).get();
}


}
