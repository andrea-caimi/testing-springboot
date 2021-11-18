package com.kaimo.springboot.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Integer age;
    private String email;

    public Student() {
    }

    public Student(String name, String surname, LocalDate birthDate, Integer age, String email) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.age = age;
        this.email = email;
    }

    public Student(Long id, String name, String surname, LocalDate birthDate, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
