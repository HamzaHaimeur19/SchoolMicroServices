package com.example.examenservice.models;

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
@Data
public class Classroom {
    private Long id;
    private int noclasse;
    private Collection<Etudiant> listEtudiants;
}
