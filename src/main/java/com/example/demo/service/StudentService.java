package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

    Page<Student> getEmpbyPage(int currentpage,int totalpage);
}
