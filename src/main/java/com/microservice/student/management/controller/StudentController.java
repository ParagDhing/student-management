package com.microservice.student.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.student.management.dto.StudentDTO;
import com.microservice.student.management.service.StudentService;

@RestController
@RequestMapping("/student/v1")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<StudentDTO> getStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/single/{id}")
	@ResponseStatus(HttpStatus.OK)
	public StudentDTO getString(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/single")
	@ResponseStatus(HttpStatus.CREATED)
	public void getString(@RequestBody StudentDTO student) {
		studentService.saveStudent(student);
	}
}
