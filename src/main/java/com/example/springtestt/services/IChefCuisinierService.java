package com.example.springtestt.services;

import com.example.springtestt.entities.ChefCuisinier;

import java.util.List;

public interface IChefCuisinierService {
    List<ChefCuisinier> retrieveAllChefs();
    ChefCuisinier addChef(ChefCuisinier e);
    ChefCuisinier updateChef(ChefCuisinier e);
    List<ChefCuisinier> retrieveChef(Long idChef);
    void removeChef(Long idChef);
    List<ChefCuisinier> addChefs(List<ChefCuisinier> chefs);
}
