package com.graphql.StudentWithGraphQl;

import com.graphql.StudentWithGraphQl.services.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentWithGraphqlApplication  {


    public static void main(String[] args) {
        SpringApplication.run(StudentWithGraphqlApplication.class, args);
    }


}
