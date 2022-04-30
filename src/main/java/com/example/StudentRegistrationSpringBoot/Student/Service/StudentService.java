package com.example.StudentRegistrationSpringBoot.Student.Service;

import com.example.StudentRegistrationSpringBoot.Student.Domain.Student;
import com.example.StudentRegistrationSpringBoot.Student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
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
    @Transactional
    public void updateStudent(int id, String name, String email, String surname, String studentNumber, LocalDate birthday){
        Student student = studentRepository.findById(id).orElseThrow(()->
                new IllegalStateException("Student with id "+id+" does not found"));

            student.setName(name);
            student.setEmail(email);
            student.setStudentNumber(studentNumber);
            student.setSurname(surname);
            student.setBirthday(birthday);

    }
    public void deleteStudent(int id){
        boolean studentExist = studentRepository.existsById(id);
        studentRepository.deleteById(id);
        if (!studentExist){
            throw new IllegalStateException("Student with id"+id+" does not exists");
        }

    }
}
