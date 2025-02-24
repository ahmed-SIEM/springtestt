package com.example.springtestt.controller;


import com.example.springtestt.services.ChefCuisinierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class ChefCuisinierController {
    private ChefCuisinierService chefCuisinierService;

}
