package com.StudentRegistation.StudentRegistation.services;

import com.StudentRegistation.StudentRegistation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailServices {
    @Autowired
    StudentRepository studentRepository;

//    public DetailServices(){
//        this.studentRepository = new StudentRepository();
//    }

    public String getStudentById(int id){
        return studentRepository.getStudentById(id);
    }
}
