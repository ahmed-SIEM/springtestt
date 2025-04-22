package com.example.springtestt.controller;


import com.example.springtestt.entities.Composant;
import com.example.springtestt.entities.Menu;
import com.example.springtestt.entities.TypeMenu;
import com.example.springtestt.services.IMenuService;
import com.example.springtestt.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/menu")

public class MenuController {
  IMenuService menuService;

  @PostMapping ("/ajoutComposants/{idMenu}")
  public Menu ajoutComposantsEtMiseAjourPrixMenu(@RequestBody Set<Composant> composants, @PathVariable Long idMenu) {
    return menuService.ajoutComposantsEtMiseAjourPrixMenu(composants, idMenu);
  }

  @GetMapping("/menus-par-type-et-prix")
  public List<Menu> getMenusByTypeAndComponentPrice(
          @RequestParam TypeMenu typeMenu,
          @RequestParam Float prixTotal) {
    return menuService.listeMenuSelonTypeMenuEtprixComposantsSuperieurAUnMontant(typeMenu, prixTotal);
  }

}
