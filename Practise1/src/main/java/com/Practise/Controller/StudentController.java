package com.Practise.Controller;

import com.Practise.Model.Students;
import com.Practise.Service.Impl.StudenserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudenserviceImpl studenservice;

    //create student
    @PostMapping("/create")
    public ResponseEntity<Students> createstudent(@RequestBody Students students) {
        Students stud = studenservice.createStudents(students);
        return ResponseEntity.status(HttpStatus.CREATED).body(stud);
    }

    //get all students
    @GetMapping
    public ResponseEntity<List<Students>> getallstudent() {
        List<Students> st = studenservice.getallstudents();
        return ResponseEntity.ok(st);
    }

    //get single user
    @GetMapping("/{id}")
    public ResponseEntity<Students> getsinglestyu(@PathVariable Long id) {
        Students user = studenservice.getsinglestudents(id);
        return ResponseEntity.ok(user);
    }

    //edit students
    @PutMapping("/st/{id}")
    public Students updatestudentss(@PathVariable Long id) {
        return studenservice.updateStudent(id);

    }

}
