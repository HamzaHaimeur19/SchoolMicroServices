package com.example.examenservice.models;

import com.example.examenservice.models.Classroom;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lenovo t490
 * @code Etudiant
 **/
@Data
public class Etudiant {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private Classroom classroom;
}
