package com.example.demo.service;
import com.example.demo.entity.StudentGraphql;
import com.example.demo.repo.StudentRepo;
import com.example.demo.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
@Service
public class StudentService{
    @Autowired
    private StudentRepo studentRepo;

    public List<StudentGraphql> allStudent(){
        return studentRepo.findAll();
    }
    public  StudentGraphql getStudent(Integer id){
     return  this.studentRepo.findById(id).orElseThrow(()->new RuntimeException(" student not found"));
    }
    public  StudentGraphql save(StudentGraphql s){
        return this.studentRepo.save(s);
    }

    public  StudentGraphql createStudent(StudentRequest studentGraphql){
        StudentGraphql s= new StudentGraphql();
        s.setId(studentGraphql.getId());
        s.setF_name(studentGraphql.getF_name());
        s.setL_name(studentGraphql.getL_name());
        s.setCity(studentGraphql.getCity());
        return this.studentRepo.save(s);
    }
      public  StudentGraphql update(Integer id,StudentGraphql s){
        StudentGraphql  s1= this.studentRepo.findById(id).orElseThrow(()->new RuntimeException("student not in db"));
          s1.setId(s.getId());
          s1.setF_name(s.getF_name());
          s1.setL_name(s.getL_name());
          s1.setCity(s.getCity());
          return this.studentRepo.save(s1);
}
}
