package com.learn.tutorial.springboot.chapter3.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "DEPARTMENT_ID")
    private int departmentId;
}
