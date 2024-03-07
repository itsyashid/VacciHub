package com.project.vaccihub.Exceptions;

public class PendingAppointment extends RuntimeException{
    public PendingAppointment(Integer id) {
        super("Your Appointment is pending with id : "+id);
    }
}