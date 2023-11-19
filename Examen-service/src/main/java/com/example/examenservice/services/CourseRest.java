package com.example.examenservice.services;

import com.example.examenservice.models.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author lenovo t490
 * @code CourseRest
 **/
@FeignClient(name = "COURSE-SERVICE")
public interface CourseRest {

    @GetMapping("/courses")
    CollectionModel<EntityModel<Course>> listCourses();

    @GetMapping("/courses/{id}")
    Course getCourseById(@PathVariable Long id);
}
