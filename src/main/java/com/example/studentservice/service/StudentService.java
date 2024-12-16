package com.example.studentservice.service;

import com.example.studentservice.entity.Student;
import java.util.List;

public interface StudentService {
    String addStudent(Student student);
    List<Student> getAllStudents();
}
