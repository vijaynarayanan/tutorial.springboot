package com.learn.tutorial.springboot.chapter2.springboot.validator;

import com.learn.tutorial.springboot.chapter2.springboot.validator.entities.Course;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Component
@Slf4j
public class CourseCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course();
        course.setId(1);
        course.setRating(9);
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Course>> violations = validator.validate(course);
        violations.forEach((violation) -> log.error("A constraint violation has occured. Violation details [{}]", violation));
    }
}
