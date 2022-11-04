package com.learn.tutorial.springboot;

import com.learn.tutorial.springboot.test.EmployeeService;
import com.learn.tutorial.springboot.test.PropertyTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
@Slf4j
public class Application {
    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);


        EmployeeService employeeService = context.getBean(EmployeeService.class);
        // The output as "1" proves the fact that when you use a Component,
        // then if the component has any other beans as fields, then they are also initialized by spring.
        // But they need to have a constructor for initialization. Setter/Getter don't do the job.
        System.out.println(employeeService.getEmployee().getEmployeeId());
        
        System.out.println(context.getBean(PropertyTest.class).getName());
    }

}
