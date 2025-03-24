package com.medicalsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "patient_treatment")
@Data
public class PatientTreatment extends BaseEntity {
    private Timestamp finishedAt;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "treatment_id")
    private Treatment treatment;
}
