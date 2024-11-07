package com.springtest.spring_test.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "jamal",
                        "jamal@jamal.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        24
                )
        );
    }
}
