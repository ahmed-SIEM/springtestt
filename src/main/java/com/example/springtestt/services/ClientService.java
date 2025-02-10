package com.example.springtestt.services;

import com.example.springtestt.entities.Client;
import com.example.springtestt.repositories.ClientRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ClientService implements IClientService{
    ClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public List<Client> retrieveClient(Long idClient) {
        Optional<Client> client = clientRepository.findById(idClient);
        return (List<Client>) client.orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> Clients) {
        return clientRepository.saveAll(Clients);
    }
}
