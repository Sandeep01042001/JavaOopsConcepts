package repository;

import java.util.HashMap;

public class StudentRepository {
    HashMap<Integer, String> studentDB;

    public StudentRepository(){
        this.studentDB = new HashMap<>();
    }

    public String getStudentById(int id){
        return this.studentDB.get(id);
    }
    public int getTotalStudents(){
        return this.studentDB.size();
    }
    public void save(int id, String name){
        this.studentDB.put(id, name);
    }
}
