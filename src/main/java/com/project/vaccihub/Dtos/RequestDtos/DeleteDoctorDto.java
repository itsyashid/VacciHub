package com.project.vaccihub.Dtos.RequestDtos;

import lombok.Data;

@Data
public class DeleteDoctorDto {

    private Integer doctorId;
    private String emailId;
}