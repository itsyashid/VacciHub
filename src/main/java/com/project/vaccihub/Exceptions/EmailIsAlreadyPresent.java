package com.project.vaccihub.Exceptions;

public class EmailIsAlreadyPresent extends RuntimeException{

    public EmailIsAlreadyPresent() {
        super("This EmailId is already present");
    }
}