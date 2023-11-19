package com.example.coursservice.repositories;

import com.example.coursservice.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author lenovo t490
 * @code CourseRepository
 **/
@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long> {
}
