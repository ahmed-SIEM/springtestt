package com.example.springtestt.controller;


import com.example.springtestt.services.ChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class ChaineRestaurationController {
    private ChaineRestaurationService chaineRestaurationService;
}
