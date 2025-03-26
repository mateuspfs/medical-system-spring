package com.medicalsystem.service;

import com.medicalsystem.dto.request.PatientRequestDTO;
import com.medicalsystem.dto.response.PatientResponseDTO;
import com.medicalsystem.model.Patient;
import com.medicalsystem.repository.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientRepository _repository;
    private final ModelMapper _modelMapper;

    public PatientService(PatientRepository repository, ModelMapper modelMapper) {
        this._repository = repository;
        this._modelMapper = modelMapper;
    }

    public PatientResponseDTO getbyId(Long id) {
        Patient patient = _repository.findById(id).orElse(null);
        if (patient == null) return null;

        return _modelMapper.map(patient, PatientResponseDTO.class);
    }

    public Patient create(PatientRequestDTO dto) {
        Patient patient = _modelMapper.map(dto, Patient.class);
        return _repository.save(patient);
    }
}
