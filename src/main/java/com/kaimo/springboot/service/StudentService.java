package com.kaimo.springboot.service;

import com.kaimo.springboot.student.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        10L,
                        "Andrea",
                        "Caimi",
                        LocalDate.of(1982, Month.SEPTEMBER,7),
                        39,
                        "email"
                )
        );
    }

}
