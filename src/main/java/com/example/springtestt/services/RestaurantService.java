package com.example.springtestt.services;

import com.example.springtestt.entities.ChaineRestauration;
import com.example.springtestt.entities.Restaurant;
import com.example.springtestt.repositories.ChaineRestaurationRepository;
import com.example.springtestt.repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor

public class RestaurantService implements IRestaurantService {

    private RestaurantRepository restaurantRepository;


    private ChaineRestaurationRepository chaineRestaurationReposiory;


    @Override
    public List<Restaurant> retrieveAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }

    @Override
    public Restaurant retrieveRestaurant(Long idRestaurant) {
        Optional<Restaurant> restaurant = restaurantRepository.findById(idRestaurant);
        return restaurant.orElse(null); // Retourne null si le restaurant n'existe pas
    }

    @Override
    public void removeRestaurant(Long idRestaurant) {
        restaurantRepository.deleteById(idRestaurant);
    }

    @Override
    public List<Restaurant> addRestaurants(List<Restaurant> restaurants) {
        return restaurantRepository.saveAll(restaurants);
    }

    @Override
    public Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine) {

        Restaurant restaurant = restaurantRepository.findByNom(nomRestaurant);

        ChaineRestauration chaine = chaineRestaurationReposiory.findByLibelle(libelleChaine);

        restaurant.setChaineRestauration(chaine);

        return restaurantRepository.save(restaurant);
    }
}
