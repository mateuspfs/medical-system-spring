package com.medicalsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    private String dateOfBirth;
    @NotNull
    private String phone;

    @Column(name = "code", unique = true)
    @NotNull
    @Size(max = 8, message = "O código deve ter no máximo 8 caracteres")
    private String code;

    @Column(name = "cpf", unique = true)
    @CPF
    @NotNull
    private String cpf;

    @Column(name = "email", unique = true)
    @Email
    @NotNull
    private String email;
}
