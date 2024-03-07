package com.project.vaccihub.Exceptions;

public class UserDoNotHaveAppointmentId extends RuntimeException{

    public UserDoNotHaveAppointmentId() {
        super("User Do Not have appointment with this Id");
    }
}