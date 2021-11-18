package com.kaimo.springboot.service;

import com.kaimo.springboot.dao.StudentRepository;
import com.kaimo.springboot.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public void upsertStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
