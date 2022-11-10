package com.graphql.StudentWithGraphQl.response;

import com.graphql.StudentWithGraphQl.entity.Student;
import com.graphql.StudentWithGraphQl.entity.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class StudentResponse {
    private  int id;
    private String name;
    private  String city;
    private  String Street;
private List<SubjectResponse> learnsubj;
    public StudentResponse(Student student) {
        this.id =student.getId();
        this.name = student.getName();
        this.city = student.getSAddress().getCity();
       this.Street =student.getSAddress().getStreet();

//       if (student.getSubject()!=null){
//           learnsubj=new ArrayList<SubjectResponse>();
//           for (Subject subject:student.getSubject()){
//               learnsubj.add(new SubjectResponse(subject));
//           }
//       }
    }

}
