package com.example.StudentRegistrationSpringBoot.Student.Controller;


import com.example.StudentRegistrationSpringBoot.Student.Domain.Student;
import com.example.StudentRegistrationSpringBoot.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    @PutMapping(path = "{id}")
    public void updateStudent(@PathVariable("id")int id, 
                              @RequestParam(required = false)String name, 
                              @RequestParam(required = false)String email,
                              @RequestParam(required = false)String surname,
                              @RequestParam(required = false)String studentNumber,
                              @RequestParam(required = false)LocalDate birthday){
        studentService.updateStudent(id,name,email,surname,studentNumber,birthday);
    }

    @DeleteMapping(path ="{id}")
    public void  deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);

    }
}
