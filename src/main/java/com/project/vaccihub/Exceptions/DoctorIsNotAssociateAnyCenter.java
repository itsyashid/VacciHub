package com.project.vaccihub.Exceptions;

public class DoctorIsNotAssociateAnyCenter extends RuntimeException {
    public DoctorIsNotAssociateAnyCenter() {
        super("Doctor is not associate with any vaccination centre");
    }
}