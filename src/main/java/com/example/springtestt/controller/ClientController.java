package com.example.springtestt.controller;

import com.example.springtestt.services.ClientService;
import com.example.springtestt.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ClientController {
    IClientService clientService;
}
