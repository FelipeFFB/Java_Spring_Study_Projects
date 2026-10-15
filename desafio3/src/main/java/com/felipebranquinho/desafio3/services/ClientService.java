package com.felipebranquinho.desafio3.services;

import com.felipebranquinho.desafio3.dto.ClientDTO;
import com.felipebranquinho.desafio3.entities.Client;
import com.felipebranquinho.desafio3.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){

        Client client = clientRepository.findById(id).get();
        return new ClientDTO(client);

    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){

        Page<Client> clients = clientRepository.findAll(pageable);
        return clients.map(x -> new ClientDTO(x));

    }
}
