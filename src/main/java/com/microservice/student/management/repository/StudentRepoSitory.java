package com.microservice.student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservice.student.management.entity.Student;

@Repository
public interface StudentRepoSitory extends JpaRepository<Student, Integer>{

	@Query("SELECT MAX(s.id) FROM Student s")
	Integer findMaxId();
}
