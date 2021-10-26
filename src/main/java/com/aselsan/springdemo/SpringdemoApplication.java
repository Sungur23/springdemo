package com.aselsan.springdemo;

import com.aselsan.springdemo.student.Student;
import com.aselsan.springdemo.student.StudentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World -   http://localhost:8080/api/v1/student";
	}

//	@GetMapping
//	public List<Student> hello(){
//		return List.of(new Student(1L,"Ahmet","asungur@aselsan.com.tr",LocalDate.now(),28));
//	}

//	@GetMapping
//	public String hello(){
//		return new Student(1L,"Ahmet","asungur@aselsan.com.tr",LocalDate.of(1993, Month.JANUARY,15),28).toString();
//	}
}
