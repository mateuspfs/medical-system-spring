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
@Table(name = "treatments")
@Data
public class Treatment extends BaseEntity {
    @NotNull
    private String name;
    @NotNull
    private Integer durationInDays;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;
}
