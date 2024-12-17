package com.example.studentservice.service.impl;

import com.example.studentservice.entity.Student;
import com.example.studentservice.repository.StudentRepository;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student added successfully";
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


}
