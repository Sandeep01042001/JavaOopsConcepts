package services;

import repository.StudentRepository;

public class DetailsServices {
    StudentRepository studentRepository;
    public DetailsServices(){
        this.studentRepository = new StudentRepository();
    }

    public String getStudentById(int id){
        return studentRepository.getStudentById(id);
    }
}
