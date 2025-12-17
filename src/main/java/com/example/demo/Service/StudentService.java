package com.example.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.project.entity.student;
@Service
public class studentservice {
    Map<Integer,student> details=new HashMap<>(); 
public student saveData(student var){
    
    details.put(var.getId(),var);
    return var; 
      } 
      public List<student>getStudents(){
      return new ArrayList<>(details.values());
      }
      public student getByid(int id) {
        if (details.containsKey(id)){
            return details.get(id);
        }
        else{
            return null;
        }
      }
      public student delete(int id)
      {
        details.remove(id);
        return details.get(id);
      }

    
}