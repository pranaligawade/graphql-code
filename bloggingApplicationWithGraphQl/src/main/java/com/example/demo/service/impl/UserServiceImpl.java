package com.example.demo.service.impl;

import com.example.demo.Dto.UserDto;
import com.example.demo.Entities.User;
import com.example.demo.Repositories.UserRepo;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto getByIdUser(Integer user_id) {
        User user=this.userRepo.findById(user_id).orElseThrow(()->new ResourceNotFoundException("User","user id",user_id));
        return this.modelMapper.map(user,UserDto.class);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> user = this.userRepo.findAll();
        List<UserDto> userDtos = user.stream().map((users) -> this.modelMapper.map(users, UserDto.class)).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user=this.modelMapper.map(userDto,User.class);
        User user1=this.userRepo.save(user);
        return this.modelMapper.map(user1,UserDto.class);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer user_id) {
        User user= this.userRepo.findById(user_id).orElseThrow(()->new ResourceNotFoundException("User","user id",user_id));
        user.setUser_id(userDto.getUser_id());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPass(userDto.getPass());
        user.setAbout(userDto.getAbout());
        User user1=this.userRepo.save(user);
        return this.modelMapper.map(user1,UserDto.class);
    }

    @Override
    public void deleteUser(Integer user_id) {
    User user=this.userRepo.findById(user_id).orElseThrow(()->new ResourceNotFoundException("User","user id",user_id));
    this.userRepo.delete(user);

    }
}
