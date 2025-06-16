package services;

import repository.StudentRepository;

public class RagistationServices {
    StudentRepository studentRepository;
    public RagistationServices(){
        this.studentRepository = new StudentRepository();
    }

    public void saveStudent(String name){
        int id = studentRepository.getTotalStudents()+1;
        studentRepository.save(id, name);
    }
}
