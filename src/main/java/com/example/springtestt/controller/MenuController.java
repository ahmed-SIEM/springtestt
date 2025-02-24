package com.example.springtestt.controller;


import com.example.springtestt.services.IMenuService;
import com.example.springtestt.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class MenuController {
  IMenuService menuService;
}
