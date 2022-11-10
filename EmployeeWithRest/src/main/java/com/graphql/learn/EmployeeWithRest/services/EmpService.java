package com.graphql.learn.EmployeeWithRest.services;

import com.graphql.learn.EmployeeWithRest.entity.Employee;
import com.graphql.learn.EmployeeWithRest.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;
  public   Employee createEmp(Employee employee){
        return this.empRepo.save(employee);
    }
    public List<Employee> getAllEmp(){
      return this.empRepo.findAll();
    }
    public  Employee getSingleEmp(int id){
      return this.empRepo.findById(id).get();
    }
 @Autowired
    public EmpService(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }
}
