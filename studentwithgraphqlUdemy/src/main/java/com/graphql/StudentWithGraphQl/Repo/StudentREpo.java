package com.graphql.StudentWithGraphQl.Repo;

import com.graphql.StudentWithGraphQl.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentREpo extends JpaRepository<Student,Integer> {
}
