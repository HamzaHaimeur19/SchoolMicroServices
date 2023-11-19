package com.example.coursservice;

import com.example.coursservice.entities.Course;
import com.example.coursservice.repositories.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class CourseServiceApplication implements CommandLineRunner {
    CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(CourseServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Course c = Course.builder()
                .id(null)
                .nom("maths")
                .build();
        courseRepository.save(c);

        Course c2 = Course.builder()
                .id(null)
                .nom("PC")
                .build();
        courseRepository.save(c2);

        Course c3 = Course.builder()
                .id(null)
                .nom("SVT")
                .build();
        courseRepository.save(c3);


    }
}
