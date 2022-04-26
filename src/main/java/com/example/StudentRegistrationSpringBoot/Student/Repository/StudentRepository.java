package com.example.StudentRegistrationSpringBoot.Student.Repository;

import com.example.StudentRegistrationSpringBoot.Student.Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;




public interface StudentRepository extends JpaRepository<Student,Integer> {
}
