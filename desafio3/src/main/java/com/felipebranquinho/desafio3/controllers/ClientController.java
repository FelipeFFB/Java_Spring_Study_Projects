package com.felipebranquinho.desafio3.controllers;

import com.felipebranquinho.desafio3.dto.ClientDTO;
import com.felipebranquinho.desafio3.entities.Client;
import com.felipebranquinho.desafio3.repositories.ClientRepository;
import com.felipebranquinho.desafio3.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){

        return clientService.findById(id);
    }

}
