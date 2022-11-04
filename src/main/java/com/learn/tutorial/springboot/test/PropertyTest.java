package com.learn.tutorial.springboot.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class PropertyTest {
    @Value("${test.property}")
    private String name;
}
