package com.example.springtestt.repositories;

import com.example.springtestt.entities.Menu;
import com.example.springtestt.entities.TypeComposant;
import com.example.springtestt.entities.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MenuRepository extends JpaRepository<Menu, Long> {
    // 1.4 Liste des menus selon le type de menu avec un prix total supérieur à un montant donné
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float montant);

    // 2.1 Liste des noms des menus par type de menu, ordonnés par prix total
    @Query("SELECT m.libelleMenu FROM Menu m WHERE m.typeMenu = :typeMenu ORDER BY m.prixTotal ASC")
    List<String> findNomMenuByTypeMenuOrderByPrixTotal(@Param("typeMenu") TypeMenu typeMenu);

    // 2.2 Liste des menus contenant un composant d’un type donné (exemple : viande blanche)
    @Query("SELECT DISTINCT m FROM Menu m JOIN m.composants c WHERE c.detailComposant.typeComposant = :typeComposant")
    List<Menu> findMenuByTypeComposant(@Param("typeComposant") TypeComposant typeComposant);
}
