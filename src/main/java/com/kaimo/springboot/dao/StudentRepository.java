package com.kaimo.springboot.dao;

import com.kaimo.springboot.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public Optional<Student> findStudentByEmail(String email);

}
