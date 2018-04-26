package StudentList.DemoApril25.dao;

import StudentList.DemoApril25.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDao {
    
    List<Student> studentList = new ArrayList<>();

    public StudentDao() {
        Student azi = new Student("Azi", "The Boss", 123);
        Student mayur = new Student("Mayur", "Maisuria", 111);
        studentList.add(azi);
        studentList.add(mayur);
    }

    public List<Student> getStudents() {
        return studentList;
    }
}
