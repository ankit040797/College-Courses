package com.geekster.College.courses.service;

import com.geekster.College.courses.model.Course;
import com.geekster.College.courses.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo iCourseRepo;
    public String addCourse(Course newCourse) {
        iCourseRepo.save(newCourse);
        return "added";
    }

    public List<Course> getCourse() {
        return iCourseRepo.findAll();
    }

    public String updateCourse(String duration, Long id) {
        Course course = iCourseRepo.findById(id).orElseThrow();
        course.setDuration(duration);
        iCourseRepo.save(course);
        return "course update";
    }

    public String deleteCourse(Long id) {
        iCourseRepo.deleteById(id);
        return "course deleted";
    }
}
