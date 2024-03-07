package com.project.vaccihub.Exceptions;

public class UserNotFound extends RuntimeException{
    public UserNotFound() {
        super("User dose not Exists");
    }
}