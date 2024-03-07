package com.project.vaccihub.Transformers;

import com.project.vaccihub.Dtos.ResponseDtos.*;
import com.project.vaccihub.Models.*;

public class VaccinationCentreTransformer {

    public static VaccinationCentreDto vaccinationCentreToVaccinationCentreDto (VaccinationCentre vaccinationCentre) {
        VaccinationCentreDto vaccinationCentreDto = VaccinationCentreDto.builder()
                .name(vaccinationCentre.getCentreName())
                .address(vaccinationCentre.getAddress())
                .build();
        return vaccinationCentreDto;
    }
}