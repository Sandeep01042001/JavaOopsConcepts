package com.StudentRegistation.StudentRegistation.services;


import com.StudentRegistation.StudentRegistation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class RegistationServices {
    @Autowired
    StudentRepository studentRepository;
//    public RegistationServices(){
//        this.studentRepository = new StudentRepository();
//    }


    public void saveStudent(String name){
        int id = studentRepository.totalStudent()+1;
        studentRepository.saveStudent(id,name);
    }

}
