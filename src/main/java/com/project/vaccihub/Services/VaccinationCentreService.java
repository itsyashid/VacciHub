package com.project.vaccihub.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.project.vaccihub.Exceptions.*;
import com.project.vaccihub.Models.*;
import com.project.vaccihub.Repositories.*;

@Service
public class VaccinationCentreService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VaccinationCentreRepository vaccinationCentreRepository;

    @Autowired
    AppointmentRepository appointmentRepository;

    public String addVaccinationCentre(VaccinationCentre vaccinationCentre) throws VaccinationAddressCanNotNull{
        if(vaccinationCentre.getAddress().isEmpty()) {
            throw new VaccinationAddressCanNotNull();
        }
        vaccinationCentreRepository.save(vaccinationCentre);
        return "Vaccination Centre has been saved successfully at "+ vaccinationCentre.getAddress();
    }

    public List<String> getAllVaccinationCentres() {
        List<VaccinationCentre> vaccinationCentres = vaccinationCentreRepository.findAll();
        List<String> centresName = new ArrayList<>();
        for(VaccinationCentre vaccinationCentre : vaccinationCentres) {
            centresName.add("name: "+vaccinationCentre.getCentreName()+", Address: "+vaccinationCentre.getAddress());
        }
        return centresName;
    }

    public String deleteVaccinationCentreById(Integer vaccinationCentreId) throws VaccinationCentreNotFound{
        Optional<VaccinationCentre> vaccinationCentreOpt = vaccinationCentreRepository.findById(vaccinationCentreId);
        if(vaccinationCentreOpt.isEmpty()) {
            throw new VaccinationCentreNotFound();
        }
        VaccinationCentre vaccinationCentre = vaccinationCentreOpt.get();
        vaccinationCentreRepository.delete(vaccinationCentre);
        return vaccinationCentre.getCentreName()+ " Vaccination Centre is deleted Successfully";
    }
}