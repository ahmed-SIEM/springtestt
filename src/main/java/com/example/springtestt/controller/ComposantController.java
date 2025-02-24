package com.example.springtestt.controller;


import com.example.springtestt.services.CommandeService;
import com.example.springtestt.services.ComposantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class ComposantController {
    private ComposantService composantService;
}
