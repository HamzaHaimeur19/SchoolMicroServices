package com.example.etudiantservice.repositories;

import com.example.etudiantservice.entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author lenovo t490
 * @code ClassroomRepo
 **/
@RepositoryRestResource
public interface ClassroomRepo extends JpaRepository<Classroom, Long> {
}
