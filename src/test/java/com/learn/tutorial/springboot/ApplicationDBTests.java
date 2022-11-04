package com.learn.tutorial.springboot;

import com.learn.tutorial.springboot.chapter3.entities.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootTest
public class ApplicationDBTests {
    @Autowired
    private DataSource dataSource;

    @Test
    public void checkDBConnection() throws SQLException {
        ResultSet rs = null;
        int numOfEmployees = 0;
        try (PreparedStatement preparedStatement = dataSource.getConnection().prepareStatement("select id, first_name, last_name, department_id from company.employees")) {
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setFirstName(rs.getString(2));
                employee.setLastName(rs.getString(3));
                employee.setDepartmentId(rs.getInt(4));
                System.out.println(employee);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }
}
