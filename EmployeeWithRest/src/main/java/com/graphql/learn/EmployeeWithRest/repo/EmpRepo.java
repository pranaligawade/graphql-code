package com.graphql.learn.EmployeeWithRest.repo;

import com.graphql.learn.EmployeeWithRest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
}
