package com.example.stud.model;

import jakarta.persistence.*;

@Entity
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

private int attendance;

private double averageMarks;

private String performance;

public Student(){}

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getAttendance() {
return attendance;
}

public void setAttendance(int attendance) {
this.attendance = attendance;
}

public double getAverageMarks() {
return averageMarks;
}

public void setAverageMarks(double averageMarks) {
this.averageMarks = averageMarks;
}

public String getPerformance() {
return performance;
}

public void setPerformance(String performance) {
this.performance = performance;
}

}