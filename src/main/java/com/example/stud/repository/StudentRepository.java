package com.example.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.stud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
