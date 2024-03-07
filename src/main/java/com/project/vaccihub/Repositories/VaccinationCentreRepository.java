package com.project.vaccihub.Repositories;

import com.project.vaccihub.Models.VaccinationCentre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationCentreRepository extends JpaRepository<VaccinationCentre, Integer> {
}
