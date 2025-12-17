package com.example.project.entity;

import java.time.LocalDate;
import jakarta.persistance.Entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GeneratedType;
import jakarta.persistance.*;

public class StudentEntity {
    @id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public student(){

}

public student(int id, String name, String email, LocalDate dob, float cgpa) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.cgpa = cgpa;
}

}