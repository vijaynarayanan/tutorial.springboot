package com.learn.tutorial.springboot;

import com.learn.tutorial.springboot.chapter3.entities.Department;
import com.learn.tutorial.springboot.chapter3.repository.DepartmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ApplicationTableTests {
    @Autowired
    DepartmentRepository departmentRepository;

    @Test
    public void createDepartment() {
        Department department = new Department("Instrumentation");
        Department savedDepartment = departmentRepository.save(department);
        System.out.println("Saved department Id " + savedDepartment.getDepartmentId());
        assertThat(departmentRepository.findById(savedDepartment.getDepartmentId()).get()).isEqualTo(department);
    }

    @Test
    public void findAllDepartments() {
        System.out.println(Arrays.asList(departmentRepository.findAll()));
        assertThat(Arrays.asList(departmentRepository.findAll()).size()).isEqualTo(3);
    }
}
