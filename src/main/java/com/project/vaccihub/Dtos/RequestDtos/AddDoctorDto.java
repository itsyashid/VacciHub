package com.project.vaccihub.Dtos.RequestDtos;

import com.project.vaccihub.Enums.Gender;
import lombok.Data;

@Data
public class AddDoctorDto {
    private String name;
    private Integer age;
    private Gender gender;
    private String emailId;
}