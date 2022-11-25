package com.graphql.EmployeeWithGraphql;

import com.graphql.EmployeeWithGraphql.entity.Employee;
import com.graphql.EmployeeWithGraphql.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeWithGraphqlApplication implements CommandLineRunner {
    @Autowired
    private EmpService empService;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeWithGraphqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee e = new Employee(2, "pranali", 2323, "ahmednager");
        Employee e2 = new Employee(12, "pratu", 21324, "djsafusafsfjdhfsajtduyfgsdf");
        Employee e4 = new Employee(3, "tanu", 2133, "sahffkusdd");
        Employee e3 = new Employee(4, "janu", 1324, "dhgadjdsd");
        Employee e6 = new Employee(15, "anand", 23214324, "djsafusahjdsfjdfsgfffsfjdhfsajtduyfgsdf");
        empService.createEmp(e6);
        empService.createEmp(e);
        empService.createEmp(e4);
        empService.createEmp(e3);
        empService.createEmp(e2);
    }
}
