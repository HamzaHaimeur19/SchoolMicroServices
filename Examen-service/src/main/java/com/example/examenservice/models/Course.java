package com.example.examenservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lenovo t490
 * @code Course
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Long id;
    private String nom;
}
