package com.graphql.StudentWithGraphQl.response;

import com.graphql.StudentWithGraphQl.entity.Subject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectResponse {
    private  int id;
    private String subjectName;

    public SubjectResponse(Subject subject) {




    }
}

