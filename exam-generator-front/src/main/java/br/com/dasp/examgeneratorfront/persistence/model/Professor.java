package br.com.dasp.examgeneratorfront.persistence.model;



public class Professor extends AbstractEntity{
    //@NotEmpty(message = " The field name cannot be empty")
    private String name;
   // @Email(message = "This email is not valid")
   // @NotEmpty(message = "The field email cannot be empty")
   // @Column(unique = true) //utilizado para especificar colunas a serem marcadas como possuindo valores únicos. O valor default é false. Alguns valores não são chave-primária, no entanto, precisam possuir valores únicos, que causam problemas caso sejam duplicados.
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
