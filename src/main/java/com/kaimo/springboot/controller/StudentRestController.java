package com.kaimo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kaimo.springboot.student.Student;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/rest")
public class StudentRestController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(10L, "Andrea", "Caimi", LocalDate.now(), 39, "email");
    }

}
