package com.example.stud.service;

import com.example.stud.model.Student;
import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    void deleteStudent(Long id);
}