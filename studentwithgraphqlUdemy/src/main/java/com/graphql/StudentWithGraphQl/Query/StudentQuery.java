package com.graphql.StudentWithGraphQl.Query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.StudentWithGraphQl.entity.Student;
import com.graphql.StudentWithGraphQl.request.StudentRequest;
import com.graphql.StudentWithGraphQl.response.StudentResponse;
import com.graphql.StudentWithGraphQl.services.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public class StudentQuery implements GraphQLQueryResolver {
@Autowired
    private StudService service;
    public String firstQuery() {
        return "first query";
    }

    public String secondQuery() {
        return "second query";
    }

    //public  String fullname(String fname,String lname){
//        return fname+" "+lname;
//}
    public String fullname(StudentRequest request) {
        return request.getFname() +" "+ request.getLname();
    }

    public StudentResponse student(int id){
        return new StudentResponse(service.getStudentById(id));
    }

}