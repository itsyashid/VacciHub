package com.project.vaccihub.Exceptions;

public class YouCanNotChangeDate extends RuntimeException{
    public YouCanNotChangeDate() {
        super("You can not change date your appointment is completed");
    }
}