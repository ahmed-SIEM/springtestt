package com.example.springtestt.controller;


import com.example.springtestt.services.DetailComposantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class DetailComposantController {
    private DetailComposantService detailComposantService;
}
