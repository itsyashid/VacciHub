package com.project.vaccihub.Exceptions;

public class EmailShouldNotNullException extends RuntimeException{
    public EmailShouldNotNullException() {
        super("Email should not be NULL");
    }
}