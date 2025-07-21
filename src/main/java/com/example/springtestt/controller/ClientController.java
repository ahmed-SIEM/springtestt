package com.example.springtestt.controller;

import com.example.springtestt.entities.Client;
import com.example.springtestt.services.ClientService;
import com.example.springtestt.services.IClientService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")

public class ClientController {
    IClientService clientService;
    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        List<Client> listClients = clientService.retrieveAllClients();
        return listClients;
    }



    
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return (Client) clientService.retrieveClient(clientId);
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c) {
        Client client = clientService.addClient(c);
        return client;
    }

    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.removeClient(clientId);
    }

    @PutMapping("/update-client")
    public Client updateClient(@RequestBody Client c) {
        Client client= clientService.updateClient(c);
        return client;
    }

}
