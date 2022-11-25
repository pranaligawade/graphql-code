package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.Dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public  class UserQuery implements GraphQLQueryResolver {
    @Autowired
    private UserService userService;
    public List<UserDto> get_All(){
        return this.userService.getAllUser();
    }
    public  UserDto get_user(Integer user_id){
        return  this.userService.getByIdUser(user_id);
    }
}
