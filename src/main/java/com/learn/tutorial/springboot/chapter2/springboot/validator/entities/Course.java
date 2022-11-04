package com.learn.tutorial.springboot.chapter2.springboot.validator.entities;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

// Using artifact spring-boot-starter-validation
@Data
public class Course {
    private long id;
    private String name;
    private String category;

    @Min(value = 1, message = "A course should have a minimum rating of 1")
    @Max(value = 5, message = "A course should have a maximum rating of 5")
    private int rating;
}
