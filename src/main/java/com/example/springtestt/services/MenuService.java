package com.example.springtestt.services;

import com.example.springtestt.entities.Composant;
import com.example.springtestt.entities.Menu;
import com.example.springtestt.entities.TypeMenu;
import com.example.springtestt.repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
@AllArgsConstructor
public class MenuService implements IMenuService {

    private  MenuRepository menuRepository;


    @Override
    public List<Menu> retrieveAllMenus() {
        return menuRepository.findAll();
    }

    @Override
    public Menu addMenu(Menu e) {
        return menuRepository.save(e);
    }

    @Override
    public Menu updateMenu(Menu e) {
        return menuRepository.save(e);
    }

    @Override
    public Menu retrieveMenu(Long idMenu) {
        Optional<Menu> menu = menuRepository.findById(idMenu);
        return menu.orElse(null);
    }

    @Override
    public void removeMenu(Long idMenu) {
        menuRepository.deleteById(idMenu);
    }

    @Override
    public List<Menu> addMenus(List<Menu> menus) {
        return menuRepository.saveAll(menus);
    }
    public Menu ajoutComposantsEtMiseAjourPrixMenu(Set<Composant> composants, Long idMenu) {
        Menu menu = menuRepository.findById(idMenu).get();
        menu.getComposants().addAll(composants);
        float prixTotal = 0;
        for (Composant c : composants) {
            prixTotal += c.getPrix();
            c.setMenu(menu);
        }
        if (prixTotal > 20) {
           System.out.println("Le prix total ne doit pas depasser 20 dinars");
        }
        menu.setPrixTotal(prixTotal);
        return menuRepository.save(menu);
    }

    @Override
    public List<Menu> listeMenuSelonTypeMenuEtprixComposantsSuperieurAUnMontant(TypeMenu typeMenu, Float prixTotal) {
        List<Menu> allMenus = menuRepository.findByTypeMenu(typeMenu);
        return allMenus.stream()
                .filter(menu -> menu.getComposants().stream()
                        .mapToDouble(c -> c.getPrix())
                        .sum() > prixTotal)
                .toList();
    }


}

