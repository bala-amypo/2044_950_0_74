package com.example.demo.repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface studentrepo extends JpaRepository<student,Integer>{

}