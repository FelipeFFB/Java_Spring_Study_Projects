package com.felipebranquinho.desafio3.dto;

import com.felipebranquinho.desafio3.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @NotBlank(message = "O campo nome não pode ficar vazio")
    private String name;

    private String cpf;

    private Double income;

    @PastOrPresent(message = "Datas futuras não são válidas para data de nascimento")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO(){}

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        birthDate = client.getBirthDate();
        income = client.getIncome();
        children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Double getIncome() {
        return income;
    }

    public Integer getChildren() {
        return children;
    }
}
