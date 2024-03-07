package com.project.vaccihub.Exceptions;

public class DoctorDoesNotExistsByThisEmail extends RuntimeException{
    public DoctorDoesNotExistsByThisEmail() {
        super("Doctor does not exists with this EmailId");
    }
}