package com.graphql.EmployeeWithGraphql.controller;

import com.graphql.EmployeeWithGraphql.entity.Employee;
import com.graphql.EmployeeWithGraphql.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService service;

    //create emp
public Employee create(@RequestBody Employee e){
    return this.service.createEmp(e);
}
    //get all
    @QueryMapping("allEmp")
public List<Employee> getAllEmpData(){
       return this.service.getAllEmp();
}
    //get single
@QueryMapping("getEmp")
    public Employee getEmp(@Argument int emp_id){
       return this.service.getSingleEmp(emp_id);
    }
}
