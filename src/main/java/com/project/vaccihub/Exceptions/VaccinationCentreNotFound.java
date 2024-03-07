package com.project.vaccihub.Exceptions;

public class VaccinationCentreNotFound extends RuntimeException {

    public VaccinationCentreNotFound() {
        super("VaccinationCentre dose not Exists");
    }
}