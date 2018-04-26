package StudentList.DemoApril25.service;

import StudentList.DemoApril25.dao.StudentDao;
import StudentList.DemoApril25.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    public List<Student> getStudentsReverse() {
        return studentDao.getStudentsReverse();
    }
}
