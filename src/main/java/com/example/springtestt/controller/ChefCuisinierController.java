package com.example.springtestt.controller;


import com.example.springtestt.services.ChefCuisinierService;
import com.example.springtestt.services.IChefCuisinierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ChefCuisinierController {
    IChefCuisinierService chefCuisinierService;

}
