package com.learn.tutorial.springboot.chapter3.repository;

import com.learn.tutorial.springboot.chapter3.entities.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
    Iterable<Department> findAllByCategory(String category);

    Iterable<Department> findAllByCategoryOrderByDepartmentId(String category);

    boolean existsByDepartmentName(String departmentName);

    long countByCategory(String category);

    Iterable<Department> findByDepartmentNameOrCategory(String departmentName, String category);

    Iterable<Department> findByDepartmentNameStartsWith(String departmentName);

    Stream<Department> streamAllByCategory(String category);
}
