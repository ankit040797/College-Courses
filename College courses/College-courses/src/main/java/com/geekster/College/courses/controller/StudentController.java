package com.geekster.College.courses.controller;

import com.geekster.College.courses.model.Student;
import com.geekster.College.courses.repo.IStudentRepo;
import com.geekster.College.courses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public  String addStudent(@RequestBody Student newStudent){
        return studentService.addStudent(newStudent);
    }

    @GetMapping("students")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @PutMapping("student")
    public String updateStudent(@RequestBody Student student){
        return  studentService.updateStudent(student);
    }
    @DeleteMapping("student/id/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

}
