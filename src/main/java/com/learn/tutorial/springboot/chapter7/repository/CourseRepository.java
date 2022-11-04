package com.learn.tutorial.springboot.chapter7.repository;

import com.learn.tutorial.springboot.chapter7.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    Iterable<Course> findAllByCategory(String category);
}
