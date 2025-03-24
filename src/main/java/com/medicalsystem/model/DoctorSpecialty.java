package com.medicalsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "doctor_specialty")
@Data
public class DoctorSpecialty extends BaseEntity {
    @NotNull
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;
}
