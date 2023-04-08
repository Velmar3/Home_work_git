package service;

import java.util.ArrayList;
import java.util.List;

import data.Student;

public class StudentService implements DataService<Student>{

    private List<Student> students = new ArrayList<>();
    
    public StudentService(List<Student> students) {
        this.students = students;
    }

    // Публичная Копия List<Student> students = new ArrayList<>();
    public List<Student> getAll(){
        List<Student> copy = new ArrayList<>();
        for (Student student : students) {
            copy.add(student);
        }
        return copy;
    }

    @Override
    public void add(Student user) {
        students.add(user);
        
    }

    @Override
    public void save() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void loading() {
        // TODO Auto-generated method stub
        
    }


    
}
