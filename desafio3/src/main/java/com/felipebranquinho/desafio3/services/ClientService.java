package com.felipebranquinho.desafio3.services;

import com.felipebranquinho.desafio3.dto.ClientDTO;
import com.felipebranquinho.desafio3.entities.Client;
import com.felipebranquinho.desafio3.repositories.ClientRepository;
import com.felipebranquinho.desafio3.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){

        Client client = clientRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new ClientDTO(client);

    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){

        Page<Client> clients = clientRepository.findAll(pageable);
        return clients.map(x -> new ClientDTO(x));

    }

    @Transactional
    public ClientDTO insert(ClientDTO clientDTO){

        Client client = new Client();

        copyDtoToEntity(clientDTO, client);

        client = clientRepository.save(client);

        return new ClientDTO(client);

    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO clientDTO){

        Client client = clientRepository.getReferenceById(id);

        copyDtoToEntity(clientDTO, client);

        client = clientRepository.save(client);

        return new ClientDTO(client);

    }

    @Transactional
    public void delete(Long id){

        clientRepository.deleteById(id);

    }

    private void copyDtoToEntity(ClientDTO clientDTO, Client client){

        client.setName(clientDTO.getName());
        client.setCpf(clientDTO.getCpf());
        client.setIncome(clientDTO.getIncome());
        client.setBirthDate(clientDTO.getBirthDate());
        client.setChildren(clientDTO.getChildren());
    }
}
