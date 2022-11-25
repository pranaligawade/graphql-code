package com.example.demo.Dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class UserDto {
    @NotNull

    private int user_id;
    @NotEmpty
    private  String name;
    @NotEmpty

    private  String email;
    @NotEmpty
    @Pattern(regexp ="[A-Za-z0-9]{1,20}", message = "error in pass pattern")
    private  String pass;
    @NotEmpty @Pattern(regexp ="[A-Za-z ]{1,20}", message = "error in about pattern")
    private  String about;
}
