package Controller;

import Model.Student;
import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //api

    //get all students
    @GetMapping("/students")
    public List<Student> getallstudent() {
        return studentService.getallstudents();
    }

    //Create student
    @PostMapping("/student")
    public void createStudents(@RequestBody Student student) {
        studentService.Createstudent(student);

    }

    //Update studens
    @PutMapping("/students")
    public void Updatestudent(@RequestBody Student student) {
        studentService.Upadatestudent(student);
    }

    //delete student
    @DeleteMapping("/students/{id}")
    public void Deletestudents(@PathVariable Integer id) {
        studentService.DeleteStudent(id);
    }
}
