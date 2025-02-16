package com.example.springtestt.services;

import com.example.springtestt.entities.Restaurant;

import java.util.List;

public interface IRestaurantService {
    List<Restaurant> retrieveAllRestaurants();
    Restaurant addRestaurant(Restaurant e);
    Restaurant updateRestaurant(Restaurant e);
    Restaurant retrieveRestaurant(Long idRestaurant);
    void removeRestaurant(Long idRestaurant);
    List<Restaurant> addRestaurants(List<Restaurant> restaurants);
}
