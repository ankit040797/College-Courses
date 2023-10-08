package com.geekster.College.courses.repo;

import com.geekster.College.courses.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
