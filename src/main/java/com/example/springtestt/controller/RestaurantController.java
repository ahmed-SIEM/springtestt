package com.example.springtestt.controller;


import com.example.springtestt.services.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class RestaurantController {
    private RestaurantService restaurantService;
}
