package com.example.examenservice.services;

import com.example.examenservice.models.Course;
import com.example.examenservice.models.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author lenovo t490
 * @code EtudiantRest
 **/
@FeignClient(name = "ETUDIANT-SERVICE")
public interface EtudiantRest {
    @GetMapping(path = "/etudiants")
    CollectionModel<EntityModel<Etudiant>> getEtudiants();

    @GetMapping(path = "/etudiants/{id}")
    Etudiant getEtudiantById(@PathVariable Long id);


}
