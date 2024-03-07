package com.project.vaccihub.Exceptions;

public class UserIsNotVaccinated extends RuntimeException{
    public UserIsNotVaccinated() {
        super("User is not vaccinated");
    }
}