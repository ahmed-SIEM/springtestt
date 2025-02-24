package com.example.springtestt.controller;


import com.example.springtestt.services.CommandeService;
import com.example.springtestt.services.ComposantService;
import com.example.springtestt.services.IComposantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ComposantController {
    IComposantService composantService;

}
