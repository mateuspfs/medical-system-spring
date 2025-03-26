package com.medicalsystem.dto.response;

import com.medicalsystem.enums.Gender;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PatientResponseDTO {
    private Long id;
    private Gender gender;
    private String name;
    private String code;
    private String dateOfBirth;
    private String phone;
    private String cpf;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime  updatedAt;
}
