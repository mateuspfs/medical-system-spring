package com.medicalsystem.controller;

import com.medicalsystem.dto.request.PatientRequestDTO;
import com.medicalsystem.dto.response.PatientResponseDTO;
import com.medicalsystem.model.Patient;
import com.medicalsystem.service.PatientService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
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
    public ResponseEntity<?> addPatient(@Valid @RequestBody PatientRequestDTO dto) {
        Patient patient = _patientService.create(dto);
        return ResponseEntity.ok(patient);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientResponseDTO> getPatient(@PathVariable Long id) {
        PatientResponseDTO patient = _patientService.getbyId(id);
        if (patient == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(patient);
    }
}
