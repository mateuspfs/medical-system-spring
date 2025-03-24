package com.medicalsystem.repository;

import com.medicalsystem.model.DoctorSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorSpecialtyRepository extends JpaRepository<DoctorSpecialty, Long> {
}
