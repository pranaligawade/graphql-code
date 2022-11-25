package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import com.example.demo.Dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;


@Component
@Validated
public class UserMutation implements GraphQLMutationResolver {
    @Autowired
    private UserService userService;

    public UserDto create_User(@Valid UserDto  userDto){
        return this.userService.createUser(userDto);
    }
    public  UserDto update_User(@Valid UserDto userDto,Integer user_id){
        return  this.userService.updateUser(userDto,user_id);
    }
     public  Integer   delete_User(Integer user_id){

        this.userService.deleteUser(user_id);
        return user_id;
     }


}
