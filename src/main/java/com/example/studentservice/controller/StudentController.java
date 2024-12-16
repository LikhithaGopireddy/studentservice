package com.example.studentservice.controller;

import com.example.studentservice.entity.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
//    @GetMapping("/availability")
//    public String checkSeatAvailability() {
//        return studentService.checkAvailability();
//    }
}
