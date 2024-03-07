package com.project.vaccihub.Repositories;

import com.project.vaccihub.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    public Doctor findByEmailId(String emailId);
}