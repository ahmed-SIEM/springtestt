package com.example.springtestt.controller;


import com.example.springtestt.services.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class CommandeController {
    private CommandeService commandeService;
}
