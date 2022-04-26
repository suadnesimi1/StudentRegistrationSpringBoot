package com.example.StudentRegistrationSpringBoot.Student.Service;

import com.example.StudentRegistrationSpringBoot.Student.Domain.Student;
import com.example.StudentRegistrationSpringBoot.Student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private  StudentRepository studentRepository;


    public List<Student> getStudent(){
        return studentRepository.findAll();
    }
    public void addStudent(Student student){
        studentRepository.save(student);
    }
}
