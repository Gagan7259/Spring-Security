package com.Practise.Service;

import com.Practise.Model.Students;

import java.util.List;
import java.util.Optional;

public interface studentService {

    //create student
    Students createStudents(Students students);


    //getall students
    List<Students> getallstudents();

    //get single students
    Students getsinglestudents(Long id);

    ///update students
    Students updateStudent(Long id);

    //delete students
    Students deleteStudent(Long id);
}
