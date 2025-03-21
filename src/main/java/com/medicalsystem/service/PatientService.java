package com.medicalsystem.service;

import com.medicalsystem.model.Patient;
import com.medicalsystem.repository.PatientRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientService {

    private PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public Patient getPatient(Long id) {
        return repository.getReferenceById(id);
    }

    public Patient createPatient(Patient patient) {
        return repository.save(patient);
    }
}
