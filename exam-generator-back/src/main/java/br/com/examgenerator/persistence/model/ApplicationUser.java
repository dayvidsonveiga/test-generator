package br.com.examgenerator.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class ApplicationUser extends AbstractEntity{

    @NotEmpty(message = "The field username cannot be empty")
    @Column(unique = true)
    private String username;

    @NotEmpty(message = "The field password cannot be empty")
    private String password;

    @OneToOne
    private Professor professor;

    public ApplicationUser() {

    }

    public ApplicationUser(ApplicationUser applicationUser) {
        this.username = applicationUser.username;
        this.password = applicationUser.password;
        this.professor = applicationUser.professor;
    }
}
