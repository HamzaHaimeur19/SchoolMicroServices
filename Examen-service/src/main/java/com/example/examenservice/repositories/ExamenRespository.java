package com.example.examenservice.repositories;

import com.example.examenservice.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author lenovo t490
 * @code ExamenRespository
 **/
@RepositoryRestResource
public interface ExamenRespository extends JpaRepository<Examen, Long> {
}
