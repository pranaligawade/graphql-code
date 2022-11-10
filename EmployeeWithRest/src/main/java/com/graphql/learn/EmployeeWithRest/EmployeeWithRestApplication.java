package com.graphql.learn.EmployeeWithRest;

import com.graphql.learn.EmployeeWithRest.entity.Employee;
import com.graphql.learn.EmployeeWithRest.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeWithRestApplication implements CommandLineRunner {
@Autowired
	private EmpService empService;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeWithRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e= new Employee(2,"pranali",2323,"ahmednager");
		Employee e4= new Employee(3,"tanu",2133,"sahffku");
		Employee e3= new Employee(4,"jani",1324,"dhgadj");
        Employee  e2=  new Employee( 12,"dahfsk0",21324,"djsafusafsfjdhfsajtduyfgsdf");
		Employee  e6=  new Employee( 15,"fdsfhdshf",23214324,"djsafusahjdsfjdfsgfffsfjdhfsajtduyfgsdf");
        empService.createEmp(e6);
		empService.createEmp(e);
		empService.createEmp(e4);
		empService.createEmp(e3);
        empService.createEmp(e2);
	}
}
