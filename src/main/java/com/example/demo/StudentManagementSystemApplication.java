package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
//		Student student = new Student("Shubham","Kumar","shubham.gmail.com");
//		studentRepo.save(student);
//		Student student1 = new Student("Swetanshu","shekhar","swetanshu.gmail.com");
//		studentRepo.save(student1);
//		Student student2 = new Student("Prassana","Prakhar","prasan.gmail.com");
//		studentRepo.save(student2);

    }
}
