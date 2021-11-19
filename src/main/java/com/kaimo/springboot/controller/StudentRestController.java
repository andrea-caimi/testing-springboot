package com.kaimo.springboot.controller;

import com.kaimo.springboot.service.StudentService;
import com.kaimo.springboot.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "/rest/v1")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }


    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) throws Exception {
        studentService.insertStudent(student);
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student) throws Exception {
        studentService.updateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
    }

}
