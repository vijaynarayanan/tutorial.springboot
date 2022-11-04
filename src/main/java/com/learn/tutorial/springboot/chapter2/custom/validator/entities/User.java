package com.learn.tutorial.springboot.chapter2.custom.validator.entities;

import com.learn.tutorial.springboot.chapter2.custom.validator.Password;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String userName;

    @Password
    private String password;
}
