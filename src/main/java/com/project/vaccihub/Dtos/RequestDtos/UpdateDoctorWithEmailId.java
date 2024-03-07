package com.project.vaccihub.Dtos.RequestDtos;

import com.project.vaccihub.Enums.Gender;
import lombok.Data;

@Data
public class UpdateDoctorWithEmailId {
    private String name;
    private Integer age;
    private Gender gender;
}