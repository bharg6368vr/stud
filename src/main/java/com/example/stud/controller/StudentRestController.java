package com.example.stud.controller;

import com.example.stud.model.Student;
import com.example.stud.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private StudentRepository studentRepository;

    // CREATE Student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {

        if(student.getAttendance() >= 75 && student.getAverageMarks() >= 60){
            student.setPerformance("Good");
        }
        else if(student.getAttendance() >= 50 && student.getAverageMarks() >= 40){
            student.setPerformance("Average");
        }
        else{
            student.setPerformance("Poor");
        }

        return studentRepository.save(student);
    }

    // READ All Students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // READ Student By ID
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentRepository.findById(id).orElse(null);
    }

    // UPDATE Student
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails){

        Student student = studentRepository.findById(id).orElse(null);

        if(student != null){

            student.setName(studentDetails.getName());
            student.setAttendance(studentDetails.getAttendance());
            student.setAverageMarks(studentDetails.getAverageMarks());

            if(student.getAttendance() >= 75 && student.getAverageMarks() >= 60){
                student.setPerformance("Good");
            }
            else if(student.getAttendance() >= 50 && student.getAverageMarks() >= 40){
                student.setPerformance("Average");
            }
            else{
                student.setPerformance("Poor");
            }

            return studentRepository.save(student);
        }

        return null;
    }

    // DELETE Student
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){

        studentRepository.deleteById(id);

        return "Student deleted successfully";
    }

}