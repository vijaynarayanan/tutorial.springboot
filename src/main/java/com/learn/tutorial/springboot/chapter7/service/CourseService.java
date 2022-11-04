package com.learn.tutorial.springboot.chapter7.service;

import com.learn.tutorial.springboot.chapter7.entities.Course;

import java.util.Optional;

public interface CourseService {
    Course createCourse(Course course);

    Optional<Course> getCourseById(long id);

    Iterable<Course> getCoursesByCategory(String category);

    Iterable<Course> getCourses();

    void updateCourse(long courseId, Course course);

    void deleteByCourseId(long courseId);

    void deleteCourses();
}
