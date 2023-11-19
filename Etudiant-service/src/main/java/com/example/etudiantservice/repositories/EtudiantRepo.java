package com.example.etudiantservice.repositories;

import com.example.etudiantservice.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author lenovo t490
 * @code EtudiantRepo
 **/
@RepositoryRestResource
public interface EtudiantRepo extends JpaRepository<Etudiant, Long> {
}
