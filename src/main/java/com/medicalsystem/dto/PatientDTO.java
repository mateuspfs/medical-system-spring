package com.medicalsystem.dto;

import com.medicalsystem.enums.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class PatientDTO {

    @NotNull(message = "O gênero é obrigatório")
    private Gender gender;

    @NotBlank(message = "O nome é obrigatório")
    private String name;

    @NotBlank(message = "O código é obrigatório")
    private String code;

    @NotBlank(message = "A data de nascimento é obrigatória")
    private String dateOfBirth;

    @NotBlank(message = "O telefone é obrigatório")
    private String phone;

    @CPF(message = "O CPF informado não é válido")
    @NotBlank(message = "O CPF é obrigatório")
    private String cpf;

    @Email(message = "O e-mail informado não é válido")
    @NotBlank(message = "O e-mail é obrigatório")
    private String email;
}
