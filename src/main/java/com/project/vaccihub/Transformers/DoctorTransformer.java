package com.project.vaccihub.Transformers;

import com.project.vaccihub.Dtos.RequestDtos.*;
import com.project.vaccihub.Dtos.ResponseDtos.*;
import com.project.vaccihub.Models.Doctor;

public class DoctorTransformer {
    public static DoctorDto doctorToDoctorDto(Doctor doctor) {
        DoctorDto doctorDto = DoctorDto.builder()
                .name(doctor.getName())
                .gender(doctor.getGender())
                .age(doctor.getAge())
                .vaccinationCentre(VaccinationCentreTransformer.vaccinationCentreToVaccinationCentreDto(doctor.getVaccinationCentre()))
                .build();
        return doctorDto;
    }

    public static DoctorDtoForCentre doctorToDoctorDtoForCentre(Doctor doctor) {
        DoctorDtoForCentre doctorDto = DoctorDtoForCentre.builder()
                .name(doctor.getName())
                .gender(doctor.getGender())
                .age(doctor.getAge())
                .build();
        return doctorDto;
    }

    public static Doctor doctorDtoToDoctor(AddDoctorDto doctorDto) {
        Doctor doctor = Doctor.builder()
                .name(doctorDto.getName())
                .age(doctorDto.getAge())
                .emailId(doctorDto.getEmailId())
                .gender(doctorDto.getGender())
                .build();
        return doctor;
    }
}