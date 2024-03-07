package com.project.vaccihub.Dtos.RequestDtos;

import lombok.Data;

@Data
public class DoctorCentreUpdateRequestDto {

    private Integer doctorId;
    private Integer newCentreId;
}