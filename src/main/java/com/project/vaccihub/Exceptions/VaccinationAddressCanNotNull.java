package com.project.vaccihub.Exceptions;

public class VaccinationAddressCanNotNull extends RuntimeException{
    public VaccinationAddressCanNotNull() {
        super("Vaccination Centre address can not null");
    }
}