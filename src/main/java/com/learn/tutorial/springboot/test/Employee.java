package com.learn.tutorial.springboot.test;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {
    private int employeeId = 1;
    private String employeeName = "Vijay";
}
