package com.example.demo.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.StudentGraphql;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentQuery implements GraphQLQueryResolver {
    @Autowired
    private StudentService service;
public List<StudentGraphql>allStudent(){
    return this.service.allStudent();
}
public  StudentGraphql getStudent(Integer id){
    return  this.service.getStudent(id);
}
public  StudentGraphql save(StudentGraphql s){
    return  this.service.save(s);
}
}
