package com.example.springtestt.controller;


import com.example.springtestt.services.DetailComposantService;
import com.example.springtestt.services.IDetailComposantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class DetailComposantController {
    IDetailComposantService detailComposantService;

}
