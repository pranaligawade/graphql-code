package com.example.demo.service;

import com.example.demo.Dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getByIdUser(Integer user_id);

   List<UserDto> getAllUser();

    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto, Integer user_id);

    void deleteUser(Integer user_id);

}
