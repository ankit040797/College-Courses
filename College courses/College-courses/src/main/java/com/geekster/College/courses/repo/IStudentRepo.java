package com.geekster.College.courses.repo;

import com.geekster.College.courses.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Long> {
}
