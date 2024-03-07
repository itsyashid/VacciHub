package com.project.vaccihub.Dtos.RequestDtos;

import lombok.Data;

@Data
public class AssociateDoctorDto {

    private Integer doctorId;

    private Integer vaccinationCentreId;
}