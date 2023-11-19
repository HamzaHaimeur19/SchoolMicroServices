package com.example.etudiantservice;

import com.example.etudiantservice.entities.Classroom;
import com.example.etudiantservice.entities.Etudiant;
import com.example.etudiantservice.repositories.ClassroomRepo;
import com.example.etudiantservice.repositories.EtudiantRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class EtudiantServiceApplication implements CommandLineRunner {
    EtudiantRepo etudiantRepo;
    ClassroomRepo classroomRepo;

    public static void main(String[] args) {
        SpringApplication.run(EtudiantServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Etudiant> etudiantList = new ArrayList<>();
        Classroom c = Classroom.builder().
                id(null)
                .noclasse(112)
                .listeEtudiants(null)
                .build();
        classroomRepo.save(c);

        Classroom c2 = Classroom.builder().
                id(null)
                .noclasse(113)
                .listeEtudiants(null)
                .build();
        classroomRepo.save(c2);

        Classroom c3 = Classroom.builder().
                id(null)
                .noclasse(113)
                .listeEtudiants(null)
                .build();
        classroomRepo.save(c3);

        Etudiant e = Etudiant.builder()
                .id(null)
                .nom("Haimeur")
                .prenom("Hamza")
                .email("Hamza@gmail.com")
                .classroom(c)
                .build();
        etudiantRepo.save(e);

        Etudiant e2 = Etudiant.builder()
                .id(null)
                .nom("Haimeur")
                .prenom("Hatim")
                .email("Hatim@gmail.com")
                .classroom(c)
                .build();
        etudiantRepo.save(e2);

        Etudiant e3 = Etudiant.builder()
                .id(null)
                .nom("Haimeur")
                .prenom("Rayane")
                .email("Rayane@gmail.com")
                .classroom(c2)
                .build();
        etudiantRepo.save(e3);

        Etudiant e4 = Etudiant.builder()
                .id(null)
                .nom("Haimeur")
                .prenom("Khalid")
                .email("Khalid@gmail.com")
                .classroom(c2)
                .build();
        etudiantRepo.save(e4);

        Etudiant e5 = Etudiant.builder()
                .id(null)
                .nom("Benmoussa")
                .prenom("Chakib")
                .email("Chakib@gmail.com")
                .classroom(c3)
                .build();
        etudiantRepo.save(e5);

        Etudiant e6 = Etudiant.builder()
                .id(null)
                .nom("Akhennouch")
                .prenom("dd")
                .email("dd@gmail.com")
                .classroom(c3)
                .build();
        etudiantRepo.save(e6);

        etudiantList.addAll(Arrays.asList(e, e2, e3, e4, e5, e5));

    }
}
