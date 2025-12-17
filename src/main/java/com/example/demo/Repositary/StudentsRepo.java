package com.example.demo.Repositary;

import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.Repositary;
import org.springframework.stereotype.Repositary;

@Repositary
public interface StudentsRepositary extends jpaRepositary<StudentEntity,Integer>{

}