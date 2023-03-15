package com.example.student.controller;

import com.example.student.dto.StudentDto;
import com.example.student.dto.StudentName;
import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/retrieve-student")
    public StudentDto retrieveStudent(@RequestBody @Valid StudentName studentName)
    {

        System.out.println("printing");
        System.out.println(studentName.getStudentName());
        Student student = new Student();

        student.setStudentName(studentName.getStudentName());
        Student student1 = studentService.addStudent(student);


        return StudentDto.builder().studentId(student1.getStudentNumber()).studentName(student1.getStudentName()).build();
    }
}
