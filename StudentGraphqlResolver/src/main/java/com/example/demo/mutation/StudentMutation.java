package com.example.demo.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.entity.StudentGraphql;
import com.example.demo.request.StudentRequest;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentMutation implements GraphQLMutationResolver {
    @Autowired
    private StudentService service;

    public StudentGraphql createStu(StudentRequest request){
        return this.service.createStudent(request);
    }
    public  StudentGraphql update(Integer id,StudentRequest request){
        StudentGraphql s=new StudentGraphql();
        s.setId(request.getId());
        s.setF_name(request.getF_name());
        s.setL_name(request.getL_name());
        s.setCity(request.getCity());
       return this.service.update(id,s);
    }

}
