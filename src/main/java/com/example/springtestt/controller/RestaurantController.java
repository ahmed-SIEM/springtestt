package com.example.springtestt.controller;


import com.example.springtestt.entities.Restaurant;
import com.example.springtestt.services.IMenuService;
import com.example.springtestt.services.IRestaurantService;
import com.example.springtestt.services.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor

@RequestMapping("/restaurants")

public class RestaurantController {
    IRestaurantService restaurantService;

    @PutMapping("/affecterRestaurantAChaineRestauration/{nom}/{libelle}")
    @ResponseBody
    public Restaurant affecterRestaurantAChaineRestauration(@PathVariable ("nom") String nomRestaurant,
                                                            @PathVariable("libelle")String libelleChaine) {
        return restaurantService.affecterRestaurantAChaineRestauration(nomRestaurant, libelleChaine);

    }


}
