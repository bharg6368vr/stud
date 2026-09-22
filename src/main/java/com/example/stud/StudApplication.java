package com.example.stud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.stud.model.Student;

@SpringBootApplication
public class StudApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudApplication.class, args);
    }
   
}