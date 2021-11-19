package com.kaimo.springboot.service;

import com.kaimo.springboot.dao.StudentRepository;
import com.kaimo.springboot.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public void insertStudent(Student student) throws Exception {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new Exception(String.format("email %s is already present",student.getEmail()));
        }
        studentRepository.save(student);
    }

    public void updateStudent(Student student) throws Exception {
        Optional<Student> studentById = studentRepository.findById(student.getId());
        if(!studentById.isPresent()){
            throw new Exception(String.format("Student not found",student.getEmail()));
        }
        studentRepository.save(student);
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
