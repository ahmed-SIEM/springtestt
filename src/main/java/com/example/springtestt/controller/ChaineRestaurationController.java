package com.example.springtestt.controller;


import com.example.springtestt.services.ChaineRestaurationService;
import com.example.springtestt.services.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ChaineRestaurationController {
    IChaineRestaurationService chaineRestaurationService;


}
