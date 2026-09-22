package com.example.stud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stud.model.Student;
import com.example.stud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
	

    @Override
    public Student saveStudent(Student student) {

        if(student.getAttendance() >= 75 && student.getAverageMarks() >= 60)
            student.setPerformance("Good");
        else if(student.getAttendance() >= 50 && student.getAverageMarks() >= 40)
            student.setPerformance("Average");
        else
            student.setPerformance("Poor");

        return studentRepository.save(student);
    }
    public double calculateAverageMarks(int totalMarks,int numberOfSubjects) {
    	return(double)totalMarks/numberOfSubjects;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    
}