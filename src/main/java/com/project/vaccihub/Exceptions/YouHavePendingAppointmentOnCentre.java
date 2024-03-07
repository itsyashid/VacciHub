package com.project.vaccihub.Exceptions;

public class YouHavePendingAppointmentOnCentre extends RuntimeException{
    public YouHavePendingAppointmentOnCentre() {
        super("You have pending appointment on current vaccination centre");
    }
}