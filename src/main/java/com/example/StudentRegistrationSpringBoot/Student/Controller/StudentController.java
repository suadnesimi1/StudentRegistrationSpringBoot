package com.example.StudentRegistrationSpringBoot.Student.Controller;


import com.example.StudentRegistrationSpringBoot.Student.Domain.Student;
import com.example.StudentRegistrationSpringBoot.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/registration")
public class StudentController {
    @Autowired
    StudentService studentService;



    @GetMapping(path = "students")
    public List<Student>getStudent(){
        return studentService.getStudent();
    }
    @PostMapping(path = "add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
