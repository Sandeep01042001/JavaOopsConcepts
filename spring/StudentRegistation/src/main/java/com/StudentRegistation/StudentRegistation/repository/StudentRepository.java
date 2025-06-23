package com.StudentRegistation.StudentRegistation.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class StudentRepository {
     HashMap<Integer, String> studentDB;

    public StudentRepository(){
        this.studentDB = new HashMap<>();
    }
    public String getStudentById(int id){
        return this.studentDB.get(id);
    }
    public void saveStudent(int id,String name){
        this.studentDB.put(id, name);
    }

    public int totalStudent(){
        return this.studentDB.size();
    }
}
