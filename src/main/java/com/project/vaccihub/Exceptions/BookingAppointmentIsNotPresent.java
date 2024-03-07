package com.project.vaccihub.Exceptions;

public class BookingAppointmentIsNotPresent extends RuntimeException{
    public BookingAppointmentIsNotPresent() {
        super("Booking dose not exists");
    }
}