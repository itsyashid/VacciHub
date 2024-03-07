package com.project.vaccihub.Exceptions;

public class AppointmentCanNotDelete extends RuntimeException{
    public AppointmentCanNotDelete() {
        super("You Can not delete your Appointment");
    }
}