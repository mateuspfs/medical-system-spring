package com.medicalsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "specialties")
@Data
public class Specialty extends BaseEntity {
    @Column(name = "code", unique = true)
    @NotNull
    private String code;
    @NotNull
    private String name;
}
