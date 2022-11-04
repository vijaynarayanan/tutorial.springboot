package com.learn.tutorial.springboot.chapter7.controller;

import com.learn.tutorial.springboot.chapter7.entities.Course;
import com.learn.tutorial.springboot.chapter7.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/courses/")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public Iterable<Course> getAllCourses() {
        return courseService.getCourses();
    }

    @GetMapping("{id}")
    public Optional<Course> getCourseById(@PathVariable("id") long courseId) {
        return courseService.getCourseById(courseId);
    }

    @GetMapping("category/{name}")
    public Iterable<Course> getCourseByCategory(@PathVariable("name") String category) {
        return courseService.getCoursesByCategory(category);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") long courseId, @RequestBody Course course) {
        courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("{id}")
    void deleteByCourseId(@PathVariable("id") long courseId) {
        courseService.deleteByCourseId(courseId);
    }

    @DeleteMapping
    void deleteCourses() {
        courseService.deleteCourses();
    }
}
