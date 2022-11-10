package com.graphql.StudentWithGraphQl.Repo;

import com.graphql.StudentWithGraphQl.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectREpo extends JpaRepository<Subject,Integer> {
}
