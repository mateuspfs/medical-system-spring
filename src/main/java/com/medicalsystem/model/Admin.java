package com.medicalsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "admins")
@Data
public class Admin extends BaseEntity {
    @NotNull
    private String name;

    @Column(name = "email", unique = true)
    @NotNull
    private String email;
}
