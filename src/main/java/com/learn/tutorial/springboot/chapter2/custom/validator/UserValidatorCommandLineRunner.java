package com.learn.tutorial.springboot.chapter2.custom.validator;

import com.learn.tutorial.springboot.chapter2.custom.validator.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Component
@Slf4j
public class UserValidatorCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("sbip1", "sbip");
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user1);
        violations.forEach((violation) -> log.error("A password policy violation. Violation details [{}]", violation));

        User user2 = new User("sbip02", "Sbip01$4UDfg");
        violations = validator.validate(user2);
        if (violations.isEmpty()) {
            log.info("Password adheres to the policy for {}", user2);
        } else {
            violations.forEach((violation) -> log.error("A password policy violation. Violation details [{}]", violation));
        }

    }
}
