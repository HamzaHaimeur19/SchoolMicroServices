package com.example.examenservice.entities;

import com.example.examenservice.models.Course;
import com.example.examenservice.models.Etudiant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author lenovo t490
 * @code Examen
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date dateExamen;
    /*@Transient
    private List<Etudiant> etudiantList;*/

    /*@Transient
    private Course course;*/
    private String courseName;
    private List<String> NomPrenomsEtudiants;


}
