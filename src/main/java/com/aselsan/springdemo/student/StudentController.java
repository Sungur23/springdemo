package com.aselsan.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

	@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //	@GetMapping
//	public List<Student> getStudents(){
//		return List.of(new Student(1L,"Ahmet","asungur@aselsan.com.tr", LocalDate.now(),28));
//	}
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
