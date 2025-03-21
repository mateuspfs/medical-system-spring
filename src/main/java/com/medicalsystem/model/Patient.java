package com.medicalsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import com.medicalsystem.enums.Gender;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "patients")
@Data

public class Patient extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String Name;
    private String Code;
    private String DateOfBirth;
    private String Cpf;
    private String Phone;
    private String Email;
}
