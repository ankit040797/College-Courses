package com.geekster.College.courses.service;

import com.geekster.College.courses.model.Student;
import com.geekster.College.courses.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;
    public String addStudent(Student newStudent) {
        iStudentRepo.save(newStudent);
        return "added";
    }


    public List<Student> getStudent() {
        return iStudentRepo.findAll();
    }

    public String updateStudent(Student student) {
        iStudentRepo.save(student);
        return "update";
    }

    public String deleteStudent(Long id) {
        iStudentRepo.deleteById(id);
        return "delete";
    }
}
