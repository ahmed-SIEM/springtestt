package com.example.springtestt.services;

import com.example.springtestt.entities.Composant;
import com.example.springtestt.entities.Menu;
import com.example.springtestt.entities.TypeMenu;

import java.util.List;
import java.util.Set;

public interface IMenuService {
    List<Menu> retrieveAllMenus();
    Menu addMenu(Menu e);
    Menu updateMenu(Menu e);
    Menu retrieveMenu(Long idMenu);
    void removeMenu(Long idMenu);
    List<Menu> addMenus(List<Menu> menus);

    Menu ajoutComposantsEtMiseAjourPrixMenu(Set<Composant> composants, Long idMenu);
    List<Menu> listeMenuSelonTypeMenuEtprixComposantsSuperieurAUnMontant(TypeMenu typeMenu, Float prixTotal);

}
