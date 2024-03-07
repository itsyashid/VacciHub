package com.project.vaccihub.Exceptions;

public class UserAlreadyVaccinated extends RuntimeException{
    public UserAlreadyVaccinated() {
        super("User already vaccinated");
    }
}