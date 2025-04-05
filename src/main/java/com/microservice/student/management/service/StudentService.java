package com.microservice.student.management.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.student.management.dto.StudentDTO;
import com.microservice.student.management.entity.Student;
import com.microservice.student.management.repository.StudentRepoSitory;

@Service
public class StudentService {

	@Autowired
	private StudentRepoSitory studentRepoSitory;
	
	public List<StudentDTO> getAllStudents() {
		
		 return studentRepoSitory.findAll()
				 .stream().map(e->e.mapToDto()).collect(Collectors.toList());
	}
	
	public StudentDTO getStudentById(int id) {
		 return studentRepoSitory.findById(id).get().mapToDto();
	}
	
	public void saveStudent(StudentDTO student) {
		Student st = student.mapToStudent();
		int maxId = studentRepoSitory.findMaxId()!=null?studentRepoSitory.findMaxId():0;
		st.setId(maxId+1);
		studentRepoSitory.save(st);
	}
}
