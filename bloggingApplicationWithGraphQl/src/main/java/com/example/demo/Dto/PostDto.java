package com.example.demo.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class PostDto {

    @NotEmpty
    @NotEmpty @Pattern(regexp ="[0-9]{1,20}", message = "error in post_id pattern")

    private int post_id;


    @NotEmpty @Pattern(regexp ="[A-Za-z ]{1,20}", message = "error in title pattern")
    private String title;
    @Size(min = 4,message = "pls enter minimum 4 characters")

    @NotEmpty @Pattern(regexp ="[A-Za-z ]{1,20}", message = "error in content pattern")
    private String content;
    @NotEmpty
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(locale = JsonFormat.DEFAULT_LOCALE)
    private Date addDate;
    @NotEmpty
    private String imgName;
  @NotEmpty
  @JsonIgnore
    private CatDto catDto;
  @NotNull
    private UserDto userDto;

}
