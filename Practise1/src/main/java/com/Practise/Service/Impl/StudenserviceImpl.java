package com.Practise.Service.Impl;

import com.Practise.Exception.ResourceNotFoundException;
import com.Practise.Model.Students;
import com.Practise.Repository.StudentRepository;
import com.Practise.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudenserviceImpl implements studentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Students createStudents(Students students) {
        return studentRepository.save(students);
    }

    @Override
    public List<Students> getallstudents() {
        return studentRepository.findAll();
    }

    @Override
    public Students getsinglestudents(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No user found"));
    }

    @Override
    public Students updateStudent(Long id) {
        return null;
    }

    @Override
    public Students deleteStudent(Long id) {
        return null;
    }
}
