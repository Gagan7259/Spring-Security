package Service;

import Model.Student;
import Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    //grt all students
    public List<Student> getallstudents() {
        return studentRepository.findAll();
    }

    //create student
    public void Createstudent(Student student) {
        studentRepository.save(student);
    }

    //update student
    public void Upadatestudent(Student student) {
        studentRepository.save(student);
    }

    //Delete student
    public void DeleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
