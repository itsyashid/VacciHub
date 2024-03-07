package com.project.vaccihub.Dtos.RequestDtos;

import com.project.vaccihub.Enums.Gender;
import lombok.Data;

@Data

public class AddUserDto {

    private String name;
    private Integer age;
    private String emailId;
    private Gender gender;
    private String mobileNo;

}