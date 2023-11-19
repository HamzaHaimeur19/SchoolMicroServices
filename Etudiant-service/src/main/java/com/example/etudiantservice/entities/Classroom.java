package com.example.etudiantservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

/**
 * @author lenovo t490
 * @code Classroom
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int noclasse;
    @OneToMany(mappedBy = "classroom")
    private Collection<Etudiant> listeEtudiants;
}
