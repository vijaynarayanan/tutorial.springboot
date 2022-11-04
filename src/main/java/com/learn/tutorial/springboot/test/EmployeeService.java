package com.learn.tutorial.springboot.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;


@Data
@AllArgsConstructor
@Service
public class EmployeeService {
    private Employee employee;

    private void validate() {
        System.out.println(employee.getEmployeeId());
    }
}
