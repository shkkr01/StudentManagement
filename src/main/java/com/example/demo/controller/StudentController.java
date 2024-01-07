package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler methods to handle list of students and return model and view
    @GetMapping("/students")
    @CrossOrigin
    public String listStudents(Model model) {
       // model.addAttribute("students", studentService.getAllStudents());
        getPaggination(0,model);
        return "students.html";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student.html";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";


    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student.html";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
        //get student by id from database
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        //save the updated object to database
        studentService.updateStudent(existingStudent);
        return "redirect:/students";

    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";


    }
    @GetMapping("/page/{pageno}")
    public String getPaggination(@PathVariable int pageno,Model model){
        Page<Student> emplist=studentService.getEmpbyPage(pageno,4);
        model.addAttribute("students",emplist);
        model.addAttribute("currentPage",pageno);
        model.addAttribute("totalPage",emplist.getTotalPages());
        model.addAttribute("totalItem",emplist.getTotalElements());

        return "students.html";

    }

}
