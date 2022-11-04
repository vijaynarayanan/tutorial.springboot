package com.learn.tutorial.springboot;

import com.learn.tutorial.springboot.chapter3.entities.Department;
import com.learn.tutorial.springboot.chapter3.repository.DepartmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDepartmentRepository {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void getAllDepartments() {
        Iterable<Department> departments = departmentRepository.findAllByCategory("Computers");
        departments.forEach(System.out::println);
    }
}
