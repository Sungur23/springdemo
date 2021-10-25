package com.aselsan.springdemo.student;

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
            Student ahmet = new Student(
                    1L,
                    "Ahmet",
                    "asungur@aselsan.com.tr",
                    LocalDate.of(1993, Month.JANUARY, 15));
            repository.saveAll(List.of(ahmet));
        };
    }
}
