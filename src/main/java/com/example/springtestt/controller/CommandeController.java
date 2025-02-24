package com.example.springtestt.controller;


import com.example.springtestt.services.CommandeService;
import com.example.springtestt.services.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class CommandeController {
    ICommandeService commandeService;
}
