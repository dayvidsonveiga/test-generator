package br.com.examgenerator.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Professor extends AbstractEntity{

    @NotEmpty(message = "The field name cannot be empty")
    private String name;

    @Email
    @NotEmpty(message = "The field email cannot be empty")
    @Column(unique = true)
    private String email;
}
