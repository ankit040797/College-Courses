package com.geekster.College.courses.controller;

import com.geekster.College.courses.model.Course;
import com.geekster.College.courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course newCourse){
        return courseService.addCourse(newCourse);
    }

    @GetMapping("courses")
    public List<Course> getCourse(){
        return courseService.getCourse();
    }

    @PutMapping("course/id/{id}")
    public String updateCourse(@RequestParam String duration, @PathVariable Long id){
        return courseService.updateCourse(duration,id);
    }

    @DeleteMapping("course/id/{id}")
    public String deleteCourse(@PathVariable Long id){
        return courseService.deleteCourse(id);
    }
}
