package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.student;
import com.example.project.service.studentservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class studentcontroller {
@Autowired
studentservice ser;
@PostMapping("/post student")
public student addstudent(@RequestBody student var)
    
{
    return ser.saveData(var);
}
@GetMapping("/ get all students")
public List<student>getStudents(){
    return ser.getStudents();
}
@GetMapping("/get/{id}")
public student getbyid(@PathVariable int id)
{
    return ser.getByid(id);
}
@DeleteMapping("/delete/{id}")
public student dleteStudent(@PathVariable int id) 
{
    return ser.delete(id);
}   
}package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.student;
import com.example.project.service.studentservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class studentcontroller {
@Autowired
studentservice ser;
@PostMapping("/post student")
public student addstudent(@RequestBody student var)
    
{
    return ser.saveData(var);
}
@GetMapping("/ get all students")
public List<student>getStudents(){
    return ser.getStudents();
}
@GetMapping("/get/{id}")
public student getbyid(@PathVariable int id)
{
    return ser.getByid(id);
}
@DeleteMapping("/delete/{id}")
public student dleteStudent(@PathVariable int id) 
{
    return ser.delete(id);
}   
}