package com.medicalsystem.controller;

import com.medicalsystem.model.Patient;
import com.medicalsystem.service.PatientService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/patient", produces = {"application/json"})
public class PatientController {
    private final PatientService _patientService;

    public PatientController(PatientService patientService) {
        this._patientService = patientService;
    }

    @Operation(summary = "Realiza o cadastro de um paciente", method = "POST")
    @PostMapping
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patientDTO) {
        try {
            Patient patient = _patientService.create(patientDTO);
            return ResponseEntity.ok(patient);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable Long id) {
        Patient patient = _patientService.getbyId(id);
        if (patient == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(patient);
    }
}
