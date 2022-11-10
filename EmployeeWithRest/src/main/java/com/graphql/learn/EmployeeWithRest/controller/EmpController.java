package com.graphql.learn.EmployeeWithRest.controller;

import com.graphql.learn.EmployeeWithRest.entity.Employee;
import com.graphql.learn.EmployeeWithRest.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService service;

    //create emp
   @PostMapping
public Employee create(@RequestBody  Employee e){
    return this.service.createEmp(e);
}
    //get all
    @GetMapping
public List<Employee> getAllEmpData(){
       return this.service.getAllEmp();
}
    //get single
    @GetMapping("/{id}")
    public Employee getEmp(@PathVariable  int emp_id){
       return this.service.getSingleEmp(emp_id);
    }
}
