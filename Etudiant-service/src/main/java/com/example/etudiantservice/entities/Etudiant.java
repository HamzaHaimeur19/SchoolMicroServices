package com.example.etudiantservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lenovo t490
 * @code Etudiant
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    @ManyToOne
    private Classroom classroom;
}
