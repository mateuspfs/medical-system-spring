package com.medicalsystem.repository;

import com.medicalsystem.model.PatientTreatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientTreatmentRepository extends JpaRepository<PatientTreatment, Long> {
}
