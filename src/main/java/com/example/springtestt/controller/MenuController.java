package com.example.springtestt.controller;


import com.example.springtestt.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class MenuController {
    private MenuService  menuService;
}
