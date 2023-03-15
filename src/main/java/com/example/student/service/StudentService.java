package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.Random;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student)
    {
        String id = generateRandomString();
        student.setStudentNumber(id);
        Student student1 = studentRepository.save(student);
        return student1;
    }

    private String generateRandomString() {

        String x = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";



        char[] JavaCharArray = new char[8];

        for (int i =0; i< JavaCharArray.length; i++)
        {
            JavaCharArray[i] = x.charAt(new Random().nextInt(10));
        }

        return JavaCharArray.toString();
    }


}
