package com.graphql.EmployeeWithGraphql.services;

import com.graphql.EmployeeWithGraphql.entity.Employee;
import com.graphql.EmployeeWithGraphql.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepo emp_Repo;

    public Employee createEmp(Employee employee) {
        return this.emp_Repo.save(employee);
    }

    public List<Employee> getAllEmp() {
        return this.emp_Repo.findAll();
    }

    public Employee getSingleEmp(int id) {
        return this.emp_Repo.findById(id).orElseThrow(() -> new RuntimeException("employee not found"));
    }

    @Autowired
    public EmpService(EmpRepo empRepo) {
        this.emp_Repo = empRepo;
    }
}
