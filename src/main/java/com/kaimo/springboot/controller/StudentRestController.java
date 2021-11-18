package com.kaimo.springboot.controller;

import com.kaimo.springboot.service.StudentService;
import com.kaimo.springboot.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rest")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

}
