package com.example.springtestt.controller;


import com.example.springtestt.services.IMenuService;
import com.example.springtestt.services.IRestaurantService;
import com.example.springtestt.services.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class RestaurantController {
    IRestaurantService restaurantService;

}
