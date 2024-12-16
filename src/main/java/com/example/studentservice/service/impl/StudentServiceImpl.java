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

//    @Autowired
//    private RestTemplate restTemplate;



    @Override
    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student added successfully";
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


//    public String checkAvailability() {
//        String url = "http://localhost:8080/api/school/registrations"; // School Microservice URL
//        ResponseEntity<List> response = restTemplate.getForEntity(url, List.class);
//
//        int totalSeats = 25;
//        int registeredSeats = response.getBody().size();
//
//        if (registeredSeats >= totalSeats) {
//            return "Minimum criteria is filled. Registration is closed.";
//        }  else {
//            return "Seats left: " + (totalSeats - registeredSeats);
//        }
//    }

}
