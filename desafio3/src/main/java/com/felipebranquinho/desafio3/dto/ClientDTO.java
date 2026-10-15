package com.felipebranquinho.desafio3.dto;

import com.felipebranquinho.desafio3.entities.Client;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    private String name;

    private String cpf;

    private LocalDate birthDate;

    public ClientDTO(){
    }

    public ClientDTO(Long id, String name, String cpf, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        birthDate = client.getBirthDate();
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
}
