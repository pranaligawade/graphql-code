package com.example.demo.repo;

import com.example.demo.entity.StudentGraphql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentGraphql,Integer> {
}
