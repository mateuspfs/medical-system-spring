package com.medicalsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.br.CPF;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "doctors")
@Data
public class Doctor extends BaseEntity {
    @NotNull
    private String name;
    @NotNull
    private String phone;
    @NotNull
    private String document;

    @Column(name = "cpf", unique = true)
    @CPF
    @NotNull
    private String cpf;

    @Column(name = "email", unique = true)
    @Email
    @NotNull
    private String email;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;
}
