package com.springtest.spring_test.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jamal = new Student(
                    "jamal",
                    "jamal@jamal.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student bigg = new Student(
                    "bigg",
                    "bigg@bigg.com",
                    LocalDate.of(2002, Month.MARCH, 5)
            );

            repository.saveAll(List.of(jamal, bigg));
        };
    }
}
