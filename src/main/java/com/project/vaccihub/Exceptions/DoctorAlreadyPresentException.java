package com.project.vaccihub.Exceptions;

public class DoctorAlreadyPresentException extends RuntimeException{

    public DoctorAlreadyPresentException() {
        super("Doctor is already Present");
    }
}