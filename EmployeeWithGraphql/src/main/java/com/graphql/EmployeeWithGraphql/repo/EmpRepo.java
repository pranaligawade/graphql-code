package com.graphql.EmployeeWithGraphql.repo;

import com.graphql.EmployeeWithGraphql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
}
