package util;

import java.io.FileWriter;
import java.io.IOException;

import data.Student;
import service.StudentService;

public class DataWriter {

    public static void write(StudentService students) {
        try (FileWriter file = new FileWriter("Users.txt")) {

            for (Student student : students.getAll()) {
                file.write(student.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

}
