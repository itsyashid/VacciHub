package com.project.vaccihub.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.vaccihub.Enums.*;
import com.project.vaccihub.Exceptions.*;
import com.project.vaccihub.Models.*;
import com.project.vaccihub.Repositories.*;

import java.sql.Time;
import java.sql.Date;
import java.util.Optional;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class DoseService {

    @Autowired
    DoseRepository doseRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    AppointmentRepository appointmentRepository;

    public String giveDose(String doseId, Integer appointmentId) throws UserNotFound, UserAlreadyVaccinated, AppointmentDateException{
        Optional<Appointment> appointmentOpt = appointmentRepository.findById(appointmentId);
        if(appointmentOpt.isEmpty()) {
            throw new UserNotFound();
        }
        Appointment appointment = appointmentOpt.get();
        if(appointment.getDate().compareTo(Date.valueOf(LocalDate.now())) != 0 && appointment.getTime().compareTo(Time.valueOf(LocalTime.now())) > 0) {
            throw new AppointmentDateException(appointment.getDate().toString()+", "+appointment.getTime().toString());
        }
        User user = appointment.getUser();
        if(user.getDose() != null) {
            throw new UserAlreadyVaccinated();
        }
        Dose dose = new Dose();
        dose.setDoseNo(doseId);
        dose.setUser(user);
        user.setDose(dose);
        appointment.setAppointmentStatus(AppointmentStatus.COMPLETED);
        appointmentRepository.save(appointment);
        userRepository.save(user);
//        Child will automatically saved because of cascading effect
        return "Dose has been Given Successfully to: "+user.getName();
    }

    public Integer countOfAllGivenDoses() {
        return doseRepository.findAll().size();
    }
}