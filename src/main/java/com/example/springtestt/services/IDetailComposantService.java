package com.example.springtestt.services;

import com.example.springtestt.entities.DetailComposant;

import java.util.List;

public interface IDetailComposantService {
    List<DetailComposant> retrieveAllDetails();
    DetailComposant addDetail(DetailComposant e);
    DetailComposant updateDetail(DetailComposant e);
    List<DetailComposant> retrieveDetail(Long idDetailComposant);
    void removeDetail(Long idDetailComposant);
    List<DetailComposant> addDetails(List<DetailComposant> details);
}
