package seminar_5;

import java.util.ArrayList;
import java.util.List;

import data.Student;
import service.StudentService;
import util.DataWriter;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student(1, "Svetlana", 4.2f, 9);
        students.add(student);
        students.add(new Student(2, "Lana", 4.8f, 7));
        StudentService studentService = new StudentService(students);
        DataWriter.write(studentService);
        // DataReader studenReader = new StudentService();
        // System.out.println(studenReader.fileReader());
    }
}
