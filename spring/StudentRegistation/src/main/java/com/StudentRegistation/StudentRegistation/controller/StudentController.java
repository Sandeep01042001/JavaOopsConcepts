package com.StudentRegistation.StudentRegistation.controller;


import com.StudentRegistation.StudentRegistation.services.DetailServices;
import com.StudentRegistation.StudentRegistation.services.RegistationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    DetailServices detailServices;
    @Autowired
    RegistationServices registationServices;

//    public StudentController(){
//        this.detailServices = new DetailServices();
//        this.registationServices = new RegistationServices();
//    }

    @PostMapping("/save/{name}")
    public String saveName(@PathVariable String name) {
        registationServices.saveStudent(name);
        return "Your name is save the database !!";
    }

    @GetMapping("/get/{id}")
    public String getName(@PathVariable int id){
      String name = detailServices.getStudentById(id);
      return "Your student name is :"+ name;
    }


}
