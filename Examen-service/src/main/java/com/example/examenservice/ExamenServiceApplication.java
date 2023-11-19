package com.example.examenservice;

import com.example.examenservice.entities.Examen;
import com.example.examenservice.models.Course;
import com.example.examenservice.models.Etudiant;
import com.example.examenservice.repositories.ExamenRespository;
import com.example.examenservice.services.CourseRest;
import com.example.examenservice.services.EtudiantRest;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableFeignClients
@AllArgsConstructor
public class ExamenServiceApplication implements CommandLineRunner {
    ExamenRespository examenRespository;
    CourseRest courseRest;
    EtudiantRest etudiantRest;


    public static void main(String[] args) {
        SpringApplication.run(ExamenServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Course c = courseRest.getCourseById(1L);

        CollectionModel<EntityModel<Etudiant>> etudiantCollection = etudiantRest.getEtudiants();
        List<Etudiant> liste = etudiantCollection.getContent().stream()
                .map(EntityModel::getContent)
                .collect(Collectors.toList());

        List<String> nomPrenomList = liste.stream()
                .map(etudiant -> etudiant.getNom() + " " + etudiant.getPrenom())
                .collect(Collectors.toList());


        Examen e = new Examen(null, new Date(), c.getNom(), nomPrenomList);
        examenRespository.save(e);
        System.out.println(liste);


    }
}
