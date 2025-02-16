package com.example.springtestt.services;

import com.example.springtestt.entities.ChaineRestauration;

import java.util.List;

public interface IChaineRestaurationService {
    List<ChaineRestauration> retrieveAllChaines();
    ChaineRestauration addChaine(ChaineRestauration e);
    ChaineRestauration updateChaine(ChaineRestauration e);
    List<ChaineRestauration> retrieveChaine(Long idChaine);
    void removeChaine(Long idChaine);
    List<ChaineRestauration> addChaines(List<ChaineRestauration> chaines);
}
