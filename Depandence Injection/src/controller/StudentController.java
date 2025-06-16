package controller;

import services.DetailsServices;
import services.RagistationServices;

import java.util.Scanner;

public class StudentController {
    DetailsServices detailsServices;
    RagistationServices ragistationServices;
    Scanner scn;

    public StudentController(){
        this.detailsServices = new DetailsServices();
        this.ragistationServices = new RagistationServices();
        this.scn = new Scanner(System.in);
    }

    public void startProgram(){
        while(true){
            System.out.println("What you want to do\n");
            System.out.println("If you seen student details plz enter 1\n");
            System.out.println("If you register the student plz enter 2\n");
            int n = scn.nextInt();
            if(n == 1){
                System.out.println("plz enter student id !!");
                int id = scn.nextInt();
                String name = detailsServices.getStudentById(id);
                if(name == null){
                    System.out.println(name);
                    System.out.println("Plz enter valid id here !!");
                }else{
                    System.out.println(name);;
                    System.out.println("Student details fetch successfully !! ");
                }
            }else if(n==2){
                System.out.println("Plz enter the name !!");
                String name = scn.next();
                ragistationServices.saveStudent(name);
                System.out.println("Registation  Successfully !!");
            }else{
                System.out.println("Plz enter Valid input !!");
            }
        }
    }
}
