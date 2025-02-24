package com.example.springtestt.controller;

import com.example.springtestt.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class ClientController {
    private ClientService clientService;
}
