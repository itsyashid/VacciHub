package com.project.vaccihub.Exceptions;

public class DoctorNotFound extends RuntimeException{
    public DoctorNotFound() {
        super("Doctor dose not Exists");
    }
}
