package com.project.vaccihub.Dtos.RequestDtos;

import lombok.Data;

import java.sql.Date;

@Data
public class ChangeAppointmentDateRequestDtos {

    private Integer appointmentId;
    private Integer userId;
    private Date date;
}