package com.medicalsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import com.medicalsystem.enums.Gender;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.br.CPF;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "patients")
@Data
public class Patient extends BaseEntity {
    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotNull
    private String name;
    @NotNull
    private String code;
    @NotNull
    private String dateOfBirth;
    @NotNull
    private String phone;

    @Column(name = "cpf", unique = true)
    @CPF
    @NotNull
    private String cpf;

    @Column(name = "email", unique = true)
    @Email
    @NotNull
    private String email;
}
