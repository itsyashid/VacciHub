package com.project.vaccihub.Dtos.ResponseDtos;

import com.project.vaccihub.Enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
    private String name;
    private Integer age;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private VaccinationCentreDto vaccinationCentre;
}